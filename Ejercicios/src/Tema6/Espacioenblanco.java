package Tema6;
import java.util.*;
public class Espacioenblanco {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
		
	System.out.println("Introduzca un caracter");
	char ch=sc.next().charAt(0);
	
	if(Character.isWhitespace(ch)) {
		System.out.println("Tiene espacios");
	}else {
		System.out.println("No tiene espacios");
	}

	}
}
