package Actividades;
import java.util.*;
public class Ejer22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc= new Scanner(System.in);
		
	char a;

	do {
		System.out.println("Inroduzca numeros 1ºBase y 2ºExponente");
		int	base= sc.nextInt();
			
			System.out.println("Inroduzca numeros 1ºBase y 2ºExponente");
		int	exp= sc.nextInt();
		int cont=0;
		
		//validar 
		if(base<0||exp<0) {
			System.out.println("Inroduzca numeros positivos");
			break;
		}	
		for(int i=0; i<=exp; i++) {
			cont+=base;
		}
		
		System.out.println("Resultado de "+ base+" elevado a "+exp +" es: "+cont);
		
		
		System.out.print("¿Deseas seguir ejecutando el programa? (S/N): ");
		a = sc.next().charAt(0);
		
	}while(a =='s');
	
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
