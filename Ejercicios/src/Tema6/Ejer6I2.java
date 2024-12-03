package Tema6;
import java.util.*;
public class Ejer6I2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 

		System.out.println("Introduzca una frase");
	 	String frase=sc.nextLine();
	    System.out.println("Introduzca el caracter que quieres saber");
	 	char remp=sc.next().charAt(0);
		
		int cont=0;
		
		for(int i=0;i<frase.length();i++) {
			
			if(frase.charAt(i)==remp) {
				cont++;
			}
		}
		 System.out.println("El carácter '" + remp + "' aparece " + cont + " veces en la cadena.");


		
		
		
		
		
	}

}
