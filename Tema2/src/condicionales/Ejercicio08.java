package condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		final String COMPUTER = "computer";

		Scanner entrada = new Scanner(System.in);
		String palabra;
		
		System.out.println("¿Cómo se dice ordenador en inglés?");
		palabra = entrada.nextLine();
		
		if(palabra.equals(COMPUTER)) {
			System.out.println("Enhorabuena.");
		}else {
			System.out.println("Más suerte la próxima vez.");
		}
		
	}

}










