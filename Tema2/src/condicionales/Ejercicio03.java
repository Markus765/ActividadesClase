package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float precio;
		float descuento = 0;
		
		System.out.println("Precio del producto: ");
		precio = entrada.nextFloat();

		if (precio > 80) {
			System.out.println("Se le hará un descuento del 10%.");
			descuento = precio * 10 / 100;
		}
		
		if(precio <5) {
			System.out.println("Se aplica un recargo de 2 €");
			descuento = -2;
		}

		precio = precio - descuento;
		System.out.println("El precio final es " + precio 
				+ " €.");

	}

}
