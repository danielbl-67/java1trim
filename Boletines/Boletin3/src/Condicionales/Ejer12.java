package Condicionales;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		// Escribe un programa que genere la nómina (bien desglosada) de un empleado
		//según las siguientes condiciones:
		var sc = new Scanner(System.in);
	
	       //Preguntar cargo del usuario
	       System.out.println("Introduzca el número según su cargo(1:Prog.Junior,2:Prog.Senior,3:Jefe de Proyecto): ");
	       int cargo = sc.nextInt();
	      
	       //Preguntar los días de viaje al usuario
	       System.out.println("Idique los días que ha estado visitando clientes: ");
	       int dias = sc.nextInt();
	      
	       //Preguntar estado civil
	       System.out.println("Indique su estado civil (1:soltero, 2:casado): ");
	       int estCiv = sc.nextInt();
	      
	       //Valores del sueldo
	       int sueldoJunior = 950;
	       int sueldoSenior = 1200;
	       int sueldoJefe= 1600;
	      
	       //SUELDOS
	      
	       int sueldo = 0;
	      
	       switch (cargo) {
	       case 1:
	          sueldo = sueldoJunior;
	           break;
	       case 2:
	           sueldo = sueldoSenior;
	           break;
	       case 3:
	           sueldo = sueldoJefe;
	           break;
	          
	       }
	      
	       //Calculo precio Vacaciones
	      
	       int sueldototal = (dias * 30) + sueldo;
	      
	                    
	       //Calcular IRPF
	   	
	       double IRPFsoltero = 0.25;
	       double IRPFcasado = 0.20;
	      
	       switch (estCiv) {
	      
	       case 1:
	       	System.out.println("La nómina será de: " + sueldototal * IRPFsoltero + " euros.");
	       	break;
	       	
	       case 2:
	       	System.out.println("La nómina será de: " + sueldototal * IRPFcasado + " euros.");
	       	break;
	       }
	          		
		}
	}
