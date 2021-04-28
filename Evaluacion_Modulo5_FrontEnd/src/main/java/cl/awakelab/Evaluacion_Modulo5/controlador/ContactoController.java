package cl.awakelab.Evaluacion_Modulo5.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.Evaluacion_Modulo5.modelo.Contacto;

@Controller
@RequestMapping("/contacto") 
public class ContactoController {
		
		@GetMapping("/")
		public String metodo1() {		
			return "contacto";
		}
		
		@PostMapping("/PostContacto")
		public String metodo2 (@ModelAttribute("formContacto") Contacto contacto) {
			
			System.out.println(">>> INICIO DATOS CONTACTO <<<");
	        System.out.println(contacto.getConNombre());
	        System.out.println(contacto.getConMail());
	        System.out.println(contacto.getConTelefono());
	        System.out.println(contacto.getConMensaje());
	        System.out.println(contacto.getConGenero());
	        System.out.println(">>> FIN DATOS CONTACTO <<<");
	        
			return "contacto";
		}
}
