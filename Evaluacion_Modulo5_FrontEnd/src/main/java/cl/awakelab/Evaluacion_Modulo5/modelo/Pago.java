package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pago {

	private Integer idPago ; 
	private String pagFecha ;
	private Integer pagMonto ;
	private Integer pagMes ;
	private Integer pagAnyo ;
	private Integer clienteRutCliente ;
 
}
