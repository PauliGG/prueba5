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

import cl.awakelab.Evaluacion_Modulo5.modelo.Rol;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class RolServiceImp implements ICrudService<Rol> , IAdicionalService<Rol> {

	private static final String APILISTAR = "http://localhost:8090/api/v1/rol/listar";	
	private static final String APICREAR = "http://localhost:8090/api/v1/rol/crear";
	private static final String APIMODIFICAR = "http://localhost:8090/api/v1/rol/modificar";
	private static final String APIBUSCAR = "http://localhost:8090/api/v1/rol/buscar/{buscarDato}";
	
	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Rol> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Rol> httpEntity = new HttpEntity<Rol>(headers)  ;
		
		ResponseEntity<List<Rol>> responseEntity = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Rol>>() {
		}) ;
		
		return responseEntity.getBody();
		
	}

	@Override
	public Rol crear(Rol dato) {
		
		ResponseEntity<Rol> responseEntity = restTemplate.postForEntity(APICREAR, dato, Rol.class);
		return responseEntity.getBody() ;	
		
	}
	
	@Override
	public Rol modificar(Rol dato) {
		ResponseEntity<Rol> responseEntity = restTemplate.postForEntity(APIMODIFICAR, dato, Rol.class);
		return responseEntity.getBody() ;	
	}

	@Override
	public Rol findbyUsuarioRunUsuario(Integer dato) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("buscarDato", dato);
		
		//ResponseEntity<Rol> responseEntity = restTemplate.postForEntity(APIBUSCAR, map, Rol.class);
		ResponseEntity<Rol> responseEntity = restTemplate.getForEntity(APIBUSCAR, Rol.class, map);
		
		return responseEntity.getBody() ;
		
	}
	
}

