package bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;

		System.out.println("Dame un numero entre el 1 y el 5: ");
		numero = entrada.nextInt();

		while (numero != 3) {
			System.out.println("Incorrecto, otro numero entre el 1 y el 5: ");
			numero = entrada.nextInt();
		}

		System.out.println("has acertado");

		entrada.close();

	}

}