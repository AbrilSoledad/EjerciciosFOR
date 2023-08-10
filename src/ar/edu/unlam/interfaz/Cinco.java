package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la cantidad N de numeros que desea sumar");
		int n = teclado.nextInt();
		int contador = 0;

		for (int i = 0; i < n; i++) {
			contador += i;
		}

		System.out.println("La suma de los primeros " + n + " numeros naturales es " + contador);

		teclado.close();

	}
}
