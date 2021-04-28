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

import cl.awakelab.Evaluacion_Modulo5.modelo.Profesional;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/profesional")
public class ProfesionalController {

	@Autowired
	ICrudService<Profesional> crudService;
	
	@Autowired
	IAdicionalService<Profesional> adicionalService;

	@GetMapping("/listar")
	public ResponseEntity<List<Profesional>> listar(){
		
		try {	
			List<Profesional> listar = new ArrayList<Profesional>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Profesional>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Profesional>>(listar ,HttpStatus.OK);
			
			}
			
		} catch (Exception e) {
			
			return new ResponseEntity<List<Profesional>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
 
	} 

	@PostMapping("/crear")
	public ResponseEntity<Profesional> crear(@RequestBody  Profesional dato) {
			
		try {
			
			System.out.println("antes " + dato.getProProyecto() + dato.getUsuario().toString() );
			
			Profesional crear = new Profesional();
		
			crear = crudService.crear(dato);
			
			System.out.println("despues sin error" + dato.getProProyecto() + dato.getUsuario().toString() );
			
			return new ResponseEntity<Profesional>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Profesional>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@PostMapping("/modificar")
	public ResponseEntity<Profesional> modificar(@RequestBody  Profesional dato) {
			
		try {
			
			Profesional modificar = new Profesional();
		
			modificar = crudService.modificar(dato);
			
			return new ResponseEntity<Profesional>(modificar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Profesional>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
	@GetMapping("/buscar/{dato}")
	public ResponseEntity<Profesional> buscar(@PathVariable Integer dato) {
			
		try {
			
			Profesional buscar = new Profesional();
		
			buscar = adicionalService.findbyUsuarioRunUsuario(dato);
			
			return new ResponseEntity<Profesional>(buscar ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Profesional>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
		 
	}
	
}
