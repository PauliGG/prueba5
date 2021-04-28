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

import cl.awakelab.Evaluacion_Modulo5.modelo.Cliente;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class ClienteServiceImp implements ICrudService<Cliente>, IAdicionalService<Cliente>{
	
	private static final String APILISTAR = "http://localhost:8090/api/v1/cliente/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/cliente/crear";
	private static final String APIMODIFICAR = "http://localhost:8090/api/v1/cliente/modificar";
	private static final String APIBUSCAR = "http://localhost:8090/api/v1/cliente/buscar/{buscarDato}";
	
	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Cliente> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Cliente> httpEntity = new HttpEntity<Cliente>(headers)  ;
		
		ResponseEntity<List<Cliente>> responseEntity = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Cliente>>() {
		}) ;
		
		return responseEntity.getBody();
		
	}

	@Override
	public Cliente crear(Cliente dato) {
		
		ResponseEntity<Cliente> responseEntity = restTemplate.postForEntity(APICREAR, dato, Cliente.class);
		return responseEntity.getBody() ;		
	}

	@Override
	public Cliente modificar(Cliente dato) {
		ResponseEntity<Cliente> responseEntity = restTemplate.postForEntity(APIMODIFICAR, dato, Cliente.class);
		return responseEntity.getBody() ;		
	}
	
	@Override
	public Cliente findbyUsuarioRunUsuario(Integer dato) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("buscarDato", dato);
		
		//ResponseEntity<Rol> responseEntity = restTemplate.postForEntity(APIBUSCAR, map, Rol.class);
		ResponseEntity<Cliente> responseEntity = restTemplate.getForEntity(APIBUSCAR, Cliente.class, map);
		
		return responseEntity.getBody() ;
		
	}


}
