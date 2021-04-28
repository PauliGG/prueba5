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

import cl.awakelab.Evaluacion_Modulo5.modelo.Chequeo;
import cl.awakelab.Evaluacion_Modulo5.modelo.Profesional;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalChequeoService;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/chequeo")
public class ChequeoController {

	@Autowired
	ICrudService<Chequeo> crudService;
	
	@Autowired
	IAdicionalService<Chequeo> adicionalService;
	
	@Autowired
	IAdicionalChequeoService<Chequeo> adicionalChequeoService;

	org.slf4j.Logger log = LoggerFactory.getLogger(ChequeoController.class);

	@GetMapping("/listar")
	public String listar(ModelMap modelMap) {

		List<Chequeo> listar = crudService.listar();

		modelMap.put("listado", listar);

		log.info(">>>MENSAJE: Listado de Capacitaciones <<<");

		return "listarChequeos";
	}

	@GetMapping("/crear")
	public String crear() {

		return "crearChequeo";
		
	}
	
	@PostMapping("/crear")
	public String metodo3(@ModelAttribute("formVisita") Chequeo dato) {
		
		crudService.crear(dato);
		
		log.info(">>>MENSAJE: Se ha creado capacitacion <<<");

		return "crearChequeo";
		
	}
	
	@GetMapping("/buscar")
	public String editar(@PathParam("dato") Integer dato, ModelMap modelmap) {

		modelmap.put("editar", adicionalService.findbyUsuarioRunUsuario(dato));
		
		return "editarProfesional";
		
	}

	@PostMapping("/modificar")
	public String editar(@ModelAttribute("formProfesional") Chequeo dato) {
		
		crudService.modificar(dato);
		
		log.info(">>> MENSAJE: Se ha modificado un Profesional <<<");

		return "editarProfesional";
		
	}
	
	//@GetMapping("/buscarListar")
	//public String buscarListar(@PathParam("dato") Integer dato, ModelMap modelMap) {

		
		//List<Chequeo> listar = adicionalChequeoService.findChequeoByClienteRutCliente(dato);

		//modelMap.put("listado", listar);
		
		//return null;
		
	//}
 	
}
