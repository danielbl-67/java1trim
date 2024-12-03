package TEMA7;
import java.util.*;
public class Ejemplo1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in); 
		//Hace la lista
		int[] myList ={4,7,3,1,2,8,2,3,10,9};
		
		//Guarda de la lista el noveno parametro y lo guarda
		int temp=myList[9];
		
		//Asigna a posicion cero el parametro de la novena posicion 
		myList[9]=myList[0];

		//hace bucle para ir moviendo de posicion 
		for(int i=myList.length - 1; i>0; i--) {
			myList[i]=myList[i-1];	
		}	
		
		//muestra el resultado
		for(int value: myList) {
			System.out.println(value);
	
		
		
		}
	}
}
