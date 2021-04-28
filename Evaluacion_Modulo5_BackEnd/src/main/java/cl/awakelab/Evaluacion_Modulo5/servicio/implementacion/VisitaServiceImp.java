package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Visita;
import cl.awakelab.Evaluacion_Modulo5.repositorio.VisitaRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class VisitaServiceImp implements ICrudService<Visita>{
	
	@Autowired
	VisitaRepository repository ;
	
	@Override
	public List<Visita> listar() {
		
		return repository.findAll();
		
	}

	@Override
	public Visita crear(Visita dato) {
		
		return repository.save(dato) ;	
	}

	@Override
	public Visita modificar(Visita dato) {
		
		return repository.save(dato) ;	
		
	}

	@Override
	public void eliminar(Visita dato) {
		
		repository.delete(dato) ;	
		
	}

}
