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
@Table(name = "CAPACITACION")
public class Capacitacion {
	//Atributos	
	@Id
	@Column(name="IDCAPACITACION")
	private Integer idCapacitacion;
	
	@Column(name="CAPFECHA")
	private String capFecha;
	
	@Column(name="CAPHORA")
	private String capHora;
	
	@Column(name="CAPLUGAR")
	private String capLugar;
	
	@Column(name="CAPDURACION")
	private Integer capDuracion;
	
	@Column(name="CLIENTE_RUTCLIENTE")
	private Integer clienteRutCliente;

}
