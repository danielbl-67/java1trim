package Actividades;
import java.util.*;
public class Ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
	
	int num=0;	
		System.out.println("Introduzca un numero entre el 1 y el 10 ");
			num = sc.nextInt();
			System.out.println("La tabla de multiplicar de " +num);
	for(int i = 1 ; i<=10 ;i++) {
		System.out.println(+num +" x " +i +" = "+(num*i));
	}
	sc.close();
		
	
	
	}
}
