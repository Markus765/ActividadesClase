package condicionales;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int edad;
		boolean mayorDeEdad;

		System.out.print("Edad? ");
		edad = entrada.nextInt();

		mayorDeEdad = (edad < 18) ? false : true;
		
		System.out.println(mayorDeEdad);

		entrada.close();
	}

}






