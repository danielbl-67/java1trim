package Refuerzo;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// EjercicioRef2
		var sc = new Scanner(System.in);
	
		System.out.println("Introduce las horas semanales: ");
		double horas = sc.nextDouble();
		
		double salSem = horas * 12 ;
		
		System.out.println("Tu salario semanal es de: "+salSem + "€");
	}
}
