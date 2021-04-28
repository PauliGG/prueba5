package cl.awakelab.Evaluacion_Modulo5.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.awakelab.Evaluacion_Modulo5.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	@Query(value = "SELECT RUTCLIENTE FROM CLIENTE WHERE USUARIO_RUNUSUARIO=?1", nativeQuery = true    )
	public Integer findByDato(Integer dato); 
	
}
