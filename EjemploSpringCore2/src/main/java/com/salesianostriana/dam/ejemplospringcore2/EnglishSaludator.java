package com.salesianostriana.dam.ejemplospringcore2;

import org.springframework.stereotype.Service;

@Service
public class EnglishSaludator implements Saludator {

	@Override
	public void imprimirSaludo() {
		System.out.println("Hello coders of 1ºDAM");
	}

}
