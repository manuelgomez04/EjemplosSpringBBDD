package com.salesianostriana.dam.serviciobase.ejemploherenciamappedsuperclass.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Bebida extends Producto {

	private int tamanio;
}
