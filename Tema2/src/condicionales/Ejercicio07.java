package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		final int SECRETO = 7;

		Scanner entrada = new Scanner(System.in);
		int numero;

		System.out.println("Adivina el número secreto: ");
		numero = entrada.nextInt();

		if (numero >= 1 && numero <= 10) {

			if (numero == SECRETO) {
				System.out.println("¡Felicidades, has acertado!");
			} else {
				System.out.println("¡Has fallado!");
			}

		}

	}

}
