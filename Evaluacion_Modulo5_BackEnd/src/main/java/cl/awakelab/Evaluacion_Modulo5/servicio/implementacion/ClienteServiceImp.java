package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Administrativo;
import cl.awakelab.Evaluacion_Modulo5.modelo.Capacitacion;
import cl.awakelab.Evaluacion_Modulo5.modelo.Cliente;
import cl.awakelab.Evaluacion_Modulo5.repositorio.ClienteRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class ClienteServiceImp implements ICrudService<Cliente> , IAdicionalService<Cliente> {
	
	@Autowired
	ClienteRepository repository ;
	
	@Override
	public List<Cliente> listar() {
		
		return repository.findAll();	
	}

	@Override
	public Cliente crear(Cliente dato) {
		
		return repository.save(dato) ;
		
	}

	@Override
	public Cliente modificar(Cliente dato) {
		
		return repository.save(dato) ;
		
	}

	@Override
	public void eliminar(Cliente dato) {
		
		repository.delete(dato) ;
		
	}

	@Override
	public Cliente findbyUsuarioRunUsuario(Integer dato) {
		Integer consulta = repository.findByDato(dato);
		
		return repository.findById(consulta).get();
	}
 
}
