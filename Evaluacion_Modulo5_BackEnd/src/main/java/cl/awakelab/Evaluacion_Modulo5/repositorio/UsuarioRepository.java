package cl.awakelab.Evaluacion_Modulo5.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.Evaluacion_Modulo5.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
}
