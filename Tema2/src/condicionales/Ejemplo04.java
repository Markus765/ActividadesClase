package condicionales;

import java.util.Scanner;

/*
Ejercicio que pida las notas de tres evaluaciones y
calcule la media.
 */

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float nota1 = 0, nota2 = 0, nota3 = 0; // Notas de cada evaluación
		float media; // Nota media del curso.

		System.out.print("Nota 1ª Eval: ");

		if (entrada.hasNextFloat() == true) {
			nota1 = entrada.nextFloat();
		} else {
			System.out.println("El programa esperaba un número. ERROR.");
			System.exit(0);
		}

		System.out.print("Nota 2ª Eval: ");
		if (entrada.hasNextFloat() == true) {
			nota2 = entrada.nextFloat();
		} else {
			System.out.println("El programa esperaba un número. ERROR.");
			System.exit(0);
		}

		System.out.print("Nota 3ª Eval: ");
		if (entrada.hasNextFloat() == true) {
			nota3 = entrada.nextFloat();
		} else {
			System.out.println("El programa esperaba un número. ERROR.");
			System.exit(0);
		}

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("\nMedia del curso: " + media);

	}

}