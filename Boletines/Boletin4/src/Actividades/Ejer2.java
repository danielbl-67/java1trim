package Actividades;
import java.util.*;
public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
	
	System.out.println("Introduzca la edad");
	int edad = sc.nextInt();
	
	
	int suma= 0;
	int contedad = 0;
	int contmayor = 0;
	
	while(edad>=0) {
		suma+=edad;
		contedad++;
		
		if(edad>=18) {
			contmayor++;
		}
		System.out.println("Introduzca la edad");
		edad=sc.nextInt();
		}
	
	System.out.println("La suma de las edades es "+suma);
	System.out.println("La media de las edades es "+(suma/contedad));
	System.out.println("La cantidad de mayores de edad son "+contmayor);
	}
}
