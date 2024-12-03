package Actividades;
import java.util.*;
public class Ejer8reveticionespalabras {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
	
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		
		System.out.println("Introduzca la palabra a buscar");
		String pala = sc.nextLine();

		String fraseMin= frase.toLowerCase();
	    String palabraMi = pala.toLowerCase();
		int index = 0;
		int cont=0;
		// Mover el índice a la posición después de la palabra encontrada
        while ((index = fraseMin.indexOf(palabraMi, index)) != -1) {
        	cont++;
            index += palabraMi.length(); 
        }
        
		System.out.println("La palabra ha aparecido en la frase "+cont+" veces");
}
}
