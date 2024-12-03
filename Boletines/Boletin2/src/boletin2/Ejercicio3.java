package boletin2;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// Ejercicio3
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce su nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce su edad");
		int edad = sc.nextInt();
		
		System.out.println("Su nombre es: "+ nombre);
		System.out.println("Y su edad el año que viene es: " + (1 + edad));
		
		
	}
}
