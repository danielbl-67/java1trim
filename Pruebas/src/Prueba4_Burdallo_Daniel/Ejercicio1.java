package Prueba4_Burdallo_Daniel;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
	
	String[] eleco=new String[] {
			"plancha","licuadora","lavadora","horno","microondas",
			"vitro","nevera","tostadora","secadora","tele"
	} ;
	int[] precio=new int[] {
			50,60,200,500,150,
			300,600,40,700,800
	};
		
	System.out.println("Introduzca: 1-Busca 2-Modifica 3-Mostrar 4-Calculo");
	int opciones = sc.nextInt();
	switch(opciones) {
	case 1:
			System.out.println("Introduzca el producto a buscar: ");
			String prod=sc.nextLine();
			break;
	case 2:
		System.out.println("Modifica el precio del producto");
		int modi=sc.nextInt();break;
	case 3:break;
	case 4:break;
	}
	
	}
	
	
	
	
}
