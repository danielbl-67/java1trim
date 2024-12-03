package Actividades;
import java.util.*;
public class Actividad1 {

	public static void main(String[] args) {
		// Ejercicio 1
		var sc= new Scanner(System.in);

	int menm=0;
	int maym=0;
	int igum=0;
	int count=0;
	int vo=0;
	char car;
	
	for(int i=0;i<=100;i++){
	
		System.out.println("Introduzca un caracter en mimusculas: ");
		car=sc.next().charAt(0);
		
	count=i;
	
		if(car=='a'||car=='e'||car=='i'||car=='o'||car=='u') {
			vo++;
		}else if(car=='b'||car=='c'||car=='d'||car=='e'||car=='f'||
				car=='g'||car=='h'||car=='j'||car=='k'||car=='l') {
			menm++;
			
		}else if (car=='n'||car=='ñ'||car=='p'||car=='q'||car=='r'||
				car=='s'||car=='t'||car=='v'||car=='w'||car=='x'||car=='y'||car=='z');{
			maym++;
			
		}
				
		if(car=='$') {
			System.out.println("Numero caracteres leidos: "+count);
			System.out.println("Numero vocales leidos: "+vo);
			System.out.println("Numero caracteres menor de M leidos: "+menm);
			System.out.println("Numero caracteres mayor de M leidos: "+maym);
			System.out.println("Numero caracteres igual de M leidos: "+igum);
		}
				
	}
	sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
