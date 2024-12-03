package boletin2;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// Ejercicio4
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce año actual: ");
		int aActual = sc.nextInt();
		
		System.out.println("Introduce tu año de nacimiento: ");
		int aNaci = sc.nextInt();
		
		int calcAño =  aActual - aNaci ;
		
		System.out.println("Usted tiene :" + calcAño);
	}
}
