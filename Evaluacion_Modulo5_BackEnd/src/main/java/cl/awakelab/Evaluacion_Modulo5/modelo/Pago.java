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
@Table(name = "PAGO")
public class Pago {
	
	@Id
	@Column(name="IDPAGO")
	private Integer idPago ; 
	
	@Column(name="PAGFECHA")
	private String pagFecha ;
	
	@Column(name="PAGMONTO")
	private Integer pagMonto ;
	
	@Column(name="PAGMES")
	private Integer pagMes ;
	
	@Column(name="PAGANYO")
	private Integer pagAnyo ;
	
	@Column(name="CLIENTE_RUTCLIENTE")
	private Integer clienteRutCliente ;

}
