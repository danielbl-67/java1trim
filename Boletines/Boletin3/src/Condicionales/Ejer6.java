package Condicionales;
import java.util.*;
public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
		
		System.out.println("Introduzca un numero entre el 0 u el 99.999");
		int nu =sc.nextInt();
		
		if( nu<0 || nu>99999) {
			System.out.println("El numero debe estar entre el 0 y 99.999");
		}
		else{
			if(nu<10) {
				System.out.println("Su numero tiene 1 cifra");
			}else if(nu<100) {
				System.out.println("Su numero tiene 2 cifras");
			}
			else if(nu<1000) {
				System.out.println("Su numero tiene 3 cifras");
			}
			else if(nu<10000) {
				System.out.println("Su numero tiene 4 cifras");
			}else {
				System.out.println("El numero tiene mas de 5 cifras");
			}
		sc.close();
		}
	}

}
