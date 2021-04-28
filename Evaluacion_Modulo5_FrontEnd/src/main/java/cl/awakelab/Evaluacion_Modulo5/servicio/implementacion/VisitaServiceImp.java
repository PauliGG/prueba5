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

import cl.awakelab.Evaluacion_Modulo5.modelo.Visita;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class VisitaServiceImp implements ICrudService<Visita>{
	
	private static final String APILISTAR = "http://localhost:8090/api/v1/visita/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/visita/crear";

	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Visita> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Visita> httpEntity = new HttpEntity<Visita>(headers)  ;
		
		ResponseEntity<List<Visita>> responseEntity = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Visita>>() {
		}) ;
		
		return responseEntity.getBody();
		
	}

	@Override
	public Visita crear(Visita dato) {
		
		ResponseEntity<Visita> responseEntity = restTemplate.postForEntity(APICREAR, dato, Visita.class);
		return responseEntity.getBody() ;		
	}

	@Override
	public Visita modificar(Visita dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
