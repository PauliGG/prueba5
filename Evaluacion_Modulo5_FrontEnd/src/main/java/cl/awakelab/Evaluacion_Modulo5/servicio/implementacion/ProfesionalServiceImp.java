package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.awakelab.Evaluacion_Modulo5.modelo.Profesional;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class ProfesionalServiceImp implements ICrudService<Profesional>, IAdicionalService<Profesional>{
	
	private static final String APILISTAR = "http://localhost:8090/api/v1/profesional/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/profesional/crear";
	private static final String APIMODIFICAR = "http://localhost:8090/api/v1/profesional/modificar";
	private static final String APIBUSCAR = "http://localhost:8090/api/v1/profesional/buscar/{buscarDato}";
	
	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Profesional> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Profesional> httpEntity = new HttpEntity<Profesional>(headers)  ;
		
		ResponseEntity<List<Profesional>> responseEntity = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Profesional>>() {
		}) ;
		
		return responseEntity.getBody();
		
	}

	@Override
	public Profesional crear(Profesional dato) {
		
		ResponseEntity<Profesional> responseEntity = restTemplate.postForEntity(APICREAR, dato, Profesional.class);
		return responseEntity.getBody() ;	
		
	}

	@Override
	public Profesional modificar(Profesional dato) {
		ResponseEntity<Profesional> responseEntity = restTemplate.postForEntity(APIMODIFICAR, dato, Profesional.class);
		return responseEntity.getBody() ;	
	}

	@Override
	public Profesional findbyUsuarioRunUsuario(Integer dato) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("buscarDato", dato);
		
		ResponseEntity<Profesional> responseEntity = restTemplate.getForEntity(APIBUSCAR, Profesional.class, map);
		
		return responseEntity.getBody() ;
		
	}
	
}
