package bucles;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        
        System.out.print(
        		"Introduce un número entero entre 1 y 10: ");
        int number = intro.nextInt();
        
        while(number < 1 || number > 10) {
        	
            System.out.println(
            		"Número no valido vuelve a intentarlo.");
            System.out.print(
            		"\nIntroduce un número entero entre 1 y 10: ");
            number = intro.nextInt();
            
        }
        System.out.println("Has introducido el número: " + number + ".");

        intro.close();
    }
    

}