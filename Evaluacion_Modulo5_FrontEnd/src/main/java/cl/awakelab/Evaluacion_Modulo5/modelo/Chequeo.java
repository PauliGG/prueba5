package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chequeo {

	private Integer idChequeo ; 
	private String nombre ;
	private String detalle ;
	private Integer estado ;
	private Integer clienteRutCliente ;
 
}
