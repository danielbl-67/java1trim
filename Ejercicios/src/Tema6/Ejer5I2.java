package Tema6;
import java.util.*;
public class Ejer5I2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 

	System.out.println("Introduzca una frase");
 	  String frase=sc.nextLine();
    System.out.println("Introduzca el caracter que quieres saber");
 	  char remp=sc.next().charAt(0);
	
	int cont=0;

	int ppos=frase.indexOf(remp);
	int upos=frase.lastIndexOf(remp);
	
	 if (ppos != -1) {
            System.out.println("El carácter '" + remp + "' aparece por primera vez en la posición: " + ppos);
            System.out.println("El carácter '" + remp + "' aparece por última vez en la posición: " + upos);
        } else {
            System.out.println("El carácter '" + remp + "' no se encuentra en la cadena.");
       }
		
		
	}

}
