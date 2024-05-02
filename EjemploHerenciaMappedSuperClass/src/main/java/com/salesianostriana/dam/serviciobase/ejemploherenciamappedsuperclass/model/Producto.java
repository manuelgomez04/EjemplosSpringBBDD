package com.salesianostriana.dam.serviciobase.ejemploherenciamappedsuperclass.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Producto {

	@Id
	@GeneratedValue
	private long id;

	private String nombre;

	private float precio;
}
