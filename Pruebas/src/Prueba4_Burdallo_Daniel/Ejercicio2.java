package Prueba4_Burdallo_Daniel;
import java.util.*;
public class Ejercicio2 {
	//---------------------------------------
	public static void main(String[] args) {
		var sc=new Scanner(System.in);

		System.out.println("Introduzca una frase");
		String cad = sc.nextLine();
		numeroPalabras(cad);
		palabrasMayus(cad);
		invertido(cad);
	}
	//---------------------------------------
	public static void numeroPalabras(String cad) {	
		int numPal=cad.length();
		System.out.println("El numero de caracteres es: "+numPal);
	
	}
	//---------------------------------------
	public static void palabrasMayus(String cad ) {
		int numMay = 0;
		String cade= cad;
		for(int i=0; i<cade.length(); i++) {
			char may=cade.charAt(i);
			if(Character.isUpperCase(may)) {
				numMay++;
			}
		}
		System.out.println("El numero de caracteres en mayusculas es: "+numMay);
	}
	//---------------------------------------
	public static void invertido(String cad) {
		String resultado = "";  
	     
		for (int i=cad.length()-1; i>=0; i--) {
	          resultado += cad.charAt(i); 
	     }
	     String invert = resultado; 
	     System.out.println("Cadena invertida: " + invert); 
		
	}
	
	
}