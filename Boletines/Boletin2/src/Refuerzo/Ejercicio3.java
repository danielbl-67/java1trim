package Refuerzo;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// EjercicioRef3
		var sc = new Scanner(System.in);
		
		System.out.println("Introduce los Mb: ");
		double Mb = sc.nextDouble();
		System.out.println("Introduce los Kb: ");
		double Kb = sc.nextDouble();
	
	 double Mbakb = Mb * 1024;
	 double Kbamb = Kb / 1024;
	 
	 System.out.println("Su numero pasado a KB: " + Mbakb +"Kb");
	 System.out.println("Su numero pasado a MB: " + Kbamb +"Mb");
	 
	}
}
