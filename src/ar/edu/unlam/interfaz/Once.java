package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Once {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int factorial = 1;

		System.out.println("Ingrese un numero por teclado: ");
		int ingreso = teclado.nextInt();

		for (int i = ingreso; i > 0; i--) {
			factorial = factorial * i;
	
		}

		System.out.println("El factorail de " + ingreso + " es " + factorial);

		teclado.close();
	}
}
