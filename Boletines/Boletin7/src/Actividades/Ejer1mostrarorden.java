package Actividades;
import java.util.*;
public class Ejer1mostrarorden {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		//
		double[] num= new double[5] ;
		
		//Introduce los numeros
		for(int i=0;i<=num.length -1;i++) {
			System.out.println("Introduzca los numeros");
			num[i]=sc.nextDouble();
	}
		//Muestra los valores
		for(double value:num) {
			System.out.println(value);
		}
		
		
		
		
		
	}

}
