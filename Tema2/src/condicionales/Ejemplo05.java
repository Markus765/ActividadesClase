package condicionales;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		int edad;

		System.out.println("Edad:");
		edad = entrada.nextInt();

		entrada.nextLine();

		System.out.println("Nombre: ");
		nombre = entrada.nextLine();

		System.out.println("Fin del programa");

	}

}
