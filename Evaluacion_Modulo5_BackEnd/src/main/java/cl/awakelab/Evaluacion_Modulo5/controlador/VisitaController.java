package cl.awakelab.Evaluacion_Modulo5.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.Evaluacion_Modulo5.modelo.Visita;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/visita")
public class VisitaController {

	@Autowired
	ICrudService<Visita> crudService;

	@GetMapping("/listar")
	public ResponseEntity<List<Visita>> listar(){
		
		try {	
			List<Visita> listar = new ArrayList<Visita>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Visita>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Visita>>(listar ,HttpStatus.OK);
			
			}
		} catch (Exception e) {
			
			return new ResponseEntity<List<Visita>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
 
	} 

	@PostMapping("/crear")
	public ResponseEntity<Visita> crear(@RequestBody  Visita nuevo) {
		
		try {
			
			Visita crear = new Visita();
		
			crear = crudService.crear(nuevo);
			
			return new ResponseEntity<Visita>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Visita>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
}
