package condicionales;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int entero;
        
        System.out.println(
        		"Escriba un número entero entre el 1 y el 10");
        
        if(entrada.hasNextInt() == true) {
            entero = entrada.nextInt();
            System.out.println(
            		"Tú número es el " + entero);
        } else {
            System.out.println(
            		"ERROR. Escriba un número entero");
        }

    }

}



