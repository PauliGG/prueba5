package cl.awakelab.Evaluacion_Modulo5.controlador;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.Evaluacion_Modulo5.modelo.Administrativo;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/administrativo")
public class AdministrativoController {

	@Autowired
	ICrudService<Administrativo> crudService;
	
	@Autowired
	IAdicionalService<Administrativo> adicionalService;

	
	org.slf4j.Logger log = LoggerFactory.getLogger(AdministrativoController.class);

	@GetMapping("/listar")
	public String listar(ModelMap modelMap) {

		List<Administrativo> listar = crudService.listar();

		modelMap.put("listado", listar);

		log.info(">>> MENSAJE: Listado de Usuarios <<<");

		return "listarAdministrativos";
	}
	
	@GetMapping("/crear")
	public String crear() {

		return "crearAdministrativo";
		
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute("formAdministrativo") Administrativo dato) {
		
		crudService.crear(dato);
		
		log.info(">>> MENSAJE: Se ha creado un -Administrativo <<<");

		return "crearAdministrativo";
		
	}

	@GetMapping("/editar")
	public String editar(@PathParam("dato") Integer dato, ModelMap modelmap) {

		modelmap.put("editar", adicionalService.findbyUsuarioRunUsuario(dato));
		
		return "editarAdministrativo";
		
	}

	@PostMapping("/modificar")
	public String editar(@ModelAttribute("formAdministrativo") Administrativo dato) {
		
		crudService.modificar(dato);
		
		log.info(">>> MENSAJE: Se ha modificado un Administrativo <<<");

		return "editarAdministrativo";
		
	}
	
}
