package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Cuatro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese 100 letras");

		int contador = 0;

		for (int i = 1; i <= 100; i++) {
			System.out.println("Ingrese una letra: ");
			char letra = teclado.next().charAt(0);
			switch (letra) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				contador++;
			}
			System.out.println("cantidad de vocales " + contador);

		}

		teclado.close();
	}
}
