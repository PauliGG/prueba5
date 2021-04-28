package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Pago;
import cl.awakelab.Evaluacion_Modulo5.repositorio.PagoRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class PagoServiceImp implements ICrudService<Pago>{
	
	@Autowired
	PagoRepository repository ;
	
	@Override
	public List<Pago> listar() {
		
		return repository.findAll();
		
	}

	@Override
	public Pago crear(Pago dato) {
		
		return repository.save(dato) ;	
	}

	@Override
	public Pago modificar(Pago dato) {
		
		return repository.save(dato) ;	
		
	}

	@Override
	public void eliminar(Pago dato) {
		
		repository.delete(dato) ;	
		
	}

}
