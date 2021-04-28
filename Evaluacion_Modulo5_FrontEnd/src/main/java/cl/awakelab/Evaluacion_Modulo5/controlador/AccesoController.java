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

import cl.awakelab.Evaluacion_Modulo5.modelo.Acceso;
import cl.awakelab.Evaluacion_Modulo5.modelo.Rol;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/acceso")
public class AccesoController {

	@Autowired
	ICrudService<Acceso> accesoCrudService;
	
	@Autowired
	ICrudService<Rol> rolCrudService;
	
	@Autowired
	IAdicionalService<Acceso> adicionalService;

	org.slf4j.Logger log = LoggerFactory.getLogger(AccesoController.class);

	@GetMapping("/listar")
	public String metodo1(ModelMap modelMap) {

		List<Acceso> listarAccesos = accesoCrudService.listar();

		modelMap.put("listado", listarAccesos);

		log.info(">>>MENSAJE: Listado de Accesos <<<");

		return "listarAccesos";
	}

	@GetMapping("/crear")
	public String metodo2() {

		return "crearAcceso";
		
	}

	@PostMapping("/crear")
	public String metodo3(@ModelAttribute("formAcceso") Acceso dato) {
		
		accesoCrudService.crear(dato);
		
		log.info(">>>MENSAJE: Se ha creado capacitacion <<<");

		return "crearAcceso";
		
	}
	
	@GetMapping("/crear2")
	public String crear2() {

		return "crearAcceso2";
		
	}

	@PostMapping("/formulario2")
	public String crear2(@ModelAttribute("formAcceso") Acceso dato) {

		accesoCrudService.crear(dato);

		log.info(">>>MENSAJE: Se ha creado acceso <<<");

		return "crearAcceso2";
		
	}
	
	@GetMapping("/editar")
	public String editarGet3(@PathParam("dato") Integer dato, ModelMap modelmap) {

		modelmap.put("editar", adicionalService.findbyUsuarioRunUsuario(dato));
		
		System.out.println("entro a editar");
		
		return "editarAcceso";
		
	}

	@PostMapping("/editar")
	public String editarPost3(@ModelAttribute("formAcceso") Acceso dato) {
		
		System.out.println("entro a modifi");
		accesoCrudService.modificar(dato);
		System.out.println("entro a modificar2");
		log.info(">>> MENSAJE: Se ha creado un acceso <<<");

		return "editarAcceso";
		
		
	}

}
