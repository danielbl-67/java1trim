package Tema6;
import java.util.*;
public class Ejer5esvocal {
	//---------------------------------------------
	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
	
		System.out.println("Introduzca una vocal");
		char ch =sc.next().charAt(0);
		
		if(Character.isLowerCase(ch)) {
			System.out.println("La letra introducida es vocal y minuscula");
		}else if(Character.isUpperCase(ch)){
			System.out.println("La letra introducida es vocal y mayuscula");
		}else {
			System.out.println("La letra introducida no es una vocal");	
		}
	
	}
}
