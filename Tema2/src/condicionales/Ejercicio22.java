package condicionales;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String dia;
		String cierre;
		
		System.out.println("Día?");
		dia = entrada.nextLine();
		
		dia = dia.toLowerCase();
		
		cierre = (dia.equals("entre semana")) 
				? "20:00":"14:00";
		
		System.out.println("Hora de cierre: " + cierre);
	}
	
}






