package Condicionales;
import java.util.*;
public class Ejer8 {

	public static void main(String[] args) {
		// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Recordamos
		//que existen meses con 28, 30 y 31 días. No consideraremos los años bisiestos.
		var sc = new Scanner(System.in);
	
	System.out.println("Introduzca el dia");
	int dia = sc.nextInt();
	System.out.println("Introduzca el mes");
	int mes = sc.nextInt();
	System.out.println("Introduzca el año");
	int año = sc.nextInt();
	
	//Validar que el día este dentro del rango correcto según el mes
	int diasEnMes = 0;
	
	switch (mes) {
	case 1: //Enero
	case 3: //Marzo
	case 5: //Mayo
	case 7: //Julio
	case 8: //Agosto
	case 10: //Octubre
	case 12: //Diciembre
		diasEnMes = 31;
		break;
		
	case 4: //Abril
	case 6: //Junio
	case 9: //Septiembre
	case 11: //Noviembre
		diasEnMes = 30;
		break;
		
	case 2: //Febrero
		diasEnMes = 28;
		break;
	}
	if(dia<1 || dia>diasEnMes){
		System.out.println("Incorrecto");
	}
	else {
		System.out.println("Su fecha: "+ dia +"/"+mes+"/"+año+" es correcta");
	}
 }
}
