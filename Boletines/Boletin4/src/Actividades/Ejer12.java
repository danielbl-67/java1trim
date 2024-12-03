package Actividades;
import java.util.*;
public class Ejer12 {

	public static void main(String[] args) {
	
		var sc = new Scanner(System.in);
		
	int nota=0;	
	int susp=0;
		
	for (int i=1; i<=5; i++) {
		System.out.println("Introduzca su "+ i +" nota ");
		nota=sc.nextInt();
		
		if(nota<5) {
			susp++;	
		}
	
	}	
	System.out.println("Numero de suspensos: "+susp);
	sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
