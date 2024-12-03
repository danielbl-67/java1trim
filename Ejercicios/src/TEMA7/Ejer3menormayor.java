package TEMA7;
import java.util.*;
public class Ejer3menormayor {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		
		
		int[] num= {2,1,8,9,3,4,5,6,7};
		
		int max=num[0];
		int min=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<max) {
				min=num[i];
			}	
		}
		System.out.println("El numero mas grande es: "+max);	
		System.out.println("El numero mas pequeño es: "+min);
		
		
	}
}
