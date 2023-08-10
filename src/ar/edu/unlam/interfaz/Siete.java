package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Siete {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int aplazos = 0;

		for (int i = 1; i <= 20; i++) {

			System.out.println("Ingrese la nota del alumno " + i + ": ");
			int nota = teclado.nextInt();
			System.out.println("Ingrese el legajo del alumno " + i + ": ");
			int legajo = teclado.nextInt();

			if (nota < 4) {
				aplazos++;
			} else if (nota >= 7) {
				System.out.println("El alumno con legajo " + legajo + " ha Promocionado");
			}

		}

		System.out.println("Cantidad de alumnos aplazados: " + aplazos);

		teclado.close();

	}
}
