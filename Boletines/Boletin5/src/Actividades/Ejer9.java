package Actividades;
import java.util.*;
public class Ejer9 {
	
//----------Iterativo-------------------------------
	public static long potencia(int base,int expo) {
		int result=1;
		
		for(int i=0; i<expo;i++){
			result*=base;
		}
		return result;
	}
//---------Recursivo--------------------------------
	public static int potencia2(int base ,int expo) {
		int result=1;
		
		if(expo == 0) {
			result=1;
		}else {
			result=base*potencia2(base,expo-1);
		}
		return result;	
	}
//-----------------------------------------
	public static void main(String[] args) {
		var sc = new Scanner (System.in);

		System.out.println("Introduce un numero ");
		int base = sc.nextInt();
		System.out.println("Introduce un segundo numero ");
		int expo = sc.nextInt();
		
		if(base<=0 || expo<=0) {
			System.out.println("Introduce un numero positivo");
		}
		System.out.println("El resultado es: "+potencia(base,expo));
		System.out.println("El resultado es: "+potencia2(base,expo));
		
		
	}

}
