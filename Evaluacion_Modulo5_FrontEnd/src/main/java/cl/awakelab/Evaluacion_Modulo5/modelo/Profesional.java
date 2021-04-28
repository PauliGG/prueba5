package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profesional{

	private Integer idProfesional;
	private String proTelefono;
	private String proTitulo;
	private String proProyecto;
	private Usuario usuario;
	 
}
