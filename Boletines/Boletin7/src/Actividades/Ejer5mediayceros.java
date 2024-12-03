package Actividades;
import java.util.*;
public class Ejer5mediayceros {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
	
	    System.out.println("Introduzca la cantidad de números (n):");
	    int n=sc.nextInt();
	    
	    int[] num=new int[n];
	    
	    int ceros=0;
		int sumapos=0;
		int sumaneg=0;
		int contpos=0;
		int contneg=0;
	      
		for(int i=1;i<=n;i++) {
			System.out.println("Introduce el numero "+i+" : ");
			int ns =sc.nextInt();
			if(ns>0) {
				sumapos+=ns;
				contpos++;
			}else if(ns<0) {
				sumaneg+=ns;
				contneg++;
			}else {
				ceros++;
			}
		}
		int media=sumapos/contpos;
		int medianeg=sumaneg/contneg;
		if(contpos>0) {
			System.out.println("La media de los números positivos es: "+media);  
		}else if (contneg>0){
			System.out.println("La media de los números negativos es: "+medianeg);
		}
		System.out.println("El número de ceros introducidos es: "+ceros);
	       
	}

}
