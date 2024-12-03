package Actividades;
import java.util.*;
public class Ejer4 {

	public static void main(String[] args) {
		
	var sc = new Scanner(System.in);
	
	System.out.println("Introduzca el numero mayor del rango");
	int max = sc.nextInt();
	System.out.println("Introduzca el numero menor del rango");
	int min = sc.nextInt();
	
	
	int num = 0;
	
	while(max != min) {
		System.out.println("Introduzca un numero que este en el rango");
		num = sc.nextInt();
		
		if(num<min) {
			System.out.println("Noooo ");
		}else if (num > max) {
			System.out.println("Noooo ");
		}
		if(num>min && num<max) {
			System.out.println("Muy bien introduzca otro");
		}else {
			System.out.println("Mal");
		}
		
	}
	sc.close();
	
	}
}