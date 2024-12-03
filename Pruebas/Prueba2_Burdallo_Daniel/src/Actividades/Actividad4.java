package Actividades;
import java.util.*;
public class Actividad4 {

	public static void main(String[] args) {
		// Ejercicio 4
		var sc=new Scanner(System.in);
	
	int nota=0;
	
	int baja=0;
	int media=0;
	int alta=0;
	
	do{
		
	System.out.println("Introduzca un numero entre el 1-10");
	nota=sc.nextInt();

		if(nota==0 ||nota<5) {
			System.out.println("La nota "+nota+" es insufieciente");
			}else if(nota<=5||nota<6) {
				System.out.println("La nota "+nota+" es sufieciente");
			}else if(nota<=6||nota<7) {
				System.out.println("La nota"+nota+" es un bien");
			}else if (nota<=7||nota<9) {
				System.out.println("La nota "+nota+" es notable");
			}else if (nota<=9||nota<=10) {
				System.out.println("La nota "+nota+" es sobresaliente");
			}	
	}while(nota!=-1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
