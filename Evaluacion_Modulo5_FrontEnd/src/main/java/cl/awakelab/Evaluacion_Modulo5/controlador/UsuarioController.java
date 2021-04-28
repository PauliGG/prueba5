package cl.awakelab.Evaluacion_Modulo5.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.Evaluacion_Modulo5.modelo.Usuario;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	ICrudService<Usuario> usuarioService;

	org.slf4j.Logger log = LoggerFactory.getLogger(UsuarioController.class);

	@GetMapping("/listar")
	public String listar(ModelMap modelMap) {

		List<Usuario> listar = usuarioService.listar();

		modelMap.put("listado", listar);

		log.info(">>> MENSAJE: Listado de Usuarios <<<");

		return "listarUsuarios";
	}
	
	@GetMapping("/crear")
	public String crear() {

		return "crearUsuario";
		
	}

}
