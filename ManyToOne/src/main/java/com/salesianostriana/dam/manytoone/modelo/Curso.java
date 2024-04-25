package com.salesianostriana.dam.manytoone.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {

	@Id
	@GeneratedValue
	private Long id;

	private String nombre;
	private String tutor;

	/*
	 * En el mapped by va el nombre en la clase de enfrente que tiene el atributo
	 * anotado con many to one
	 */
	@OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	private List<Alumno> alumnos = new ArrayList<>();

	public Curso(String nombre, String tutor) {
		super();
		this.nombre = nombre;
		this.tutor = tutor;
	}

}
