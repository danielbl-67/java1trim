package Tema6;
import java.util.*;
public class Ejer1I2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
	
 System.out.println("Itroduzca una frase");
 String frase=sc.nextLine();
 System.out.println("Itroduzca el numero de inicio ");
 int n1=sc.nextInt();
 System.out.println("Itroduzca el numero de final ");
 int n2=sc.nextInt();
	
 String subfra=(frase.substring(n1, n2)) ;
	 
 System.out.println("La frase extraida es: ");
 System.out.println(subfra);
		
	}
}
