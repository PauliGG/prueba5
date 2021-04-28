package cl.awakelab.Evaluacion_Modulo5.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.awakelab.Evaluacion_Modulo5.modelo.Chequeo;

public interface ChequeoRepository extends JpaRepository<Chequeo, Integer>{
	
	@Query(value = "SELECT IDCHEQUEO FROM CHEQUEO WHERE CLIENTE_RUTCLIENTE=?1", nativeQuery = true    )
	public Integer findByDato(Integer dato); 
	
	@Query(value = "SELECT * FROM CHEQUEO WHERE CLIENTE_RUTCLIENTE=?1", nativeQuery = true    )
	public List<Chequeo> findByChequeo(Integer dato); 
	
}
