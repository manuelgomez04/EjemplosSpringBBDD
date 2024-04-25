package com.salesianostriana.dam.manytoone.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

//Esta anotación sirve para 
@Builder
public class Alumno {

	@Id
	@GeneratedValue
	private long id;

	private String nombre;
	private String apellidos;
	private String email;

	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_alumno_curso"))
	private Curso curso;

	public Alumno(String nombre, String apellidos, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;

	}

	public Alumno(String nombre, String apellidos, String email, Curso curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.curso = curso;

	}

	public void addToCurso(Curso curso) {
		this.curso = curso;
		curso.getAlumnos().add(this);
	}

	public void removeFromCurso(Curso curso) {
		curso.getAlumnos().remove(this);
		this.curso = null;
	}

}
