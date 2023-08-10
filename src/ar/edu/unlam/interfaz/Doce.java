package ar.edu.unlam.interfaz;

public class Doce {

	public static void main(String[] args) {

		int contador = 0;

		for (int i = 1; i < 100; i++) {
			if (primo(i)) {
				System.out.println(i);
				contador++;
			}
		}

		System.out.println("Los numeros primos del 1 al 100 son " + contador);

	}

	private static boolean primo(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 1) {
				return false;
			}
		}

		return true;
	}
}
