package Refuerzo;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// EjercicioRef1
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce el la base: ");
		double bas1 = sc.nextDouble();	
		
		double IVA = (bas1 *0.21) + bas1 ;
		
		System.out.println("El total de la base mas el iva es: " + IVA + "€" );
	}
}
