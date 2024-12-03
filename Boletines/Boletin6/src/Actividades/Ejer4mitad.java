package Actividades;
import java.util.*;
public class Ejer4mitad {

	public static void main(String[] args) {
		var sc= new Scanner(System.in);

		System.out.println("Introduzca una frase");
		String frase=sc.nextLine();
		
		int longitud=frase.length();
		int pos=0;
		
		if(longitud % 2==0) {
			pos=(longitud/2)-1;
		}else {
			pos=longitud/2;
		}
		
		if(frase.charAt(pos)==' ') {
			System.out.println();
		}else {
			System.out.println("El caracter del medio no es un espacio");
		}
		
		
	}
}
