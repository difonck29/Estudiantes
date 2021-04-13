package co.com.difc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.difc.dao.EstudianteDao;
import co.com.difc.entity.Estudiante;

@Service
public class EstudianteService {
	
	@Autowired
	EstudianteDao dao;
	
	public List<Estudiante> getStudentBySignature(Long idAsignatura){
		//return dao.findByAsignaturaId(idAsignatura);
		return null;
	}

}
