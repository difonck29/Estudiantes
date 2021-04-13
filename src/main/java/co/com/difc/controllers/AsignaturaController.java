package co.com.difc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.com.difc.entity.Asignatura;
import co.com.difc.services.AsignaturaService;

@RestController
public class AsignaturaController {

	
	@Autowired
	private AsignaturaService asignaturaService;
	
	@GetMapping("/getAsignaturas/{idProfesor}")
	public List<Asignatura> getAsignaturas(@PathVariable Long idProfesor){
		return asignaturaService.getAsignaturasByProfesor(idProfesor);
	}
}
