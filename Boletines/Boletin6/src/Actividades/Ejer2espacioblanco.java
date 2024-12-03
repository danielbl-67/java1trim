package Actividades;
import java.util.*;
public class Ejer2espacioblanco {

	public static void main(String[] args) {
		var sc= new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		String frase=sc.nextLine();
		
		int cont=0;	
		for(int i=0; i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				cont++;
			}
		}
		
	System.out.println("Este es el numero de espacios en blancos "+cont);
	sc.close();
	
	}

}
