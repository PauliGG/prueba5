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

import cl.awakelab.Evaluacion_Modulo5.modelo.Acceso;
import cl.awakelab.Evaluacion_Modulo5.modelo.Rol;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/acceso")
public class AccesoController {

	@Autowired
	ICrudService<Acceso> crudService;
	
	@Autowired
	IAdicionalService<Acceso> adicionalService;

	@GetMapping("/listar")
	public ResponseEntity<List<Acceso>> listar(){
		
		try {	
			List<Acceso> listar = new ArrayList<Acceso>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Acceso>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Acceso>>(listar ,HttpStatus.OK);
			
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<List<Acceso>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}

	} 

	@PostMapping("/crear")
	public ResponseEntity<Acceso> crear(@RequestBody  Acceso dato) {
			
		try {
			Acceso crear = new Acceso();
		
			crear = crudService.crear(dato);
			
			return new ResponseEntity<Acceso>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Acceso>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		 
	}
	
	@PostMapping("/modificar")
	public ResponseEntity<Acceso> modificar(@RequestBody  Acceso nuevo) {
			
		try {
			Acceso modificar = new Acceso();
		
			modificar = crudService.modificar(nuevo);
			
			return new ResponseEntity<Acceso>(modificar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Acceso>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@GetMapping("/buscar/{dato}")
	public ResponseEntity<Acceso> buscar(@PathVariable Integer dato) {
			
		try {
			
			Acceso buscar = new Acceso();
		
			buscar = adicionalService.findbyUsuarioRunUsuario(dato);
			
			return new ResponseEntity<Acceso>(buscar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Acceso>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
}
