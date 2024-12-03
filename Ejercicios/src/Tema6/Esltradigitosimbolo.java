package Tema6;
import java.util.*;
public class Esltradigitosimbolo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
		
		System.out.println("Introduzca cualquier caracter");
		int ch = sc.next().charAt(0);
		
		  if (Character.isLetter(ch)) {
	            System.out.println("Es una LETRA");
	        } else if (Character.isDigit(ch)) {
	            System.out.println("Es un NUMERO");
	        } else {
	            System.out.println("Es un SIMBOLO");
	        }
	}

}
