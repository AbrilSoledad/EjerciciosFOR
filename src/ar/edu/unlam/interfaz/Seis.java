package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Cantidad de numeros que ingresara: ");
		int n = teclado.nextInt();

		int sumaMultiplo3 = 0;
		int cantidadMultiplo5 = 0;
		int sumaPares = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + ": ");
			int num = teclado.nextInt();

			if (num % 3 == 0) {
				sumaMultiplo3 += num;
			}

			if (num % 5 == 0) {
				cantidadMultiplo5++;
			}

			if (i % 2 == 1) {
				sumaPares += num;
			}

		}

		System.out.println("a. La sumatoria de los valores multiplos de 3 es: " + sumaMultiplo3);
		System.out.println("b. La cantidad de valores multiplos de 5 es: " + cantidadMultiplo5);
		System.out.println("c. La sumatoria de los valores ingresados en orden par es: " + sumaPares);

		teclado.close();
	}
}
