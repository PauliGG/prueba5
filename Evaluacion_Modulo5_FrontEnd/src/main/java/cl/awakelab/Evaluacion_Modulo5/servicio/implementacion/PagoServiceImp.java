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

import cl.awakelab.Evaluacion_Modulo5.modelo.Pago;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class PagoServiceImp implements ICrudService<Pago>{
	
	private static final String APILISTAR = "http://localhost:8090/api/v1/pago/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/pago/crear";

	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Pago> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Pago> httpEntity = new HttpEntity<Pago>(headers)  ;
		
		ResponseEntity<List<Pago>> responseEntity = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Pago>>() {
		}) ;
		
		return responseEntity.getBody();
		
	}

	@Override
	public Pago crear(Pago dato) {
		
		ResponseEntity<Pago> responseEntity = restTemplate.postForEntity(APICREAR, dato, Pago.class);
		return responseEntity.getBody() ;		
	}

	@Override
	public Pago modificar(Pago dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
