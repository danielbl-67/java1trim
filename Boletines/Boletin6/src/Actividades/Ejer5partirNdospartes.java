package Actividades;
import java.util.*;
public class Ejer5partirNdospartes {

	public static void main(String[] args) {
		var sc= new Scanner(System.in);
	
	System.out.println("Introduzca un numero positivo");
	String nu= sc.nextLine();

	System.out.println("Introduzca poscion para partirlo");
	int pos= sc.nextInt();
	
	//Posicion verifica
	if(pos<2 || pos > nu.length()) {
		System.out.println("La posicion debe estar entre 2 digitos y "+nu.length());	
		return;
	}else {
	//Parte el numero en dos partes
	String pa1=nu.substring(0, pos - 1);
	String pa2=nu.substring(pos - 1);
	
	System.out.println("Primera parte "+pa1);
	System.out.println("Segunda parte "+pa2);
		}
	sc.close();
	}
}
