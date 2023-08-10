package ar.edu.unlam.interfaz;

public class Dos {

	public static void main(String[] args) {

		int suma = 0;

		for (int i = 100; i >= 50; i -= 5) {

			suma += i;

		}

		System.out.println("la suma da " + suma);
	}
}
