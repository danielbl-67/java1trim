package Condicionales;
import java.util.*;
public class Ejer2 {

	public static void main(String[] args) {
//Pedir dos números enteros y decir si son iguales o si son distintos cuál es mayor.
		var sc = new Scanner(System.in); 
	
		System.out.println("Introduzca un numero");
		int nu1 = sc.nextInt();
		System.out.println("Introduzca un segundo numero");
		int nu2 = sc.nextInt();
	
		if(nu1>nu2) {
			System.out.println("El numero"+ nu1 +"es mayor");
		}else {
			if(nu1<nu2) {
			System.out.println("El numero"+ nu2 +"es mayor");	
		}else {
			System.out.println("Son iguales");
		}
			}
	}
}
