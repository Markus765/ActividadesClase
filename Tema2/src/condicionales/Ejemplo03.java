package condicionales;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int nota;
		
		System.out.println("Nota: ");
		nota = entrada.nextInt();
		
		// Suponemos que las notas pueden ser introducidas 
		// de forma errónea (nota entre 0 y 10). 
		if(nota<0 || nota>10) {
			System.out.println("NOTA NO VÁLIDA.");
		} else if(nota < 5) {
			System.out.println("INSUFICIENTE");
		} else if(nota<6) {
			System.out.println("SUFICIENTE");
		} else if(nota<7) {
			System.out.println("BIEN");
		} else if(nota<9) {
			System.out.println("NOTABLE");
		} else {
			System.out.println("EXCELENTE");
		}

	}

}











