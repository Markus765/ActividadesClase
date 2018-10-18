import java.util.Scanner;

public class Ejemplo9 {

	public static void main(String[] args) {
		
		// Declaramos una variable de tipo Scanner,
		// que nos permitirá leer de la terminal.
		Scanner entrada = new Scanner(System.in);
		
		// Declaramos otras dos variables que necesitaremos.
		String nombre;
		int edad;
		
		// Leemos el nombre del usuario.
		System.out.print("Cómo te llamas? ");
		nombre = entrada.nextLine();
		
		// Leemos la edad del usuario.
		System.out.print("Cuántos años tienes? ");
		edad = entrada.nextInt();
		
		// Mostramos una frase al usuario.
		System.out.println("Hola, " + nombre 
				+ ", no parece que tengas " + edad + " años.");
		
		entrada.close();
	}

}










