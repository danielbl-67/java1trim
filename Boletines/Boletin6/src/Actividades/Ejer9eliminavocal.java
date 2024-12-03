package Actividades;
import java.util.*;
public class Ejer9eliminavocal {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		
	System.out.println("Introduzca su nombre y apellidos completo");
	String nom = sc.nextLine();
	
    String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
    String resultado = "";
    
    for (int i = 0; i < nom.length(); i++) {
        char c = nom.charAt(i); 
// Si el carácter no es una vocal, lo agregamos al resultado
        if (vocales.indexOf(c) == -1) {
            resultado += c;  
     // Concatenar carácter al resultado
        }
    }
    System.out.println("Nombre sin vocales: "+resultado); 
	
}
}