package Actividades;
import java.util.*;
public class Ejer8 {

public static int sumaDiv(int n) {
		
		int cont=0;
		
		for(int j=1; j<n ; j++) {
			if(n %j == 0) {
				cont+=j;
			}
		}return cont;
	}
	//-----------------------------------------
	public static void main(String[] args) {
		var sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero ");
		int n1 = sc.nextInt();
		System.out.println("Introduce un segundo numero ");
		int n2 = sc.nextInt();
		//
		int sumaDivn1=sumaDiv(n1);
		int sumaDivn2=sumaDiv(n2);
		//
		System.out.println("Los números divisores del 1er número es: " +sumaDivn1);
		System.out.println("Los números divisores del 2do número es: " +sumaDivn2);
		
		if(sumaDivn1==n2 && sumaDivn2==n1) {
		System.out.println("Los numeros son primos");
		}
		
	}

}
