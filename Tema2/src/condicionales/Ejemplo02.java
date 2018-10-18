package condicionales;

/*
 * Ejercicio: Crea un programa que guarde el precio de
 * un producto en una constante y que pida una cantidad 
 * al usuario. Si la cantidad es menor, indicará que falta
 * dinero. En caso contrario, dirá "Gracias por la compra".
 */
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		final float PRECIO = 55.20f;
		float pago;

		System.out.print("Dinero? ");
		pago = entrada.nextFloat();

		if (pago < PRECIO) {
			System.out.println("Falta dinero.");
		} else {
			System.out.println("Gracias por la compra.");
		}

	}

}





