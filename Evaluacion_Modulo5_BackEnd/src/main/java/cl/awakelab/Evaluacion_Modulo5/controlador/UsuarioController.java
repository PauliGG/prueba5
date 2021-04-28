package cl.awakelab.Evaluacion_Modulo5.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.Evaluacion_Modulo5.modelo.Usuario;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

	@Autowired
	ICrudService<Usuario> crudService;
	
	@Autowired
	IAdicionalService<Usuario> adicionalService;

	@GetMapping("/listar")
	public ResponseEntity<List<Usuario>> listar(){
		
		try {	
			List<Usuario> listar = new ArrayList<Usuario>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Usuario>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Usuario>>(listar ,HttpStatus.OK);
			
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<List<Usuario>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}

	} 

	@PostMapping("/crear")
	public ResponseEntity<Usuario> crear(@RequestBody  Usuario nuevo) {
		
		try {
			
			System.out.println("antes ");
			
			Usuario crear = new Usuario();
		
			crear = crudService.crear(nuevo);
			
			System.out.println("despues ");
			
			return new ResponseEntity<Usuario>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		
	}
	
	@PostMapping("/modificar")
	public ResponseEntity<Usuario> modificar(@RequestBody  Usuario nuevo) {
		
		try {
			
			Usuario modificar = new Usuario();
		
			modificar = crudService.modificar(nuevo);
			
			return new ResponseEntity<Usuario>(modificar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		
	}
	
	@GetMapping("/buscar/{dato}")
	public ResponseEntity<Usuario> buscar(@PathVariable Integer dato) {
			
		try {
			
			Usuario buscar = new Usuario();
		
			buscar = adicionalService.findbyUsuarioRunUsuario(dato);
			
			return new ResponseEntity<Usuario>(buscar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
}
