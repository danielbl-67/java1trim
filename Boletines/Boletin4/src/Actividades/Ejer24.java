package Actividades;
import java.util.*;
public class Ejer24 {

	public static void main(String[] args) {
	var sc= new Scanner(System.in);	

	
	System.out.print("Introduzca un numero");
	int num =sc.nextInt();

	 for (int i = 1; i <= num; i++) {
         // Imprimir espacios
		 
         for (int j = 0; j <= num-i; j++) {
             System.out.print("* ");
         }// Imprimir asteriscos
         
         for (int k = 0; k <=i; k++) {
             System.out.print(" ");
         }// Nueva línea
         
         System.out.println();
     }
	
	
	
	
	
	
	
	}
}
