package cl.awakelab.Evaluacion_Modulo5.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USUARIO")
public class Usuario{
	//Atributos
	@Id
	@Column(name="RUNUSUARIO")
	private Integer runUsuario;
	
	@Column(name="USNOMBRE")
	private String usNombre;
	
	@Column(name="USAPELLIDO")
	private String usApellido;
	
	@Column(name="USNACIMIENTO")
	private String usNacimiento;

	@OneToOne (cascade= CascadeType.ALL)
	@JoinColumn( name="ACCESO_IDACCESO" , referencedColumnName="IDACCESO" ) 
	private Acceso acceso;
	 
}
