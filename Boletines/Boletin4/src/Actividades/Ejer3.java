package Actividades;
import java.util.*;
public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		int ale =(int)(Math.random()*100);
		int usu = 0;
		boolean acierto=false;
		
		
		 while (!acierto) {
	            System.out.print("Introduzca un número (-1 para rendirse): ");
	            usu = sc.nextInt(); 
	            
	            if (usu == -1) {
	                System.out.println("Te has rendido. El número secreto era: " + ale);
	                break; 
	            }
	            
	            if (usu > ale) {
	                System.out.println("Es mayor que el número secreto.");
	            } else if (usu < ale) {
	                System.out.println("Es menor que el número secreto.");
	            } else {
	                System.out.println("¡HAS GANADO!");
	                acierto = true; // Cambiar a verdadero para salir del bucle
	            }
	        }
	      
	        sc.close();
	}

}
