package bucles;

import java.util.Scanner;

public class Ejercicio04b {
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int num = 0;

		while (num != 3) {

			System.out.print("Escriba un número entre 1 y 5: ");
			
			if (stdin.hasNextInt()) {
				num = stdin.nextInt();
				if (num < 1 || num > 5)
					System.out.println("*** ERROR. EL NÚMERO DEBE ESTAR ENTRE 1 Y 5 a.i.");
			} else {
				System.out.println("*** ERROR. SE ESPERABA UN NÚMERO. ***");
				stdin.next();
			}
		}

		System.out.println("Acertaste. El número introducido es " + num);
	}

}