package Actividades;
import java.util.*;
public class Ejer12Acierta {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		
		System.out.println("Introduzca una contraseña");
		 String contraseña = sc.nextLine();
		System.out.println("Introduzca la contraseña correcta");
		 String cont2 = sc.nextLine();
		 
		int ncara=contraseña.length();
		char pri=contraseña.charAt(0);
		char ult=contraseña.charAt(contraseña.length()-1);
		
		int cont=0;
		while(true) {
		
		if(contraseña.equals(cont2)) {
			System.out.println("Acertaste");
			break;
		}else {
			System.out.println("Fallaste");
			 cont++;
				
				System.out.println("Numero caracteres: "+ncara);
				System.out.println("Primera letra: "+pri);
				System.out.println("Ultima letra: "+ult);
				System.out.println("Numero de intentos: "+cont);
			
			System.out.println("Introduzca la contraseña correcta");
			cont2 = sc.nextLine();
		
		}
		}
		
}	
}
