package Actividades;
import java.util.*;
public class Ejer6arraymult2 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
	
		int[] num=new int[5];
		
		System.out.println("Introduzca 5 numeros:");
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
		}
	
	int[] mult=new int[5];
		for(int k=0;k<5;k++) {
			mult[k]=num[k]*2;
		}
	
	int[] ord=new int[mult[5]];
		Arrays.sort(ord);
		System.out.println("Numero multiplicados y ordenados");
	
	for(int numord : ord) {
		System.out.println(numord);	
	}
	
		
	}

}
