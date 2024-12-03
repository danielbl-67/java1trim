package boletin2;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		//Ejercicio10
		var sc = new Scanner(System.in);
		
		//Manzanas kg y precio
		System.out.println("Introduzca las ventas en kg de manzanas : ");
		double dec1 = sc.nextDouble();
		System.out.println("Introduzca el precio de las manzanas : ");
		double pre1 = sc.nextDouble();
		
		//Peras kg y precio
		System.out.println("Introduzca las ventas en kg de pera : ");
		double dec2 = sc.nextDouble();
		System.out.println("Introduzca el precio de las pera : ");
		double pre2 = sc.nextDouble();
		
		//Calcula 
		double manz = dec1 * pre1 ;	
		double pera = dec2 * pre2 ;
		
		System.out.println("Importe total en manzanas: " + manz + "€");
		System.out.println("Importe total en peras: " + pera + "€" );
	}
}
