package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Profesional;
import cl.awakelab.Evaluacion_Modulo5.repositorio.ProfesionalRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class ProfesionalServiceImp implements ICrudService<Profesional> , IAdicionalService<Profesional>{
	
	@Autowired
	ProfesionalRepository repository ;
	
	@Override
	public List<Profesional> listar() {
		
		return repository.findAll();
		
	}

	@Override
	public Profesional crear(Profesional dato) {
		
		return repository.save(dato) ;
		
	}
	
	@Override
	public Profesional modificar(Profesional dato) {
		
		return repository.save(dato) ;
	}

	@Override
	public void eliminar(Profesional dato) {
		
		repository.delete(dato) ;
		
	}

	@Override
	public Profesional findbyUsuarioRunUsuario(Integer dato) {
		
		Integer consulta = repository.findByDato(dato);
	
		return repository.findById(consulta).get();
	 
	}



}
