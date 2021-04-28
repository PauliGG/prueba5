package cl.awakelab.Evaluacion_Modulo5.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CHEQUEO")
public class Chequeo {
	
	@Id
	@Column(name="IDCHEQUEO")
	private Integer idChequeo ; 
	
	@Column(name="NOMBRE")
	private String nombre ;
	
	@Column(name="DETALLE")
	private String detalle ;
	
	@Column(name="ESTADO")
	private Integer estado ;
	
	@Column(name="CLIENTE_RUTCLIENTE")
	private Integer clienteRutCliente ;
 
}
