package Condicionales;
import java.util.*;
public class Ejer7 {

	public static void main(String[] args) {
		// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente (de 0 a 4), Suficiente
		//(5), Bien (6), Notable (7 y 8) y Sobresaliente (9 y 10).
		
		var sc = new Scanner(System.in);
	
		System.out.println("Introduzca un anota entre el 0 y el 10");
		int nota = sc.nextInt();
		
	if(nota<=4) {
		System.out.println("Es un insuficinte");
	}else if(nota == 5) {
		System.out.println("Es un suficinte");
	}
	
	else if(nota == 6) {
		System.out.println("Esta bien ");
	}
	
	else if(nota ==7 || nota == 8) {
		System.out.println("Es un notable");
	}else {
		System.out.println("Es un sobresaliente");
	}
	}
}
