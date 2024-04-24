package com.salesianostriana.dam.primerproyectodatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.primerproyectodatajpa.modelo.Alumno;
import com.salesianostriana.dam.primerproyectodatajpa.repositorios.AlumnoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	// LAS CLASES QUE SON ENTIDADES NO SE PUEDEN INYECTAR

	@Autowired
	private AlumnoRepository repositorio;

	@PostConstruct
	void ejecutar() {

		repositorio.save(new Alumno("Luis Miguel", "López Magaña", "luismi.lopez@salesianos.edu"));
		repositorio.save(new Alumno("Ángel", "Naranjo González", "angel.naranjo@salesianos.edu"));
		repositorio.save(new Alumno("Rafael", "Villar Liñán", "rafael.villar@salesianos.edu"));
		repositorio.save(new Alumno("Manuel", "Gómez Martin", "gomez.maman24@triana.salesianos.edu"));

		repositorio.findAll().forEach(System.out::println);

	}
}
