package cl.awakelab.Evaluacion_Modulo5.servicio;

import java.util.List;

import cl.awakelab.Evaluacion_Modulo5.modelo.Chequeo;

public interface IAdicionalChequeoService<E> {
	
	public List<Chequeo> findChequeoByClienteRutCliente(Integer dato) ;
	
}
