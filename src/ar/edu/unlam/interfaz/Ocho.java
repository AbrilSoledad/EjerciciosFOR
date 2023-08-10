package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Ocho {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		double promedioEdad = 0.0;
		double promedioAltura = 0.0;
		int sumaEdad = 0;
		double sumaAltura = 0;
		int mas10 = 0;
		int menos140 = 0;

		for (int i = 1; i <= 45; i++) {
			System.out.println("Ingrese la edad del alumno " + i + ": ");
			int edad = tc.nextInt();
			System.out.println("Ingrese la altura del alumno " + i + ": ");
			double altura = tc.nextDouble();

			sumaEdad += edad;
			sumaAltura += altura;

			if (edad > 10) {
				mas10++;
			}

			if (altura < 1.40) {
				menos140++;
			}

		}

		promedioEdad = sumaEdad / 45;
		promedioAltura = sumaAltura / 45;

		System.out.println("El promedio de la edad es " + promedioEdad);
		System.out.println("El promedio de la altura es " + promedioAltura);
		System.out.println("Cantidad de alumnos mayores a 10 años " + mas10);
		System.out.println("Cantidad de alumnos menores al 1.40cm " + menos140);

		tc.close();
	}
}
