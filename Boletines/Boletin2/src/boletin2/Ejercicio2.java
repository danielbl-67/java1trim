package boletin2;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// Ejercicio2
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int numero2 = sc.nextInt();
		//Verifica si el nº es distinto de cero antes de dividir
		var division =(numero2 == 0)? "Incorrecto,no se puede dividir por 0": (double)numero1/numero2;   ;
		
		
		System.out.println("La suma es: " + (numero1+numero2));
		System.out.println("La resta es: " + (numero1-numero2));
		System.out.println("La multiplicacion es: " + (numero1*numero2));
		System.out.println("La division es: " + division );
	}
}
