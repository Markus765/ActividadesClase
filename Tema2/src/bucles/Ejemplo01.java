package bucles;

// Programa que repita nuestro nombre 1000 veces.
public class Ejemplo01 {

	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 1000 ) {
			
			System.out.println(contador + "\tCarlos");
			contador++;
			
		}
		
		System.out.println("Ya tienes las 1000 impresiones.");
		
	}

}