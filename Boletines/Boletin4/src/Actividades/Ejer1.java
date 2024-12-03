package Actividades;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
	
	int num = 0;
	int count = 0;
	
	System.out.println("Introduce un numero");
	num = sc.nextInt();
	
	while(num!=0){
		if(num%2==0) {
			System.out.println("El numero es par");
		}else{
			System.out.println("El numero es inpar");
		}
		
		if(num>0) {
			System.out.println("El numero positivo");
		}else {
			System.out.println("El numero es negativo");
		}
		
		System.out.println("El numero cuadrado del numero es "+(num*num));
		num = sc.nextInt();
	}
	
	}
}
