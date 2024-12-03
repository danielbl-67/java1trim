package Actividades;
import java.util.*;
public class Ejer3centralesespacio {

	public static void main(String[] args) {
		var sc= new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		String frase=sc.nextLine();
		//CALCULA LA POSICION
		int longitud=frase.length();
		int pos=longitud/2;
		//INSERTA <>
	String resp= frase.substring(0,pos)+"<>"+frase.substring(pos);
		//
	System.out.println("Resultado: "+resp);
	
	}



}
