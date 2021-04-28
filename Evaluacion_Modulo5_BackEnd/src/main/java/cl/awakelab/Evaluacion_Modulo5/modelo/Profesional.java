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
@Table(name = "PROFESIONAL")
public class Profesional{
	
	@Id
	@Column(name="IDPROFESIONAL")
	private Integer idProfesional;
	
	@Column(name="PROTELEFONO")
	private String proTelefono;
	
	@Column(name="PROTITULO")
	private String proTitulo;
	
	@Column(name="PROPROYECTO")
	private String proProyecto;
	
	@OneToOne (cascade= CascadeType.ALL)
	@JoinColumn( name="USUARIO_RUNUSUARIO" , referencedColumnName="RUNUSUARIO" ) 
	private Usuario usuario;
	 
}
