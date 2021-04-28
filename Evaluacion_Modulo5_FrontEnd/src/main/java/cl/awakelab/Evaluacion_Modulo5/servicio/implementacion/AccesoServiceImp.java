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

import cl.awakelab.Evaluacion_Modulo5.modelo.Acceso;
import cl.awakelab.Evaluacion_Modulo5.modelo.Rol;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class AccesoServiceImp implements ICrudService<Acceso>, IAdicionalService<Acceso>{

	private static final String APILISTAR = "http://localhost:8090/api/v1/acceso/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/acceso/crear";
	private static final String APIMODIFICAR = "http://localhost:8090/api/v1/acceso/modificar";
	private static final String APIBUSCAR = "http://localhost:8090/api/v1/acceso/buscar/{buscarDato}";
	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Acceso> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Acceso> httpEntity = new HttpEntity<Acceso>(headers)  ;
		
		ResponseEntity<List<Acceso>> responseEntityAcceso = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Acceso>>() {
		}) ;
		
		return responseEntityAcceso.getBody();
		
	}

	@Override
	public Acceso crear(Acceso dato) {
		
		ResponseEntity<Acceso> responseEntity = restTemplate.postForEntity(APICREAR, dato, Acceso.class);
		return responseEntity.getBody() ;	
		
	}

	@Override
	public Acceso modificar(Acceso dato) {
		ResponseEntity<Acceso> responseEntity = restTemplate.postForEntity(APIMODIFICAR, dato, Acceso.class);
		return responseEntity.getBody() ;	
	}

	@Override
	public Acceso findbyUsuarioRunUsuario(Integer dato) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("buscarDato", dato);
		
		//ResponseEntity<Rol> responseEntity = restTemplate.postForEntity(APIBUSCAR, map, Rol.class);
		ResponseEntity<Acceso> responseEntity = restTemplate.getForEntity(APIBUSCAR, Acceso.class, map);
		
		return responseEntity.getBody() ;
	}
	
}

