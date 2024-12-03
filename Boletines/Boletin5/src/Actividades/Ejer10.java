package Actividades;
import java.util.*;
public class Ejer10 {
	//-----------------------------------------
	public static long fibo(int n) {
		long result=0;
		if(n==0 || n==1) {
			result=1;
		}else {
			result=fibo(n-1)+fibo(n-2);
		}
		return result;
	}
	
	//-----------------------------------------
	public static void main(String[] args) {
		var sc = new Scanner (System.in);
		System.out.println("Introduce un numero ");
		int n = sc.nextInt();
		if(n>=1) {
			System.out.println(fibo(n));
		}else {
			System.out.println("Error el numero dene ser mayor que uno");
		}
	
		
		
		
	}
}
