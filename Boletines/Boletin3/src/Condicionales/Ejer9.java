package Condicionales;
import java.util.*;
public class Ejer9 {

	public static void main(String[] args) {
		// número comprendido entre 1 y 7,correspondiente a un día de la semana.
		var sc = new Scanner(System.in);
	
	System.out.println("Introduzca un numero entre el 1 y el 7");
	int dia = sc.nextInt();
	
	switch (dia){
	case 1:System.out.println("El numero corresponde a Lunes"); break;//lunes
	case 2:System.out.println("El numero corresponde a Martes");break;//martes
	case 3:System.out.println("El numero corresponde a Miercoles");break;//miercoles
	case 4:System.out.println("El numero corresponde a Jueves");break;//jueves
	case 5:System.out.println("El numero corresponde a Viernes");break;//viernes
	case 6:System.out.println("El numero corresponde a Sabado");break;//sabado
	case 7:System.out.println("El numero corresponde a Viernes");break;//domingo
	}
	
	
 }
}