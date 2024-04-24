package prueba;

public class Persona implements PuedeSaltar {

	@Override
	public void saltarHaciaAdelante() {
		System.out.println("Salta hacia adelante");
	}

	@Override
	public void saltarHaciaArriba() {
		System.out.println("Salta hacia atrás");

	}

}
