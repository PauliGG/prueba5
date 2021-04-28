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

import cl.awakelab.Evaluacion_Modulo5.modelo.Administrativo;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/administrativo")
public class AdministrativoController {

	@Autowired
	ICrudService<Administrativo> crudService;
	
	@Autowired
	IAdicionalService<Administrativo> adicionalService;

	@GetMapping("/listar")
	public ResponseEntity<List<Administrativo>> listar(){
		
		try {	
			List<Administrativo> listar = new ArrayList<Administrativo>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Administrativo>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Administrativo>>(listar ,HttpStatus.OK);
			
			}
		} catch (Exception e) {
			
			return new ResponseEntity<List<Administrativo>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
 
	} 

	@PostMapping("/crear")
	public ResponseEntity<Administrativo> crear(@RequestBody  Administrativo dato) {
			
		try {
			Administrativo crear = new Administrativo();
		
			crear = crudService.crear(dato);
			
			return new ResponseEntity<Administrativo>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Administrativo>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@PostMapping("/modificar")
	public ResponseEntity<Administrativo> modificar(@RequestBody  Administrativo dato) {
			
		try {
			Administrativo modificar = new Administrativo();
		
			modificar = crudService.modificar(dato);
			
			return new ResponseEntity<Administrativo>(modificar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Administrativo>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@GetMapping("/buscar/{dato}")
	public ResponseEntity<Administrativo> buscar(@PathVariable Integer dato) {
			
		try {
			
			Administrativo buscar = new Administrativo();
		
			buscar = adicionalService.findbyUsuarioRunUsuario(dato);
			
			return new ResponseEntity<Administrativo>(buscar, HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Administrativo>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
}
