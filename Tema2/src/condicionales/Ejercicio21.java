package condicionales;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner intro = new Scanner(System.in);

		System.out.println("Bienvenido a Mercadona!");
		System.out.println("-----------------------");
		System.out.print("Nombre de usuario: ");
		String usuario = intro.nextLine();
		System.out.println(
				"Tu usuario no requiere contraseña.");

		usuario = (usuario.equals("")) ? 
				"Desconocido" : usuario;

		System.out.println(
				"\nHas iniciado sesión correctamente!");
		System.out.println(
				"Bienvenid@ de vuelta: " + usuario);

	}

}
