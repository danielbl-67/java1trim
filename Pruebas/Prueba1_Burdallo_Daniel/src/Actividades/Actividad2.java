package Actividades;
import java.util.*;
public class Actividad2 {

	public static void main(String[] args) {
		// Ejercicio2
		var sc = new Scanner(System.in);
	
		System.out.println("Introduzca su edas 1-Menores12  2-Mayores65  3-Resto");
		int edad = sc.nextInt();
		
		System.out.println("Introduzca el dia de la semana 1-Lunes 2-Martes 3-Miercoles 4-Jueves 5-Viernes 6-Sabado 7-Domingo ");
		int diasem = sc.nextInt();
		
		switch (edad) {
		case 1://Menores de 12
		case 2://Mayores de 65
		case 3://Resto
			break;}
		String dia = "";
		//Dia semana
		if(diasem == 1) {
			dia = "Lunes";
		}else if (diasem == 2) {
			dia = "Martes";
		}else if (diasem == 3) {
			dia = "Miercoles";
		}else if (diasem == 4) {
			dia = "Jueves";
		}else if (diasem == 5) {
			dia = "Viernes";
		}else if (diasem == 6) {
			dia = "Sabado";
		}else if (diasem == 7) {
			dia = "Domingo";
		}
		
		//Definir precios segun su edad
		int tarifa = 0;
		final int tarifaInfa = 15;
		final int tarifaMayor = 10;
		final int tarifaAdulto = 30;
		
		if(edad==1) {
			tarifa = tarifaInfa;
		}else if (edad == 2) {
			tarifa = tarifaMayor;
		}else if(edad == 3) {
			tarifa = tarifaAdulto;
		}else {
			System.out.println("Edad incorrecta");
		}
		
		//Descuento por dia
		
		double desc=0;
		
		if(diasem==2 || diasem==4) {
			desc= 0.15;	
		}else if (diasem==1 || diasem==3) {
			desc= 0.10;
		}else {
			desc = 0.05;
		}
		
		double total= tarifa-(tarifa*desc) ;
		
		System.out.println("Hoy estando a "+dia);
		System.out.println("Tendras un descuento del "+desc+"€" +" de su tarifa "+tarifa+"€");
		System.out.println("Por lo que su precio sera " +total+"€");
		
	}
}
