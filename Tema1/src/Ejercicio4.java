import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		int nota1, nota2, nota3;
		float media;
		
		System.out.print("Nombre del alumno? ");
		nombre = entrada.nextLine();
		
		System.out.print("Nota 1ª Eval? ");
		nota1 = entrada.nextInt();
		
		System.out.print("Nota 2ª Eval? ");
		nota2 = entrada.nextInt();
		
		System.out.print("Nota 3ª Eval? ");
		nota3 = entrada.nextInt();
		
		media = (nota1+nota2+nota3)/3f;
		
		System.out.println("Nota media = " + media);
		
		

	}

}









