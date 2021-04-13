package co.com.difc.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Asignatura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "id_profesor")
	private Profesor profesor;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ASIGNATURA_ESTUDIANTE", joinColumns = @JoinColumn(name = "id_asignatura", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_estudiante", referencedColumnName = "id"))
	private List<Estudiante> estudiantes;
	
	@ManyToMany
	@JoinTable(name = "ASIGNATURA_CURSO", joinColumns = @JoinColumn(name = "id_asignatura" , referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_curso",referencedColumnName = "id"))
	private List<Curso> cursos;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}


	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	

}
