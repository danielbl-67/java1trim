package boletin2;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// Ejercicio1
		
		var sc = new Scanner(System.in);
	System.out.println("Introduce el radio de la circurferencia: ");	
		
		double radio = sc.nextDouble();//pide radio por teclado
		
		double area = 3.14159 * radio * radio;//calcula el area y lo muestra
		
		double longitud = 2 * 3.14159 * radio;//calcula la longitud y lo muestra 
		
		System.out.println("El area de la circurferencia es: " + area );
		System.out.println("La longitud de la circurferencia es: " + longitud);
	}

}
