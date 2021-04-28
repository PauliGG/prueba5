package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Capacitacion;
import cl.awakelab.Evaluacion_Modulo5.repositorio.CapacitacionRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class CapacitacionServiceImp implements ICrudService<Capacitacion>{
	
	@Autowired
	CapacitacionRepository repository ;
	
	@Override
	public List<Capacitacion> listar() {
		
		return repository.findAll();
		
	}

	@Override
	public Capacitacion crear(Capacitacion dato) {
		
		return repository.save(dato) ;	
	}

	@Override
	public Capacitacion modificar(Capacitacion dato) {
		
		return repository.save(dato) ;	
		
	}

	@Override
	public void eliminar(Capacitacion dato) {
		
		repository.delete(dato) ;	
		
	}

}
