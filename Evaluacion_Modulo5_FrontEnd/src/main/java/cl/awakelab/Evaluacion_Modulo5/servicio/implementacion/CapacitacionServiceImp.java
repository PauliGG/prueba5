package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.Evaluacion_Modulo5.modelo.Capacitacion;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class CapacitacionServiceImp implements ICrudService<Capacitacion>{
	
	private static final String APILISTAR = "http://localhost:8090/api/v1/capacitacion/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/capacitacion/crear";

	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Capacitacion> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Capacitacion> httpEntityCapacitacion = new HttpEntity<Capacitacion>(headers)  ;
		
		ResponseEntity<List<Capacitacion>> responseEntityCapacitacion = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntityCapacitacion, new ParameterizedTypeReference<List<Capacitacion>>() {
		}) ;
		
		return responseEntityCapacitacion.getBody();
		
	}

	@Override
	public Capacitacion crear(Capacitacion dato) {
		
		ResponseEntity<Capacitacion> responseEntity = restTemplate.postForEntity(APICREAR, dato, Capacitacion.class);
		return responseEntity.getBody() ;		
	}

	@Override
	public Capacitacion modificar(Capacitacion dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
