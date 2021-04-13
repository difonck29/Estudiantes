package co.com.difc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.difc.entity.Asignatura;

public interface AsignaturaDao extends CrudRepository<Asignatura, Long>{
	
	List<Asignatura> findByProfesorId(Long idProfesor);

}
