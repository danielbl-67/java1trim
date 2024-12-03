package Actividades;
import java.util.*;
public class Ejer7 {

	public static boolean esPrimo(int num) {
		boolean esPrimo=true;
			for(int j=2; j<num && esPrimo; j++) {
				if(num %j == 0) {
					esPrimo=false;
				}
			}
			return esPrimo;	
		}
	
	public static void divisorPrimo(int n1) {
		
		int contPrimo=0;
		
		for(int j=2; j<n1 ; j++) {
			if(n1 %j == 0) {
				if (esPrimo(j))
						contPrimo++;
				System.out.println(contPrimo);
			}
			
		}
	}
	
	public static void main(String[] args) {
		var sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número: ");
		int num = sc.nextInt();
	divisorPrimo(num);
		
		}
	}
