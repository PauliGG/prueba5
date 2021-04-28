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

import cl.awakelab.Evaluacion_Modulo5.modelo.Chequeo;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalChequeoService;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class ChequeoServiceImp implements ICrudService<Chequeo> , IAdicionalService<Chequeo> ,  IAdicionalChequeoService<Chequeo>{
	
	private static final String APILISTAR = "http://localhost:8090/api/v1/chequeo/listar";
	private static final String APICREAR = "http://localhost:8090/api/v1/chequeo/crear";
	private static final String APIMODIFICAR = "http://localhost:8090/api/v1/chequeo/modificar";
	private static final String APIBUSCAR = "http://localhost:8090/api/v1/chequeo/buscar/{buscarDato}";
	private static final String APILISTARBUSCAR = "http://localhost:8090/api/v1/chequeo/buscarPorCliente/{buscarDato}";
	
	
	@Autowired
	RestTemplate restTemplate;   //permite consumir la api
	
	@Override
	public List<Chequeo> listar() {
		
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<Chequeo> httpEntity = new HttpEntity<Chequeo>(headers)  ;
		
		ResponseEntity<List<Chequeo>> responseEntity = restTemplate.exchange(APILISTAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Chequeo>>() {
		}) ;
		
		return responseEntity.getBody();
		
	}

	@Override
	public Chequeo crear(Chequeo dato) {
		
		ResponseEntity<Chequeo> responseEntity = restTemplate.postForEntity(APICREAR, dato, Chequeo.class);
		return responseEntity.getBody() ;		
	}

	@Override
	public Chequeo modificar(Chequeo dato) {
		ResponseEntity<Chequeo> responseEntity = restTemplate.postForEntity(APIMODIFICAR, dato, Chequeo.class);
		return responseEntity.getBody() ;
	}

	@Override
	public Chequeo findbyUsuarioRunUsuario(Integer dato) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("buscarDato", dato);
		
		ResponseEntity<Chequeo> responseEntity = restTemplate.getForEntity(APIBUSCAR, Chequeo.class, map);
		
		return responseEntity.getBody() ;
	}

	@Override
	public List<Chequeo> findChequeoByClienteRutCliente(Integer dato) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("buscarDato", dato);

		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<List<Chequeo>> httpEntity = new HttpEntity<List<Chequeo>>(headers)  ;
		
		ResponseEntity<List<Chequeo>> responseEntity = restTemplate.exchange(APILISTARBUSCAR, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<Chequeo>>() {
		
		} , Chequeo.class , map) ;

		return responseEntity.getBody();
		
	}

}
