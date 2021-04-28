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

import cl.awakelab.Evaluacion_Modulo5.modelo.Capacitacion;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/capacitacion")
public class CapacitacionController {

	@Autowired
	ICrudService<Capacitacion> crudService;

	@GetMapping("/listar")
	public ResponseEntity<List<Capacitacion>> listar(){
		
		try {	
			List<Capacitacion> listar = new ArrayList<Capacitacion>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Capacitacion>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Capacitacion>>(listar ,HttpStatus.OK);
			
			}
		} catch (Exception e) {
			
			return new ResponseEntity<List<Capacitacion>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
 
	} 

	@PostMapping("/crear")
	public ResponseEntity<Capacitacion> crear(@RequestBody  Capacitacion nuevo) {
		
		try {
			
			Capacitacion crear = new Capacitacion();
		
			crear = crudService.crear(nuevo);
			
			return new ResponseEntity<Capacitacion>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Capacitacion>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
}
