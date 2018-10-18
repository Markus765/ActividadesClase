import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1,num2;

		// Leemos los datos del usuario.
		System.out.print("Primer número: ");
		num1 = entrada.nextInt();
		
		System.out.print("Segundo número: ");
		num2 = entrada.nextInt();
		
		// Hacemos la operación.
		System.out.println("El producto es: " + num1*num2);
		
	}

}







