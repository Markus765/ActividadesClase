package bucles;
import java.util.Scanner;
public class Ejercicio02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        byte contador = 1, objetivo;
        char caracter;
        
        System.out.print("Escribe un carácter: ");
        caracter = entrada.next().charAt(0);
        
        System.out.println("¿Cuantas veces quieres repetirlo?");
        objetivo = entrada.nextByte();
        
        while (contador <= objetivo) {
            
            System.out.print(caracter + " ");
            System.out.println(contador);
            contador++;
            
        }
        
        
        entrada.close();
    }

}




