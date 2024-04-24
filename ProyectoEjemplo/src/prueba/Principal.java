package prueba;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<PuedeSaltar> listado = new ArrayList<>();

		saltarTodos(listado);
	}

	public static void saltarTodos(List<PuedeSaltar> lista) {
		for (PuedeSaltar puedeSaltar : lista) {
			puedeSaltar.saltarHaciaAdelante();
		}
	}

}
