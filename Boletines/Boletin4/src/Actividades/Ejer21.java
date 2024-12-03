package Actividades;
import java.util.*;
public class Ejer21 {

	public static void main(String[] args) {
		var sc= new Scanner(System.in);
		
		System.out.println("Introduzca un numero base ");
	int	base= sc.nextInt();
		
		System.out.println("Introduzca un numero exponente ");
	int	exp= sc.nextInt();
	
	//validar 
		if(base<0||exp<0) {
			System.out.println("Inroduzca numeros positivos");
		}
		
	int cont=base;
	
	for(int i=1; i<exp; i++) {
		cont*=base;
		
	}
	
	System.out.println("Resultado de "+ base+" elevado a "+exp +" es: "+cont);
	sc.close();
		
		

	
	
	
	
	
	
	
	
	
	
	}
}
