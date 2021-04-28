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

import cl.awakelab.Evaluacion_Modulo5.modelo.Usuario;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class UsuarioServiceImp implements ICrudService<Usuario>, IAdicionalService<Usuario> {

	private static final String APILISTAR = "http://localhost:8090/api/v1/usuario/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/usuario/crear";
	private static final String APIMODIFICAR = "http://localhost:8090/api/v1/usuario/modificar";
	private static final String APIBUSCAR = "http://localhost:8090/api/v1/usuario/buscar/{buscarDato}";	
	
	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Usuario> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Usuario> httpEntity = new HttpEntity<Usuario>(headers)  ;
		
		ResponseEntity<List<Usuario>> responseEntity = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Usuario>>() {
		}) ;
		
		return responseEntity.getBody();
		
	}

	@Override
	public Usuario crear(Usuario dato) {
		
		ResponseEntity<Usuario> responseEntity = restTemplate.postForEntity(APICREAR, dato, Usuario.class);
		return responseEntity.getBody() ;		
		
	}
	
	@Override
	public Usuario modificar(Usuario dato) {
		
		ResponseEntity<Usuario> responseEntity = restTemplate.postForEntity(APIMODIFICAR, dato, Usuario.class);
		return responseEntity.getBody() ;	
		
	}
	
	@Override
	public Usuario findbyUsuarioRunUsuario(Integer dato) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("buscarDato", dato);
		
		//ResponseEntity<Rol> responseEntity = restTemplate.postForEntity(APIBUSCAR, map, Rol.class);
		ResponseEntity<Usuario> responseEntity = restTemplate.getForEntity(APIBUSCAR, Usuario.class, map);
		
		return responseEntity.getBody() ;
		
	}

}

