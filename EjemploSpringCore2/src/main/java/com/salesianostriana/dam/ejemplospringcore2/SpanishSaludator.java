package com.salesianostriana.dam.ejemplospringcore2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Primary
public class SpanishSaludator implements Saludator {

	@Override
	public void imprimirSaludo() {
		System.out.println("Hola a todos los programadores de 1ºDAM");

	}

	@PostConstruct
	void alComenzar() {
		System.out.println("Yo, Brian bo");
	}

	@PreDestroy
	void antesDeDestruir() {
		System.out.println("Solito por la ciudad");
	}
}
