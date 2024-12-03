package Actividades;
import java.util.*;
public class Ejer23 {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
	
	System.out.println("Introduzca un numero");	
	int num = sc.nextInt();
	
	if (num<0) {
		System.out.println("El numero debe ser positivo");
	}
	
	int mul=0;
	
	for(int i=1; i<=num; i++) {
		mul+=3*i;
		
		
	}
	
	System.out.println("La suma de los "+num +" multiplos de 3 es: " +mul);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
