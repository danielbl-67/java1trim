package Actividades;
import java.util.*;
public class Ejer15 {

	public static void main(String[] args) {
		// T4.1.16
		var sc = new Scanner(System.in);
	
	
	int cont=0;
	int voc=0;
	
	while(cont < 10) {
		
	System.out.println("Introduzca caracteres");
	char car=sc.next().charAt(0);
	cont++;
	
	if(car=='a'||car=='e'||car=='i'||car=='o'||car=='u') {
		voc++;
	}
	
	}
	
	System.out.println("El numero de caracteres leido es: "+voc);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}