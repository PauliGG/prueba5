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

import cl.awakelab.Evaluacion_Modulo5.modelo.Cliente;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	@Autowired
	ICrudService<Cliente> crudService;
	
	@Autowired
	IAdicionalService<Cliente> adicionalService;

	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> listar(){
		
		try {	
			List<Cliente> listar = new ArrayList<Cliente>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Cliente>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Cliente>>(listar ,HttpStatus.OK);
			
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<List<Cliente>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
 
	} 

	@PostMapping("/crear")
	public ResponseEntity<Cliente> crear(@RequestBody  Cliente dato) {
			
		try {
			Cliente crear = new Cliente();
		
			crear = crudService.crear(dato);
			
			return new ResponseEntity<Cliente>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@PostMapping("/modificar")
	public ResponseEntity<Cliente> modificar(@RequestBody  Cliente dato) {
			
		try {
			Cliente modificar = new Cliente();
		
			modificar = crudService.modificar(dato);
			
			return new ResponseEntity<Cliente>(modificar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@GetMapping("/buscar/{dato}")
	public ResponseEntity<Cliente> buscar(@PathVariable Integer dato) {
			
		try {
			
			Cliente buscar = new Cliente();
		
			buscar = adicionalService.findbyUsuarioRunUsuario(dato);
			
			return new ResponseEntity<Cliente>(buscar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
	
}
