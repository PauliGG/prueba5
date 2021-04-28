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

import cl.awakelab.Evaluacion_Modulo5.modelo.Administrativo;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class AdministrativoServiceImp implements ICrudService<Administrativo>, IAdicionalService<Administrativo>{

	private static final String APILISTAR = "http://localhost:8090/api/v1/administrativo/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/administrativo/crear";
	private static final String APIMODIFICAR = "http://localhost:8090/api/v1/administrativo/modificar";
	private static final String APIBUSCAR = "http://localhost:8090/api/v1/administrativo/buscar/{buscarDato}";	
	
	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Administrativo> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Administrativo> httpEntity = new HttpEntity<Administrativo>(headers)  ;
		
		ResponseEntity<List<Administrativo>> responseEntity = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Administrativo>>() {
		}) ;
		
		return responseEntity.getBody();
		
	}

	@Override
	public Administrativo crear(Administrativo dato) {
		
		ResponseEntity<Administrativo> responseEntity = restTemplate.postForEntity(APICREAR, dato, Administrativo.class);
		return responseEntity.getBody() ;		
		
	}

	@Override
	public Administrativo modificar(Administrativo dato) {
		
		ResponseEntity<Administrativo> responseEntity = restTemplate.postForEntity(APIMODIFICAR, dato, Administrativo.class);
		return responseEntity.getBody() ;	
		
	}
	
	@Override
	public Administrativo findbyUsuarioRunUsuario(Integer dato) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("buscarDato", dato);
		
		ResponseEntity<Administrativo> responseEntity = restTemplate.getForEntity(APIBUSCAR, Administrativo.class, map);
		
		return responseEntity.getBody() ;
		
	}

}
