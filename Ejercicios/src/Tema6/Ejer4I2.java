package Tema6;
import java.util.*;
public class Ejer4I2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
	
	 System.out.println("Itroduzca una frase");
	 	String frase=sc.nextLine();
	 System.out.println("Itroduzca un caracter a reemplazar");
	 	char remp=sc.next().charAt(0);
	 System.out.println("Itroduzca el nuevo caracter");
	 	char nue=sc.next().charAt(0);
	
	 String frasemin=frase.toLowerCase();
	 //Reemplaza
	 String nuevaCadena = frase.replace(remp,nue);
	
	 System.out.println("La nueva cadena es: " + nuevaCadena);
	 
	 
	 
	}
}
