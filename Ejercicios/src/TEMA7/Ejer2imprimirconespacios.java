package TEMA7;
import java.util.*;
public class Ejer2imprimirconespacios {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);

		int[] array=new int[]{2,3,4,5,6,7,8,9} ;
		
		
		for(int i=0;i<=array.length-1;i++) {
			if(i>0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		
		
		
	}
}
