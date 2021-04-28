package cl.awakelab.Evaluacion_Modulo5.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.Evaluacion_Modulo5.modelo.Pago;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/pago")
public class PagoController {

	@Autowired
	ICrudService<Pago> crudService;

	org.slf4j.Logger log = LoggerFactory.getLogger(PagoController.class);

	@GetMapping("/listar")
	public String listar(ModelMap modelMap) {

		List<Pago> listar = crudService.listar();

		modelMap.put("listado", listar);

		log.info(">>>MENSAJE: Listado de Pagos <<<");

		return "listarPagos";
	}

	@GetMapping("/crear")
	public String crear() {

		return "crearPago";
		
	}

	@PostMapping("/crear")
	public String crearPost(@ModelAttribute("formPago") Pago dato) {
		
		crudService.crear(dato);
		
		log.info(">>>MENSAJE: Se ha creado un pago <<<");

		return "crearPago";
		
	}
}
