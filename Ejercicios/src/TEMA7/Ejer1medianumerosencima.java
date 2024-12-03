package TEMA7;
import java.util.*;
public class Ejer1medianumerosencima {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		
	int[] num= new int[100];	
	int sum=0;
	//pide los numeros
	for(int i=0;i<=num.length -1;i++) {
		System.out.println("Introduca el "+i+" numero");
		num[i]=sc.nextInt();
		sum+=num[i];
	}
	//media
	int media =sum/100;
	System.out.println("La media es: "+media);
	//numero por encima
	int encima=0;
	for(int k=0; k>100;k++) {
		if(num[k]>media) {
			encima++;
		}
	}
	System.out.println("Número de valores por encima de la media: "+encima);
		
		
		
		
	}
}
