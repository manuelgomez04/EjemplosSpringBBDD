package com.salesianostriana.dam.manytoone.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.manytoone.modelo.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
