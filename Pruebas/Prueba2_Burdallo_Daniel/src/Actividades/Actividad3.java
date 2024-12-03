package Actividades;
import java.util.*;
public class Actividad3 {

	public static void main(String[] args) {
		// Ejercicio 3
		var sc=new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num=sc.nextInt();
	if(num<0) {
		System.out.println("Introduzca un numero positivo");
		num=sc.nextInt();
	}
		
	System.out.println("Introduzca numero");
	int num2=sc.nextInt();
	
	
	for(int i=1;i<=num;i++) {
		int tot=i/num2;
		
		System.out.println(i/num2);
		
		if(tot<5){
			System.out.println("Los numero son cercanos");
			
		}else if(tot>5){
			System.out.println("Los numeros son lejanos");
		}
	}

	}
}
