package Tema6;
import java.util.*;
public class Ejer4mayuominu {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
		
		System.out.println("Introduzca una letra");
		char ch=sc.next().charAt(0) ;
		
		System.out.println("Introduzca si es M(mayusculas) o m(minuscula)");
		char tipo=sc.next().charAt(0) ;
		
		if(Character.isLetter(ch)) {
			if(tipo=='M'&& Character.isUpperCase(ch)) {
				System.out.println("La letra es mayusculas");
			}else if(tipo=='m'&& Character.isLowerCase(ch)) {
				System.out.println("La letra es minuscula");
			}else {
				System.out.println("Error la letra "+ch+" no es "+tipo);
			}
		}else {
			System.out.println("Introduzca algo valido");
		}
		
	
	}
}
