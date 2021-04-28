 package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Rol;
import cl.awakelab.Evaluacion_Modulo5.repositorio.RolRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class RolServiceImp implements ICrudService<Rol> , IAdicionalService<Rol>{
	
	@Autowired
	RolRepository repository ;

	@Override
	public List<Rol> listar() {
		
		return repository.findAll();
	}

	@Override
	public Rol crear(Rol dato) {
		
		return repository.save(dato) ;
	}
 
	@Override
	public Rol modificar(Rol dato) {
		
		return repository.save(dato) ;
		
	}

	@Override
	public void eliminar(Rol dato) {
		
		repository.delete(dato) ;
		
	}
	
	@Override
	public Rol findbyUsuarioRunUsuario(Integer dato) {
		return repository.findById(dato).get();
	}
	
}

