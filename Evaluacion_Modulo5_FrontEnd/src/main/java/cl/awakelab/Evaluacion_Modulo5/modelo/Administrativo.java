package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Administrativo{

	private Integer idAdministrativo ; 
	private String adCorreo ;
	private String adArea ;
	private Usuario usuario;
		
}
