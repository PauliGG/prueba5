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

import cl.awakelab.Evaluacion_Modulo5.modelo.Rol;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/rol")
public class RolController {

	@Autowired
	ICrudService<Rol> crudService;
	
	@Autowired
	IAdicionalService<Rol> adicionalService;

	@GetMapping("/listar")
	public ResponseEntity<List<Rol>> listar(){
		
		try {	
			List<Rol> listar = new ArrayList<Rol>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Rol>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Rol>>(listar ,HttpStatus.OK);
			
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<List<Rol>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}

	} 

	@PostMapping("/crear")
	public ResponseEntity<Rol> crear(@RequestBody  Rol nuevo) {
			
		try {
			Rol crear = new Rol();
		
			crear = crudService.crear(nuevo);
			
			return new ResponseEntity<Rol>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Rol>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@PostMapping("/modificar")
	public ResponseEntity<Rol> modificar(@RequestBody  Rol nuevo) {
			
		try {
			Rol modificar = new Rol();
		
			modificar = crudService.modificar(nuevo);
			
			return new ResponseEntity<Rol>(modificar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Rol>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@GetMapping("/buscar/{dato}")
	public ResponseEntity<Rol> buscar(@PathVariable Integer dato) {
			
		try {
			
			Rol buscar = new Rol();
		
			buscar = adicionalService.findbyUsuarioRunUsuario(dato);
			
			return new ResponseEntity<Rol>(buscar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Rol>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
}
