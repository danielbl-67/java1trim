package Actividades;
import java.util.*;
public class Ejer11muletillas {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		boolean javalandes,dialecto;
		String frase;
		
			System.out.println("Introduzca una frase");
			String frase1 = sc.nextLine();
				
				
			javalandes=frase1.indexOf("Javalin,Javalon")==0;
			dialecto= frase1.lastIndexOf("Javalen, len , len")==frase1.length()-17;
			
			
			if(javalandes) {
				System.out.println("La frase es javalense");
				frase = sc.nextLine();
				System.out.println("Mensaje"+frase);
			}
			if(dialecto) {
				System.out.println("La frase esta en dialecto de javalandia");
				frase = frase1.substring(0, frase1.length()-17).trim();
				System.out.println("Mensaje"+frase);
			}
			if(!javalandes && !dialecto) {
				System.out.println("La frase no esta en dialecto ni javalandes");
			}
			
			
			
		
		
		
	}
}
