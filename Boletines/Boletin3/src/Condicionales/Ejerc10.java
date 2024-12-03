package Condicionales;
import java.util.*;
public class Ejerc10 {

	public static void main(String[] args) {
		// 10. Solicitar el día y el mes al usuario e indicar la estación (invierno, primavera, verano y
		//otoño) en la que nos encontramos (en el hemisferio norte), es decir:
		var sc = new Scanner(System.in);
	
	System.out.println("Introduzca el dia");
	int dia = sc.nextInt();
	if(dia>1 && dia<31) {
	}else {
		System.out.println("Dia incorrecto");
		return;
	}
	System.out.println("Introduzca el mes");
	int mes = sc.nextInt();	
	if(mes>1 && mes<12) {
	}else {
		System.out.println("Mes incorrecto");
		return;
	}
	
		if(mes ==12 && dia >=21 || mes==1 || mes==2 || mes==3 && dia<= 20) {
			System.out.println("Invierno");
		}else if(mes == 3 && dia >=21 || mes==4|| mes==5|| mes==6 && dia<= 20) {
			System.out.println("Primavera");
		}else if(mes == 6 && dia >= 21 || mes==7|| mes==8 || mes==9 && dia<=20) {
			System.out.println("Verano");	
		}else if(mes==12 && dia >=22|| mes==11 ||mes==10||mes==9 && dia>=21) {
			System.out.println("Otoño");
		}else {
			System.out.println("Fecha Invalida");
		}
	
	}
}