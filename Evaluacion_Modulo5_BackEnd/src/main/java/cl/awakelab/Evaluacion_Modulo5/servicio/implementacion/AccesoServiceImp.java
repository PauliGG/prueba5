package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Acceso;
import cl.awakelab.Evaluacion_Modulo5.modelo.Rol;
import cl.awakelab.Evaluacion_Modulo5.repositorio.AccesoRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class AccesoServiceImp implements ICrudService<Acceso>, IAdicionalService<Acceso>{
	
	@Autowired
	AccesoRepository repository ;

	@Override
	public List<Acceso> listar() {
		
		return repository.findAll();
		
	}

	@Override
	public Acceso crear(Acceso dato) {
		
		return repository.save(dato) ;
		
	}

	@Override
	public Acceso modificar(Acceso dato) {
		
		return repository.save(dato) ;
		
	}

	@Override
	public void eliminar(Acceso dato) {
		
		repository.delete(dato) ;
		
	}

	@Override
	public Acceso findbyUsuarioRunUsuario(Integer dato) {
		return repository.findById(dato).get();
	}
	
}

