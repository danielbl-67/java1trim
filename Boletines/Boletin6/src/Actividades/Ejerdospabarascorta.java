package Actividades;
import java.util.*;
public class Ejerdospabarascorta {

	public static void main(String[] args) {
		var sc= new Scanner(System.in);
		
		System.out.println("Introduzca una palabra");
		String pal1=sc.nextLine();
		System.out.println("Introduzca otra palabra");
		String pal2=sc.nextLine();
		
		if(pal1.length()> pal2.length()) {
			System.out.println("La palabra mas larga es: "+pal1);
		}else if(pal1.length()< pal2.length()) {
			System.out.println("La palabra mas larga es: "+pal2);
		}else {
			System.out.println("Las palabras son iguales");
		}
		
		
		
		
		
		
		
	}

}
