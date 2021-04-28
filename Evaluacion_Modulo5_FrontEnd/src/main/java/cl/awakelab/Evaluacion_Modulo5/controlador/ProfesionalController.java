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

import cl.awakelab.Evaluacion_Modulo5.modelo.Profesional;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/profesional")
public class ProfesionalController {

	@Autowired
	ICrudService<Profesional> crudService;
	
	@Autowired
	IAdicionalService<Profesional> adicionalService;

	
	org.slf4j.Logger log = LoggerFactory.getLogger(ProfesionalController.class);

	@GetMapping("/listar")
	public String listar(ModelMap modelMap) {

		List<Profesional> listar = crudService.listar();

		modelMap.put("listado", listar);

		log.info(">>> MENSAJE: Listado de Profesionales <<<");

		return "listarProfesionales";
	}
	
	@GetMapping("/crear")
	public String crear() {

		return "crearProfesional";
		
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute("formProfesional") Profesional dato) {
		
		crudService.crear(dato);
		
		log.info(">>> MENSAJE: Se ha creado un Profesional <<<");

		return "crearProfesional";
		
	}

	@GetMapping("/editar")
	public String editar(@PathParam("dato") Integer dato, ModelMap modelmap) {

		modelmap.put("editar", adicionalService.findbyUsuarioRunUsuario(dato));
		
		return "editarProfesional";
		
	}

	@PostMapping("/modificar")
	public String editar(@ModelAttribute("formProfesional") Profesional dato) {
		
		crudService.modificar(dato);
		
		log.info(">>> MENSAJE: Se ha modificado un Profesional <<<");

		return "editarProfesional";
		
	}
	
}
