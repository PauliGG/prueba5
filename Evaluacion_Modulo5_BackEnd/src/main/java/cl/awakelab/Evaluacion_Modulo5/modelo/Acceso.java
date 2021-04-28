package cl.awakelab.Evaluacion_Modulo5.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "ACCESO")
public class Acceso{
	//Atributos
	@Id
	@Column(name="IDACCESO")
	private Integer idAcceso;
	
	@Column(name="ACCUSERNAME")
	private String accUsername;
	
	@Column(name="ACCPASSWORD")
	private String accPassword;
	
	@OneToOne (cascade= CascadeType.ALL ) //, fetch = FetchType.LAZY
	@JoinColumn( name="ROL_IDROL", referencedColumnName = "IDROL")
	private Rol rol;
  
}
