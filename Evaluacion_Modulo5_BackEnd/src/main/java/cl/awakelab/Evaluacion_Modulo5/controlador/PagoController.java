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

import cl.awakelab.Evaluacion_Modulo5.modelo.Pago;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@RestController
@RequestMapping("/api/v1/pago")
public class PagoController {

	@Autowired
	ICrudService<Pago> crudService;

	@GetMapping("/listar")
	public ResponseEntity<List<Pago>> listar(){
		
		try {	
			List<Pago> listar = new ArrayList<Pago>();
			
			listar = crudService.listar() ;
			
			if(listar.isEmpty()) {
				
				return new ResponseEntity<List<Pago>>(HttpStatus.NO_CONTENT);	
			
			}else {
				
				return new ResponseEntity<List<Pago>>(listar ,HttpStatus.OK);
			
			}
		} catch (Exception e) {
			
			return new ResponseEntity<List<Pago>>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
 
	} 

	@PostMapping("/crear")
	public ResponseEntity<Pago> crear(@RequestBody  Pago nuevo) {
		
		try {
			
			Pago crear = new Pago();
		
			crear = crudService.crear(nuevo);
			
			return new ResponseEntity<Pago>(crear ,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Pago>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
}
