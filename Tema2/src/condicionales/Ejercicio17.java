package condicionales;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float num1, num2;
		int operacion;

		System.out.println("***** CALCULADORA *****");

		System.out.print("Operando 1: ");
		num1 = entrada.nextFloat();

		System.out.print("Operando 2: ");
		num2 = entrada.nextFloat();

		System.out.println("Elige qué operación quieres realizar:");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");

		operacion = entrada.nextInt();

		switch (operacion) {
		case 1:
			System.out.println(num1 + num2);
			break;

		case 2:
			System.out.println(num1 - num2);
			break;

		case 3:
			System.out.println(num1 * num2);
			break;

		case 4:
			System.out.println(num1 / num2);
			break;

		}

	}

}
