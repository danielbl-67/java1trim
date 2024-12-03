package Condicionales;
import java.util.*;
public class Ejer1 {

	public static void main(String[] args) {
//Diseñar una aplicación que solicite al usuario un número e indique si es par o impar
		var sc = new Scanner(System.in);  
	
	System.out.println("Introduzca un numero");
	int nu = sc.nextInt();
	
	
	
	if(nu % 2 == 0 ) {
		System.out.println("Es par");
	}else {
		System.out.println("Es inpar");
	}
		
		
	
	
	
	
	}
}
