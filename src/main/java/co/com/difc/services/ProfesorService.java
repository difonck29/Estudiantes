package co.com.difc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.difc.dao.ProfesorDao;
import co.com.difc.entity.Profesor;

@Service
public class ProfesorService {
	
	@Autowired
	ProfesorDao dao;
	
	public Profesor getProfesor(Long id) {
		return dao.findById(id).orElse(null);
	}

}
