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

import cl.awakelab.Evaluacion_Modulo5.modelo.Rol;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/rol")
public class RolController {

	@Autowired
	ICrudService<Rol> iRolService;
	
	@Autowired
	IAdicionalService<Rol> iAdicionalRolService;

	org.slf4j.Logger log = LoggerFactory.getLogger(RolController.class);

	@GetMapping("/listar")
	public String metodo1(ModelMap modelMap) {

		List<Rol> listarRol = iRolService.listar();

		modelMap.put("listado", listarRol);

		log.info(">>>MENSAJE: Listado de Accesos <<<");

		return "listarRol";
	}

	@GetMapping("/crear")
	public String metodo2() {

		return "crearRol";
	}

	@PostMapping("/formulario")
	public String metodo3(@ModelAttribute("formRol") Rol rol) {
		
		iRolService.crear(rol);
		
		log.info(">>>MENSAJE: Se ha creado capacitacion <<<");

		return "crearRol";
	}
	
	@GetMapping("/editarRol")
	public String metodo22(@PathParam("dato") Integer dato, ModelMap modelmap) {

		modelmap.put("editar", iAdicionalRolService.findbyUsuarioRunUsuario(dato));
		
		return "editarRol"; 
		
	}

	@PostMapping("/editarRol")
	public String metodo333(@ModelAttribute("formRol") Rol dato) {
		
		iRolService.crear(dato);
		
		log.info(">>>MENSAJE: Se ha actualizado capacitacion <<<");

		return "editarRol";
	}
	
	
}
