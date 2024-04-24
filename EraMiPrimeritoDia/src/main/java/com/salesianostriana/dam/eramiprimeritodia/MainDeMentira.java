package com.salesianostriana.dam.eramiprimeritodia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
//@RequiredArgsConstructor
public class MainDeMentira {

	@Autowired
	// @Qualifier("englishSaludator")
	private Saludator saludator;

	@PostConstruct
	public void init() {

		saludator.imprimirSaludo();
	}
}
