package cl.awakelab.Evaluacion_Modulo5.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.Evaluacion_Modulo5.modelo.Administrativo;
import cl.awakelab.Evaluacion_Modulo5.modelo.Chequeo;
import cl.awakelab.Evaluacion_Modulo5.repositorio.ChequeoRepository;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalChequeoService;
import cl.awakelab.Evaluacion_Modulo5.servicio.IAdicionalService;
import cl.awakelab.Evaluacion_Modulo5.servicio.ICrudService;

@Service
public class ChequeoServiceImp implements ICrudService<Chequeo> ,  IAdicionalService<Chequeo> , IAdicionalChequeoService<Chequeo>{
	
	@Autowired
	ChequeoRepository repository ;
	
	@Override
	public List<Chequeo> listar() {
		
		return repository.findAll();
		
	}

	@Override
	public Chequeo crear(Chequeo dato) {
		
		return repository.save(dato) ;	
	}

	@Override
	public Chequeo modificar(Chequeo dato) {
		
		return repository.save(dato) ;	
		
	}

	@Override
	public void eliminar(Chequeo dato) {
		
		repository.delete(dato) ;	
		
	}

	@Override
	public Chequeo findbyUsuarioRunUsuario(Integer dato) {
		
		Integer consulta = repository.findByDato(dato);
		//repository.findby
		return repository.findById(consulta).get();
	}

	@Override
	public List<Chequeo> findChequeoByClienteRutCliente(Integer dato) {
		
		return repository.findByChequeo(dato);
	}

}
