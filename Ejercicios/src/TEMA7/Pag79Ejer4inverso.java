package TEMA7;

import java.util.Arrays;

public class Pag79Ejer4inverso {

	public static void main(String[] args) {
String[] cade = new String[] {"programacion","sistemas","lenguaje","basededatos"};
		
		System.out.println("Arrayw original: ");
		for(String cadena:cade) {
			System.out.println(cadena);
		}
		Arrays.sort(cade);
		System.out.println();
	
		 for (int i = 0; i < cade.length / 2; i++) {
			 String temp = cade[i];
	         cade[i] = cade[cade.length - 1 - i];
	         cade[cade.length - 1 - i] = temp;
	     }
		
		System.out.println("Arrayw invertido: ");
		for(String cadena:cade) {
			System.out.println(cadena);
		}	
		
		
		
	}

}
