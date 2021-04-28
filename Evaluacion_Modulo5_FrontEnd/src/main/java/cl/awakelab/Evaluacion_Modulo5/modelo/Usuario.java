package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario{

	private Integer runUsuario;
	private String usNombre;
	private String usApellido;
	private String usNacimiento;
	private Acceso acceso;
		
}
