package Tema6;
import java.util.*;
public class Ejeigualesmaymin {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
		
		System.out.println("Introduzca un caracter");
		char cha1 =sc.next().charAt(0);
		System.out.println("Introduzca un caracter");
		char cha2 =sc.next().charAt(0);
		
		//Convierto para comparar 
		 char ch1 = Character.toLowerCase(cha1);
	     char ch2 = Character.toLowerCase(cha2);
		
		if(ch1==ch2) {
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		
	}
}
