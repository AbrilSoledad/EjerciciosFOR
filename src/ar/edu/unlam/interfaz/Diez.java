package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Diez {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int ternaPositiva = 0;
		int ternaNegativa = 0;
		int contadorPositivo = 0;
		int contadorNegativo = 0;

		for (int i = 1; i <= 18; i++) {

			System.out.println("Ingresar el valor de la temperatura " + i + ":");
			double temperatura = teclado.nextDouble();

			if (temperatura > 0) {
				contadorPositivo++;
				contadorNegativo = 0;

				if (contadorPositivo == 3) {
					ternaPositiva++;
					contadorPositivo = 0; // reiniciar el contador
				}

			} else if (temperatura < 0) {
				contadorNegativo++;
				contadorPositivo = 0;

				if (contadorNegativo == 3) {
					ternaNegativa++;
					contadorNegativo = 0;
				} else {
					contadorPositivo = 0;
					contadorNegativo = 0;
				}

			}

		}

		System.out.println("La cantidad de ternas (3 valores + seguidos) es " + ternaPositiva);
		System.out.println("La cantidad de ternas (3 valores - seguidos) es " + ternaNegativa);

		teclado.close();
	}
}
