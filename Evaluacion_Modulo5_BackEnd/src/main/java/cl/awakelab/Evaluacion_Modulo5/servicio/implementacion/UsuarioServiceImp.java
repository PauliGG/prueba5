package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Usuario;
import cl.awakelab.Evaluacion_Modulo5.repositorio.UsuarioRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class UsuarioServiceImp implements ICrudService<Usuario>, IAdicionalService<Usuario>{
	
	@Autowired
	UsuarioRepository repository ;

	@Override
	public List<Usuario> listar() {
		
		return repository.findAll();
		
	}

	@Override
	public Usuario crear(Usuario dato) {
		
		return repository.save(dato) ;
		
	}

	@Override
	public Usuario modificar(Usuario dato) {
		
		return repository.save(dato) ;
		
	}

	@Override
	public void eliminar(Usuario dato) {
		
		repository.delete(dato) ;
		
	}

	@Override
	public Usuario findbyUsuarioRunUsuario(Integer dato) {
		
		return repository.findById(dato).get();
		
	}
	
}

