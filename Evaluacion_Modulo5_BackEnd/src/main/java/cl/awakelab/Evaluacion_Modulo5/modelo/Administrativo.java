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
@Table(name = "ADMINISTRATIVO")
public class Administrativo{
	
	@Id
	@Column(name="IDADMINISTRATIVO")
	private Integer idAdministrativo ; 
	
	@Column(name="ADCORREO")
	private String adCorreo ;
	
	@Column(name="ADAREA")
	private String adArea ;
	
	@OneToOne (cascade= CascadeType.ALL)
	@JoinColumn( name="USUARIO_RUNUSUARIO" , referencedColumnName="RUNUSUARIO" ) 
	private Usuario usuario;
		
}
