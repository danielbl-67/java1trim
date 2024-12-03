package Actividades;
import java.util.*;
public class Ejer4 {

	public static int max(int nu1,int nu2,int nu3) {
	int max=nu1;
		if(nu1<nu2) {
			max=nu2;
		}
		if (nu1<nu3) {
			max=nu3;
		}return max;
	}
	
	public static int min(int nu1,int nu2,int nu3) {
		int min=nu1;	
		if(nu1>nu2) {
			min=nu2;
		}
		if(nu1>nu3) {
			min=nu3;
		}
		return min;
	}
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("Introduzca un numero");
		int nu1 = sc.nextInt();
		System.out.println("Introduzca un numero");
		int nu2 = sc.nextInt();
		System.out.println("Introduzca un numero");
		int nu3 = sc.nextInt();
		
		int max=max(nu1,nu2,nu3);
		int min=min(nu1,nu2,nu3);

		System.out.println("El numero max es: "+max);
		System.out.println("El numero min es: "+min);
		
	
	}
}
