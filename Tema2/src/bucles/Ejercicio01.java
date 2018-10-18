package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String caracter;
		int contador = 1;

		System.out.println("Pide un caracter");
		caracter = entrada.nextLine();

		while (contador <= 100) {
			System.out.println(contador + caracter);
			contador++;
		}

	}

}