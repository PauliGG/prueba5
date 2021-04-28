package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Acceso{
	//Atributos
	private Integer idAcceso;
	private String accUsername;
	private String accPassword;
	private Rol rol;
  
}
