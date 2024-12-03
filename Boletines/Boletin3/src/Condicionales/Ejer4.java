package Condicionales;
import java.util.*;
public class Ejer4 {

	public static void main(String[] args) {
		//Escribe un programa que calcule el salario semanal de un trabajador teniendo en
		//cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros
		//la hora. A partir de la hora 41, se pagan a 16 euros la hora.

		var sc = new Scanner(System.in);
	
		System.out.println("Introduzca horas echadas");
		int ech =sc.nextInt();
		
		
		if(ech >= 40) {
			System.out.printf("Tu salario normal es de: "+(ech*12) +"€");
		
		}else {
		System.out.printf("Tu salario extra: "+ ((40*12)+(ech-40)*16) +"€");
		}
	
	}
}
