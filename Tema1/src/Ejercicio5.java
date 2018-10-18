import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		float precio;
		int descuento;

		// Leemos todos los datos.
		System.out.print("Nombre del producto? ");
		nombre = entrada.nextLine();

		System.out.print("Precio del producto? ");
		precio = entrada.nextFloat();

		System.out.print("Descuento? ");
		descuento = entrada.nextInt();

		// Calculamos el precio final.
		float descuentoEnEuros = precio * descuento / 100;
		float precioFinal = precio - descuentoEnEuros;

		// Mostrar toda la información que nos pedían.
		System.out.println("\nArtículo: " + nombre);
		System.out.println("Precio original: " + precio + " €.");
		System.out.println("Descuento: " + descuento + "%");
		System.out.println("Precio rebajado: " + precioFinal + " €.");

	}

}
