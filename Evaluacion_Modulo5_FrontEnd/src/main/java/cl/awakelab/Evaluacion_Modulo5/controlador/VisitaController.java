package cl.awakelab.Evaluacion_Modulo5.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.Evaluacion_Modulo5.modelo.Visita;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/visita")
public class VisitaController {

	@Autowired
	ICrudService<Visita> crudService;

	org.slf4j.Logger log = LoggerFactory.getLogger(VisitaController.class);

	@GetMapping("/listar")
	public String listar(ModelMap modelMap) {

		List<Visita> listar = crudService.listar();

		modelMap.put("listado", listar);

		log.info(">>>MENSAJE: Listado de Capacitaciones <<<");

		return "listarVisitas";
	}

	@GetMapping("/crear")
	public String crear() {

		return "crearVisita";
		
	}

	@PostMapping("/crear")
	public String crearPost(@ModelAttribute("formVisita") Visita dato) {
		
		crudService.crear(dato);
		
		log.info(">>>MENSAJE: Se ha creado capacitacion <<<");

		return "crearVisita";
		
	}
	
}
