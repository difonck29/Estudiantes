package co.com.difc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.difc.dao.AsignaturaDao;
import co.com.difc.entity.Asignatura;

@Service
public class AsignaturaService {
	
	@Autowired
	private AsignaturaDao dao;

	public List<Asignatura> getAsignaturasByProfesor(Long id){
		return dao.findByProfesorId(id);
	}
}
