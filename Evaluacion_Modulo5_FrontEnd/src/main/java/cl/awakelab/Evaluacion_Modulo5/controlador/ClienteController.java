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

import cl.awakelab.Evaluacion_Modulo5.modelo.Cliente;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ICrudService<Cliente> crudService;
	
	@Autowired
	IAdicionalService<Cliente> adicionalService;

	
	org.slf4j.Logger log = LoggerFactory.getLogger(ClienteController.class);

	@GetMapping("/listar")
	public String listar(ModelMap modelMap) {

		List<Cliente> listar = crudService.listar();

		modelMap.put("listado", listar);

		log.info(">>> MENSAJE: Listado de clientes <<<");

		return "listarClientes";
	}
	
	@GetMapping("/crear")
	public String crear() {

		return "crearCliente";
		
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute("formCliente") Cliente dato) {
		
		crudService.crear(dato);
		
		log.info(">>> MENSAJE: Se ha creado un Cliente <<<");

		return "crearCliente";
		
	}

	@GetMapping("/editar")
	public String editar(@PathParam("dato") Integer dato, ModelMap modelmap) {

		modelmap.put("editar", adicionalService.findbyUsuarioRunUsuario(dato));
		
		return "editarCliente";
		
	}

	@PostMapping("/modificar")
	public String editar(@ModelAttribute("formCliente") Cliente dato) {
		
		crudService.modificar(dato);
		
		log.info(">>> MENSAJE: Se ha modificado un Cliente <<<");

		return "editarCliente";
		
	}
	
}
