package cl.awakelab.Evaluacion_Modulo5.servicio;

import java.util.List;

public interface ICrudService<E> {
	
	public List<E> listar();

	public E crear(E dato);
	
	public E modificar(E dato);
	
	public void eliminar(E dato);
	
}
