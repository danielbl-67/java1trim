package Tema6;
import java.util.*;
public class Ejer1Math_carta {
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
		Random ale =new Random();

		String palo = null;
		String numero;
		
		//DEL 0 AL 3
		int paloale =ale.nextInt(4);
		 if (paloale == 0) {
	            palo = "Picas"; 
	        } else if (paloale == 1) {
	            palo = "Corazones"; 
	        } else if (paloale == 2) {
	            palo = "Diamantes"; 
	        } else if (paloale == 3) {
	            palo = "Tréboles"; 
	        }
		//DEL 0 AL 12
		 int numale =ale.nextInt(13);
		 
		 if(numale == 0){
			 numero="A";
		 }else if(numale==10) {
			 numero="J";
		 }else if(numale==11) {
			 numero="Q";
		 }else if(numale==12) {
			 numero="K";
		 }else {
			 numero= "" + (numale+1);
		 }
		 
		 System.out.println("La carta es: "+numero+" "+palo);
		 
		 
	}
}
