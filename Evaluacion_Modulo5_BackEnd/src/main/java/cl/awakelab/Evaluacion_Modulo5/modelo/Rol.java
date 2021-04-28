package cl.awakelab.Evaluacion_Modulo5.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ROL")
public class Rol{
	//Atributos
	@Id
	@Column(name="IDROL")
	private Integer idRol;
	
	@Column(name="ROLNOMBRE")
	private String rolNombre;
	

}
