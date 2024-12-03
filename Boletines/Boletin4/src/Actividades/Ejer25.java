package Actividades;
import java.util.*;
public class Ejer25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc= new Scanner(System.in);
	
		
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		
		int count =0;
		int pri=0;
		
		//Verifica no sea negativo
		if(num<0) {
			System.out.println("Por favor, introduzca un número entero positivo mayor que 0.");      
		}
		
		boolean esP;
		
		//
		for(int i=1; i<=num; i++) {
			esP=true;
			
			for(int j=2; j<i && esP; j++) {
				
				if(i % j==0) {
					esP=false;
					System.out.println("El numero "+i+" no es primo");
					
				}
				
				if(esP) {
					pri++;
					System.out.println("El numero "+i+" es primo");
				}
			}
		}
		
		
	}
}
