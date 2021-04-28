package cl.awakelab.Evaluacion_Modulo5.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.awakelab.Evaluacion_Modulo5.modelo.Profesional;

public interface ProfesionalRepository extends JpaRepository<Profesional, Integer>{
	
	@Query(value = "SELECT IDPROFESIONAL FROM PROFESIONAL WHERE USUARIO_RUNUSUARIO=?1", nativeQuery = true    )
	public Integer findByDato(Integer dato); 

}
