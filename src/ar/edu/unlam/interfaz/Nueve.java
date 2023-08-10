package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Nueve {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int contarPositivo = 0;
		double promedioPositivo = 0.0;
		int contarNegativo = 0;
		double promedioNegativo = 0.0;
		int cantidadCeros = 0;

		System.out.println("Ingrese un valor entero N menor a 12: ");
		int N = teclado.nextInt();

		if (N > 12) {
			System.out.println("VALOR EXCEDIDO");
		}
		if (N <= 0) {
			System.out.println("CANTIDAD INVALIDA");
		}

		for (int i = 1; i <= N; i++) {
			System.out.println("Ingrese el numero real " + (i + 1) + ": ");
			double ingreso = teclado.nextDouble();

			if (ingreso > 0) {
				contarPositivo += ingreso;
			} else if (ingreso < 0) {
				contarNegativo += ingreso;
			} else {
				cantidadCeros++;
			}

			promedioPositivo = contarPositivo / N;
			promedioNegativo = contarNegativo / N;

		}

		System.out.println("El promedio de los numeros positivos es " + promedioPositivo);
		System.out.println("El promedio de los numeros negativos es " + promedioNegativo);
		System.out.println("La cantidad de ceros es " + cantidadCeros);

		teclado.close();
	}
}
