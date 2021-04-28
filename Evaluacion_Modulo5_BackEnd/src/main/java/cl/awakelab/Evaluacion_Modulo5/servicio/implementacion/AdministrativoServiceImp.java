package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Administrativo;
import cl.awakelab.Evaluacion_Modulo5.repositorio.AdministrativoRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class AdministrativoServiceImp implements ICrudService<Administrativo>, IAdicionalService<Administrativo>{
	
	@Autowired
	AdministrativoRepository repository ;
	
	@Override
	public List<Administrativo> listar() {
		
		return repository.findAll();
		
	}

	@Override
	public Administrativo crear(Administrativo dato) {
		
		return repository.save(dato) ;
		
	}
	
	@Override
	public Administrativo modificar(Administrativo dato) {
		
		return repository.save(dato) ;
	}

	@Override
	public void eliminar(Administrativo dato) {
		
		repository.delete(dato) ;
		
	}

	@Override
	public Administrativo findbyUsuarioRunUsuario(Integer dato) {
		
		Integer consulta = repository.findByDato(dato);
		
		return repository.findById(consulta).get();
	}

}
