package boletin2;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		// Ejercicio9
		var sc = new Scanner(System.in);
		System.out.println("Introduzca las ventas en kg de  manzanas : ");
		double dec1 = sc.nextDouble();
		System.out.println("Introduzca las ventas en kg de pera : ");
		double dec2 = sc.nextDouble();
		//Calcula 
		double manz = dec1 * 2.35 ;	
		double pera = dec2 * 1.95 ;
		
		System.out.println("Importe total en manzanas: " + manz + "€");
		System.out.println("Importe total en peras: " + pera + "€" );
	
	}
}
