import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, resto;
		
		System.out.println("Primer número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Segundo número: ");
		num2 = entrada.nextInt();
		
		resto = num1%num2;
		System.out.println("El resto de dividir " + num1 + 
				" entre " + num2 + " da " + resto);
	}

}
