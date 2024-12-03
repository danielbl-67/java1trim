package boletin2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Ejercicio6
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca la primera nota: ");
		int valor1 = sc.nextInt();
		System.out.println("Introduzca la segunda nota: ");
		int valor2 = sc.nextInt();
		
		double resu = valor1 + valor2 ;
		
		System.out.println("La nota media: " + resu/2 );
	}
}
