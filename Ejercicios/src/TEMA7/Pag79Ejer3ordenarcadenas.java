package TEMA7;
import java.util.*;
public class Pag79Ejer3ordenarcadenas {

	public static void main(String[] args) {
		var sc =new Scanner(System.in);
		
		String[] cade = new String[] {"programacion","sistemas","lenguaje","basededatos"};
		
		System.out.println("Arrayw original: ");
		for(String cadena:cade) {
			System.out.println(cadena);
		}
		Arrays.sort(cade);
		System.out.println();
	
		
		System.out.println("Arrayw ordenado: ");
		for(String cadena:cade) {
			System.out.println(cadena);
		}
		 
		
		
	}

}
