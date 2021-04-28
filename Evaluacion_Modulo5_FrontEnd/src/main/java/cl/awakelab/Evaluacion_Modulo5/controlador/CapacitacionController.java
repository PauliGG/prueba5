package cl.awakelab.Evaluacion_Modulo5.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.Evaluacion_Modulo5.modelo.Capacitacion;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/capacitacion")
public class CapacitacionController {

	@Autowired
	ICrudService<Capacitacion> crudService;

	org.slf4j.Logger log = LoggerFactory.getLogger(CapacitacionController.class);

	@GetMapping("/listar")
	public String metodo1(ModelMap modelMap) {

		List<Capacitacion> listarCapacitaciones = crudService.listar();

		modelMap.put("listado", listarCapacitaciones);

		log.info(">>>MENSAJE: Listado de Capacitaciones <<<");

		return "listarCapacitaciones";
	}

	@GetMapping("/crear")
	public String metodo2() {

		return "crearCapacitacion";
		
	}

	@PostMapping("/crear")
	public String metodo3(@ModelAttribute("formCapacitacion") Capacitacion dato) {
		
		crudService.crear(dato);
		
		log.info(">>>MENSAJE: Se ha creado capacitacion <<<");

		return "crearCapacitacion";
		
	}
}
