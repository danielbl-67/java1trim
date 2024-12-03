package Condicionales;
import java.util.*;
public class Ejer3 {

	public static void main(String[] args) {
		//Implementar un programa que pida por teclado un número decimal e indique si es un
		//número casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por
		//menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero decimal");
		double nu1 = sc.nextDouble();
	
	if(Math.abs(nu1) < 1 && nu1 !=0) {
		System.out.println("El numero "+nu1+" es casi-cero");
	}else {
		System.out.println("El numero "+nu1+" no es casi-cero");
	}
	sc.close();
	}
}
