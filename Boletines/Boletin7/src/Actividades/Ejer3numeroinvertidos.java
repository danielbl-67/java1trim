package Actividades;
import java.util.*;
public class Ejer3numeroinvertidos {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);

	System.out.println("Introduce cuantos numeros vas a introducir");
	  int veces=sc.nextInt();
	
	  int[] num=new int[veces] ;
	
	for(int i=0;i<veces -1;i++) {
	  System.out.println("Introduce los numeros");
	 num[i]=sc.nextInt();
	}
	 Arrays.sort(num);
	 
	for (int i=0; i < num.length/2; i++) {
	      int temp = num[i];
	      num[i] = num[num.length - 1 - i];
	      num[num.length - 1 - i] = temp;
	    }
	
	System.out.println();
	System.out.println("Orden de numeros invertidos: "+Arrays.toString(num));
		 
		
	}
}
