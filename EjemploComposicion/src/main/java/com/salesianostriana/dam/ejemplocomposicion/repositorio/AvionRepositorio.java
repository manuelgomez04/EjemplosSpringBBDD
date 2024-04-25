package com.salesianostriana.dam.ejemplocomposicion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.ejemplocomposicion.modelo.Avion;

public interface AvionRepositorio extends JpaRepository<Avion, Long> {

}
