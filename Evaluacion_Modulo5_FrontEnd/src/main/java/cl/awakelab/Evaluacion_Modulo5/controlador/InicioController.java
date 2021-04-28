package cl.awakelab.Evaluacion_Modulo5.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class InicioController {
	
	@GetMapping("/")   //Especifica la primera pagina que se carga
	public String metodo1() {
		
		return "inicio";   //muestra la pagina JSP , no se incluye extension .jsp
	}
	
	@GetMapping("/inicio")
	public String metodo2() {
		return "inicio";
	}
	
	@GetMapping("/login")
	public String metodo3() {
		return "login";
	}
		
	@GetMapping("/confirmLogout")
	public String confirm1() {
		return "confirm/confirmLogout";
	}
	
	@GetMapping("/error403jsp")
	public String error1() {
		return "error/error403";
	}
}
