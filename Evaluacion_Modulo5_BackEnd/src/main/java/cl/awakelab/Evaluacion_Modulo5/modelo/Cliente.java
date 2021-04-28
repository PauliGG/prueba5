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
@Table(name = "CLIENTE")
public class Cliente  {
	
	//Atributos
	
	@Id
	@Column(name="RUTCLIENTE")
	private Integer rutCliente;
	
	@Column(name="CLITELEFONO")
	private String cliTelefono;
	
	@Column(name="CLIAFP")
	private String cliAfp;
	
	@Column(name="CLISISTEMASALUD")
	private Integer cliSistemasalud;
	
	@Column(name="CLIDIRECCION")
	private String cliDireccion;
	
	@Column(name="CLICOMUNA")
	private String cliComuna;
	
	@Column(name="CLIEDAD")
	private Integer cliEdad;
 
	@OneToOne (cascade= CascadeType.ALL) 
	@JoinColumn( name="USUARIO_RUNUSUARIO" , referencedColumnName="RUNUSUARIO" ) 
	private Usuario usuario;

}
