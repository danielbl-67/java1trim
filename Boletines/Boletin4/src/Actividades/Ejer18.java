package Actividades;

import java.util.*;
public class Ejer18 {

	public static void main(String[] args) {
		// T4.1.18
		var sc = new Scanner(System.in);
	
	int num;
	int sum=0;
	int cont=0;	
	
	do {
		System.out.println("Introduzca numero entero");
		num=sc.nextInt();
	
		if(num>=0){
			sum+=num;
			cont++;
		}
		
	}while(num>=0); 
		double med= sum/cont;	
		System.out.println("La media aritmetica es: "+med);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}