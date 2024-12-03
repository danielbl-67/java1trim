package Actividades;
import java.util.*;
public class Ejer5 {

	public static boolean esVocal(char c) {
		boolean v=false;
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			v=true;
		}
		return v;
}
	
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		
	System.out.println("Introduzca un caracter");
	char c=sc.next().charAt(0);
	
	esVocal(c);
	boolean v=esVocal(c);;
	
	if(v) {
		System.out.println("es UNA VOCAL");
	}else{
		System.out.println("no es UNA VOCAL");
	}
	

	
	}
}
