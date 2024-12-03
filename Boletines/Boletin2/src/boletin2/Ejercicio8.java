package boletin2;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		// Ejercicio8
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero decimal: ");
		double dec1 = sc.nextDouble();
		//Al sumarle 0,5 te lo redondea
		double redo = (int)(dec1 + 0.5);
		
		System.out.println("Su numero redondeado es: " + (int)redo);
	}
}
