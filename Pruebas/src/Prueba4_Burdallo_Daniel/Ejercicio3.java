package Prueba4_Burdallo_Daniel;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);

		String[] alumnos=new String[] {
				"Javi","Lucia","Irene","Daniel","Rafa","Carlos","Pedro","Pedro","Ismael","Maria",
				"Isabel","Ana","German","Asier","Ainoa","Claudia","Leyre","Flabio","Valeria","Nuria",
		};
		
		int[] notas=new int[] {
				5,8,6,4,5,8,7,9,4,5,
				6,7,8,6,8,6,7,5,9,4
		};
		
		System.out.println("Introduzca: 1-Busca 2-Modifica 3-Mostrar media 4-Mostrar media separadas 5-Mejor alumno");
		int opciones = sc.nextInt();
		switch(opciones) {
		case 1:
			System.out.println("Introduzca el alumno a buscar: ");
			String alu=sc.nextLine();
		
			break;	
		case 2:break;
		case 3:break;
		case 4:break;
		case 5:break;
		case 6:break;
		
		
		}
		
		
		
		
		
	}
}
