package com.salesianostriana.dam.manytoone.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.manytoone.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
