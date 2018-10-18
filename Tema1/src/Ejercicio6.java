import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		float precio;
		int unidades;

		// Leemos todos los datos.
		System.out.print("Nombre del producto? ");
		nombre = entrada.nextLine();

		System.out.print("Precio del producto? ");
		precio = entrada.nextFloat();

		System.out.print("Unidades? ");
		unidades = entrada.nextInt();

		// Calculamos el precio final.
		float precioTotal = precio * unidades;

		// Mostrar toda la información que nos pedían.
		System.out.println("\nPrecio total: " 
				+ precioTotal + " €.");

	}

}
