package TEMA7;
import java.util.*;
public class Ejer4masgrande {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		
		int[] num={2,3,4,5,6,7,8,9};
		
		int ind=0;
		int val=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>ind) {
				val=num[i];
				ind=i;
			}
		}
		if(ind !=-1) {
			System.out.println("El indice mas grande es el: "+ind);
			System.out.println("y su valor es: "+val);
		}else {
			System.out.println("Esta vacio");
		}
		
		
		
	}
}
