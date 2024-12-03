package Actividades;
import java.util.*;
public class Ejerc2 {
	//
	
	public static void eco(int pri,int ult) {
		
		for(int i=ult; i<=pri; i++) {
			System.out.println(i);	
		}
	}
	
	public static void main(String[] args) {
		var sc= new Scanner(System.in);
		System.out.println("Introduzca primer numero");
		int pri = sc.nextInt();
		System.out.println("Introduzca ultimo numero");
		int ult = sc.nextInt();
		
	eco(pri,ult);	
		
	}
}
