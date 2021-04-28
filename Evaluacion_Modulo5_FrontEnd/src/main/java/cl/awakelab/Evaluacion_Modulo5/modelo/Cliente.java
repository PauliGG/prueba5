package cl.awakelab.Evaluacion_Modulo5.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente  {

	private Integer rutCliente;
	private String cliTelefono;
	private String cliAfp;
	private Integer cliSistemasalud;
	private String cliDireccion;
	private String cliComuna;
	private Integer cliEdad;
	private Usuario usuario;

}
