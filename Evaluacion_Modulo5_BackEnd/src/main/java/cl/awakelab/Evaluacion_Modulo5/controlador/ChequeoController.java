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

import cl.awakelab.Evaluacion_Modulo5.modelo.Chequeo;
import cl.awakelab.Evaluacion_Modulo5.modelo.Cliente;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalChequeoService;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/chequeo")
public class ChequeoController {

	@Autowired
	ICrudService<Chequeo> crudService;
	
	@Autowired
	IAdicionalService<Chequeo> adicionalService;
	
	@Autowired
	IAdicionalChequeoService<Chequeo> adicionalChequeoService;

	@GetMapping("/listar")
	public ResponseEntity<List<Chequeo>> listar(){
		
		try {	
			List<Chequeo> listar = new ArrayList<Chequeo>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Chequeo>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Chequeo>>(listar ,HttpStatus.OK);
			
			}
		} catch (Exception e) {
			
			return new ResponseEntity<List<Chequeo>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
 
	} 

	@PostMapping("/crear")
	public ResponseEntity<Chequeo> crear(@RequestBody  Chequeo nuevo) {
		
		try {
			
			Chequeo crear = new Chequeo();
		
			crear = crudService.crear(nuevo);
			
			return new ResponseEntity<Chequeo>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Chequeo>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
	@PostMapping("/modificar")
	public ResponseEntity<Chequeo> modificar(@RequestBody Chequeo dato) {
			
		try {
			Chequeo modificar = new Chequeo();
		
			modificar = crudService.modificar(dato);
			
			return new ResponseEntity<Chequeo>(modificar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Chequeo>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@GetMapping("/buscar/{dato}")
	public ResponseEntity<Chequeo> buscar(@PathVariable Integer dato) {
			
		try {
			
			Chequeo buscar = new Chequeo();
		
			buscar = adicionalService.findbyUsuarioRunUsuario(dato);
			
			return new ResponseEntity<Chequeo>(buscar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Chequeo>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
	@GetMapping("/buscarPorCliente/{dato}")
	public ResponseEntity<List<Chequeo>> buscarPorCliente(@PathVariable Integer dato) {
 
		try {	
			List<Chequeo> listar = new ArrayList<Chequeo>();
			
			listar = adicionalChequeoService.findChequeoByClienteRutCliente(dato) ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Chequeo>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Chequeo>>(listar ,HttpStatus.OK);
			
			}
		} catch (Exception e) {
			
			return new ResponseEntity<List<Chequeo>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		
	}
	
}
