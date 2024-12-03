package Actividades;
import java.util.*;
public class Ejer16 {

	public static void main(String[] args) {
		// T4.1.16
		var sc = new Scanner(System.in);
	
		
		int num=0;
		int pos=0;
		int neg=0;
		int nul=0;
		int par=0;
		int inp=0;
		
		for (int i=0; i<=10; i++) {
			System.out.println("Introduzca numero entero ");
			num=sc.nextInt();
		if(num % 2==0) {
			par++;
		}else if (num % 3 ==0) {
			inp++;
		}
		if (num<0) {
			neg++;
		}else if(num>0) {
			pos++;
		}else {
			nul++;
		}
	}
		
		System.out.println("Numeros positivos: "+pos);
		System.out.println("Numero negativos: "+neg);
		System.out.println("Numeros pares: "+par);	
		System.out.println("Numeros inpares: "+inp);
		System.out.println("Numeros nulos: "+nul);

	}
}