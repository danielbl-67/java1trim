package Actividades;
import java.util.*;
public class Ejer2rellenaprimos {
//------------------------------------------------
	public static void main(String[] args) {
		var sc=new Scanner(System.in);

		int tama=100;
		//almacena lo primos
		int[] numpri=new int[tama];
		int indice=0;
		//encontrar y almacenar numprim
	        for (int i=1; i<tama;i++) {
	            if(esPrimo(i)) {
	            	numpri[indice]=i;
	            	indice++;
	            }
	        }
	        System.out.println("");
	        for(int i=0; i<indice;i++) {
	        	System.out.println(numpri[i] +" ");
	        }
	 }
//------------------------------------------------
	public static boolean esPrimo(int num) {
		boolean primo =true;
		for(int div=2;div<num && primo;div++) {
			if(num % div==0) {
				primo=false;
			}
		}return primo;
		
	}
}
