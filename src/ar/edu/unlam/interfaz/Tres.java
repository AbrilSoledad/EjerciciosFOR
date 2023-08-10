package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese numeros 50 veces: ");

		int contador = 0;
		int acumulador = 0;
		double promedio;

		for (int i = 1; i <= 50; i++) {
			System.out.println("Ingrese un numero: ");
			int numero = teclado.nextInt();
			if (numero % 2 == 0) {
				contador++;
				acumulador += numero;
			}
		}
		promedio = acumulador / contador;
		System.out.println("El promedio es " + promedio);

		teclado.close();
	}
}
