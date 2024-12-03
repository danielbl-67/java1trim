package Actividades;
import java.util.*;
public class Ejer6 {
	//-----------------------------------------
	public static boolean esPrimo(int num) {
		boolean esPrimo=true;
			for(int j=2; j<num && esPrimo; j++) {
				if(num %j == 0) {
					esPrimo=false;
				}
			}return esPrimo;	
		}
	//-----------------------------------------
	public static int divisorPrimo(int n1) {
		
		int contPrimo=0;
		
		for(int j=1; j<n1 ; j++) {
			if(n1 %j == 0) {
				if (esPrimo(j))
						contPrimo++;
			}
		}return contPrimo;
	}
	//-----------------------------------------
	public static void main(String[] args) {
		var sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número: ");
		int numero = sc.nextInt();
		
		System.out.println("Los números divisores de ese número que has introducido "
				+ "son: " + divisorPrimo(numero));
	}
		
}
