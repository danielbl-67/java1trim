package Actividades;
import java.util.*;
public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca la altura del arbol 1");
		int alt=sc.nextInt();
		
		int count=0;
		int maxalt = alt;
		int arbolMax= count;
		
		while(alt != -1) {
			if(alt>maxalt) {
				maxalt=alt;
				arbolMax=count;
			}
			System.out.println("Introduzca otra altura de un arbol");
			alt=sc.nextInt();
			count++;
		}
		System.out.println("El arbol mas alto es " +arbolMax +" con una altura de: " +maxalt);
		
		
		
		
		
		
		
	
	
	}
}
