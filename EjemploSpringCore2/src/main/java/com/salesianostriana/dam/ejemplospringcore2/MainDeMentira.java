package com.salesianostriana.dam.ejemplospringcore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
//@RequiredArgsConstructor
public class MainDeMentira {

	@Autowired
	@Qualifier("englishSaludator")
	private Saludator saludator;

	@PostConstruct
	public void init() {

		saludator.imprimirSaludo();
	}
}
