package condicionales;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);	
		float precio;
		int unidades;
		float total;
		int descuento;
		
		System.out.print("Precio del producto: ");
		precio = entrada.nextFloat();
		
		System.out.print("Unidades: ");
		unidades = entrada.nextInt();
		
		total = precio * unidades;
		
		if(total < 100) {
			descuento = 0;
		}else if(total > 200) {
			descuento = 15;
		}else {
			descuento = 10;
		}
		
		System.out.println("\nDescuento aplicable: " 
	        + descuento + "%");
		
		total = total - total*descuento/100;
		
		System.out.println("A pagar: " + total + " €.");
		
		
	}

}
