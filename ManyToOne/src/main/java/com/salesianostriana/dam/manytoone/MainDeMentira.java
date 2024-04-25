package com.salesianostriana.dam.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.manytoone.modelo.Alumno;
import com.salesianostriana.dam.manytoone.modelo.Curso;
import com.salesianostriana.dam.manytoone.repositorios.AlumnoRepository;
import com.salesianostriana.dam.manytoone.repositorios.CursoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	// LAS CLASES QUE SON ENTIDADES NO SE PUEDEN INYECTAR

	@Autowired
	private AlumnoRepository alumnoRepositorio;

	@Autowired
	private CursoRepository cursoRepo;

	@PostConstruct
	void ejecutar() {
		// Curso c = new Curso("1ºDam", "Miguel Campos");
		Curso c = Curso.builder().tutor("Miguel Campos").nombre("1ºDAM").build();
		cursoRepo.save(c);

		Alumno a = new Alumno("Luis Miguel", "López Magaña", "luismi.lopez@salesianos.edu");
		a.addToCurso(c);
		alumnoRepositorio.save(a);
		Alumno a1 = new Alumno("Ángel", "Naranjo González", "angel.naranjo@salesianos.edu");
		a1.addToCurso(c);
		alumnoRepositorio.save(a);

		Alumno a2 = new Alumno("Rafael", "Villar Liñán", "rafael.villar@salesianos.edu");
		a2.addToCurso(c);
		alumnoRepositorio.save(a2);

		/*
		 * Alumno a3 = new Alumno("Manuel", "Gómez Martin",
		 * "gomez.maman24@triana.salesianos.edu"); a3.addToCurso(c);
		 */

		Alumno a3 = Alumno.builder().apellidos("Manuel").apellidos("Gómez Martín")
				.email("gomez.maman24@triana.salesianos.edu").build();

		a3.addToCurso(c);
		alumnoRepositorio.save(a3);

		Alumno a4 = Alumno.builder().nombre("Juanjo").build();
		a4.addToCurso(c);
		alumnoRepositorio.save(a4);

		alumnoRepositorio.findAll().forEach(System.out::println);

	}
}
