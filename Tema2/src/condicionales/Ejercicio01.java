package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float temperatura;
		
		System.out.println("Temperatura del reactor: ");
		temperatura = entrada.nextFloat();

		if (temperatura > 120) {
			System.out.println(
					"TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!!");
		}

	}

}
