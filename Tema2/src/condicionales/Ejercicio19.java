package condicionales;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n;

		System.out.print(
				"Escriba un número entre 1 y 10: ");
		if (stdin.hasNextInt()) {
			
			n = stdin.nextInt();
			if (n == 3)
				System.out.println("Correcto, acertaste!");
			else if (n >= 1 && n <= 10)
				System.out.println(n);
			else
				System.out.println("Valor fuera de rango.");
			
		} else
			System.out.println("No ha escrito un número");
	}

}