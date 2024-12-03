package Actividades;
import java.util.*;
public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
		
	System.out.println("Intoduzca un numero para calcular su factorial");
	int num = sc.nextInt();
	//Iniciamos el factorial a 1
	int fact=1;
	//empieza por uno y se suma hasta llegar al numero ingresado
	
	for(int i = 1 ;i <= num ;i++ ) {
		System.out.println(i);
		//cuando se llega al ingresado multiplicamos i * el ingresado	
		
		fact*=i;
	}
	
	System.out.println("Factorial de "+num +" es "+fact);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
