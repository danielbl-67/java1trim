package Actividades;
import java.util.*;
public class Actividad2 {

	public static void main(String[] args) {
		// Ejercicio 2
		var sc=new Scanner(System.in);

	double desc=0;
	double cob=0;
	int pre=0;
	double tot=0;
	
		System.out.println("¿Usted es socio?s/n");
		char soc=sc.next().charAt(0);
		
		switch(soc) {
		case 's':desc=0.05;
		case 'n':desc=0;
		}
		
		
		System.out.println("¿A domicilio?s/n");
		char dom=sc.next().charAt(0);
		
		switch(dom) {
		case 's':cob=1.50;
		case 'n':cob=0;
		}
		
		System.out.println("Introduce el tipo de producto");
		System.out.println("1-pequeña|2-mediana|3-familiar");
		int pro=sc.nextInt();
		
		switch(pro) {
		case 1:pre=7;
		case 2:pre=10;
		case 3:pre=12;
		}
		
		tot=(desc+pre)+cob;
		
		System.out.println("Su pedido es:  ");
		System.out.println("Socio "+desc);
		System.out.println("Domicilio "+cob);
		System.out.println("Precio por prodcuto "+pre);
		System.out.println("El total es: "+tot);
	
	}
}
