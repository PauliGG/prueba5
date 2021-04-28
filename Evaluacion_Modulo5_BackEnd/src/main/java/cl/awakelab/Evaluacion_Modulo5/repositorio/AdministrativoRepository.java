package cl.awakelab.Evaluacion_Modulo5.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.awakelab.Evaluacion_Modulo5.modelo.Administrativo;

public interface AdministrativoRepository extends JpaRepository<Administrativo, Integer>{
	
	@Query(value = "SELECT IDADMINISTRATIVO FROM ADMINISTRATIVO WHERE USUARIO_RUNUSUARIO=?1", nativeQuery = true    )
	public Integer findByDato(Integer dato); 
	
}
