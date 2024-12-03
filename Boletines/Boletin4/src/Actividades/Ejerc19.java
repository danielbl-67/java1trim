package Actividades;
import java.util.*;
public class Ejerc19 {

	public static void main(String[] args) {
		// Bolt.19
		var sc= new Scanner(System.in);
		
	int voc=0;
	
	while(true) {
		
		System.out.println("Introduzca un caracter");
		char le = sc.next().charAt(0);
		
		if(le=='a'||le=='e'||le=='i'||le=='o'||le=='u'||
		le=='A'||le=='E'||le=='I'||le=='O'||le=='U') {
			voc++;
		}
		
		if(le=='z') {
			break;
		}
	}
	System.out.println("Numeros de vocales leídas: "+voc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
