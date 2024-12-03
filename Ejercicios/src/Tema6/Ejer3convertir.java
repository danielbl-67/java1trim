package Tema6;
import java.util.*;
public class Ejer3convertir {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
		
		System.out.println("Introduzca un caracter ");
		char ch=sc.next().charAt(0);
		
		if(ch==Character.toUpperCase(ch)) {
			System.out.println("Invertido a minucula: "+Character.toLowerCase(ch));
		}else if (ch==Character.toLowerCase(ch)) {
			System.out.println("Invertido a mayuscula: "+Character.toUpperCase(ch));
		}else {
			System.out.println("Introduzca un caracter valido");
			
		}
		
		
		

	}

}
