package Actividades;
import java.util.*;
public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
	
		System.out.println("Introduzca su renta anual");
		int rent =sc.nextInt();
		System.out.println("Introduzca su estado civil 1-SolteroConHijos  2-CasadoConHijos1");
		System.out.println("3-Casado 4-Soltero");
		int civil =sc.nextInt();
	
		//Estado Civil
		String estado = "";
		
		if(civil == 1) {
			estado= "SolteroConHijos";
		}else if (civil == 2) {
			estado = "CasadoConHijos";
		}else if (civil == 3) {
			estado = "Casado";
		}else if (civil == 4) {
			estado = "Soltero";
		}else {
			System.out.println("Introduzca un estado civil valido");
		}
		
	//Porcentaje a pagar 
	double pagar = 0;
	//Calculos a pagar 
	
	
	
	}
}
