package co.com.difc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.com.difc.controllers.excpetions.ProfesorNoEncontrado;
import co.com.difc.entity.Profesor;
import co.com.difc.services.ProfesorService;

@RestController
public class ProfesorController {

	@Autowired
	ProfesorService service;
	
	@GetMapping(path = "/getProfesor/{id}")
	public Profesor getProfesor(@PathVariable Long id) {
		Profesor profesor = service.getProfesor(id);
		
		if(profesor==null) {
			throw new ProfesorNoEncontrado();
		}
		
		return profesor; 
	}
}
