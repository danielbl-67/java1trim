package Actividades;
import java.util.*;
public class Ejer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc = new Scanner(System.in);
	
	int aprob= 0;
	int cond=0;
	int susp=0;
	int nota=0;
	
	for(int i=1; i<=6; i++) {
		System.out.println("Introduzca su "+ i +" nota");
		nota=sc.nextInt();
	
		if(nota > 5 ) {
			aprob++;
		}else if(nota == 4 ) {
			cond++;
		}else if(nota<4 ) {
			susp++;
		}else {
			System.out.println("Introduzca valor entre 1-10");
			nota=sc.nextInt();
		}
	
	}
	System.out.println("Alumnos aprobados: "+aprob );
	System.out.println("Alumnos condicionados: "+cond );
	System.out.println("Alumnos suspenso: "+susp );
sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
