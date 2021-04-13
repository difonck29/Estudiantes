package co.com.difc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.com.difc.entity.Estudiante;
import co.com.difc.services.EstudianteService;

@RestController
public class EstudianteController {
	
	@Autowired
	private EstudianteService service;
	
	@GetMapping(path = "/getStudentsBySignature/{idAsignatura}")
	public List<Estudiante> getEstudiante(@PathVariable Long idAsignatura) {
		return service.getStudentBySignature(idAsignatura);
	}
}
