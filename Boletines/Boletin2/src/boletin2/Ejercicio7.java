package boletin2;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// Ejercicio7
	var sc = new Scanner(System.in);
		
		System.out.println("Introduzca la primera nota: ");
		double valor1 = sc.nextDouble();
		System.out.println("Introduzca la segunda nota: ");
		double valor2 = sc.nextDouble();
		System.out.println("Introduzca la tercera nota: ");
		double valor3 = sc.nextDouble();
		//Suma nota 
		double resu = (int)(valor1 + valor2 + valor3 +0.5 );
		//Calcula media
		int media = (int)resu/3 ;
		
		System.out.printf("La nota media: " + media);
	}
}
