package Actividades;
import java.util.*;
public class Ejer7formainvertida {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
	
	System.out.println("Introduzca una frase");
	String frase = sc.nextLine();
	
	  String resultado = "";  
	  // desde el final hasta el principio
      for (int i = frase.length() - 1; i >= 0; i--) {
          resultado += frase.charAt(i); //  Cocatena carácter actual
      }
     
      String cadenaInvertida = resultado; 
      System.out.println("Cadena invertida: " + cadenaInvertida); 
	
	}
}
