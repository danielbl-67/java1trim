package Actividades;
import java.util.*;
public class Ejer3 {

	public static void cil(int alt,int rad) {
		double pi=3.1415;
		double area=(2*pi)*rad*(alt*rad);
		double vol=pi*(rad*2)*alt ;
		
		System.out.println("El area es:"+area);
		System.out.println("El vol es:"+vol);
		
	}
	
	
	public static void main(String[] args) {
		var sc= new Scanner(System.in);

	System.out.println("Introduzca la altura");
	int alt = sc.nextInt();
	System.out.println("Introduzca el vol");
	int vol = sc.nextInt();
	
	
	cil(alt,vol);
	
	
	
	
	
	
	
	
	}
}
