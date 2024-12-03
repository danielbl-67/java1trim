package Actividades;
import java.util.*;
public class Ejer1 {

	public static void eco(int n) {
		
		for(int i=0; i<=n;i++) {
			System.out.println("ECO...");
		}
		
	
		}
	
	public static void main(String[] args) {
		var sc= new Scanner(System.in);
	
		System.out.println("Introduzca el numero de veces que se imprima ECO");
	int n =sc.nextInt();
	
	eco(n);
	
	
	
	
	
	}
}
