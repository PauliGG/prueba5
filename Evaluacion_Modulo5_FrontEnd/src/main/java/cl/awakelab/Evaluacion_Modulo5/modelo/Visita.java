package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Visita{

	private Integer idVisita ; 
	private String visFecha ;
	private String visHora ;
	private String visLugar ;
	private String visComentario ;
	private Integer clienteRutCliente ;
 
}
