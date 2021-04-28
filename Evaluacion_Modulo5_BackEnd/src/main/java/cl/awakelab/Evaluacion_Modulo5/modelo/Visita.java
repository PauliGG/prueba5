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
@Table(name = "VISITA")
public class Visita{
	
	@Id
	@Column(name="IDVISITA")
	private Integer idVisita ; 
	
	@Column(name="VISFECHA")
	private String visFecha ;
	
	@Column(name="VISHORA")
	private String visHora ;
	
	@Column(name="VISLUGAR")
	private String visLugar ;
	
	@Column(name="VISCOMENTARIO")
	private String visComentario ;
	
	@Column(name="CLIENTE_RUTCLIENTE")
	private Integer clienteRutCliente ;
 
}
