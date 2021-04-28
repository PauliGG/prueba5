package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Capacitacion {
	//Atributos	
	private Integer idCapacitacion;
	private String capFecha;
	private String capHora;
	private String capLugar;
	private Integer capDuracion;
	private Integer clienteRutCliente;

}
