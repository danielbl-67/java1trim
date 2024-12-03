package Condicionales;
import java.util.Scanner;
public class Ejer5 {
   public static void main(String[] args) {
       // Crear un objeto Scanner para recibir la entrada del usuario
       Scanner sc = new Scanner(System.in);
       
       // Pedir los tres números
       System.out.print("Introduce el primer número: ");
       double num1 = sc.nextDouble();
       System.out.print("Introduce el segundo número: ");
       double num2 = sc.nextDouble();
       System.out.print("Introduce el tercer número: ");
       double num3 = sc.nextDouble();
       
       // Variables para almacenar los números ordenados
       double mayor, medio, menor;
      
       // Comparar los números y asignar valores a mayor, medio y menor
       if (num1 >= num2 && num1 >= num3) {
           mayor = num1;
           if (num2 >= num3) {
               medio = num2;
               menor = num3;
           } else {
               medio = num3;
               menor = num2;
           }
           
           
       } else if (num2 >= num1 && num2 >= num3) {
           mayor = num2;
           if (num1 >= num3) {
               medio = num1;
               menor = num3;
           } else {
               medio = num3;
               menor = num1;
           }
           
           
       } else {
           mayor = num3;
           if (num1 >= num2) {
               medio = num1;
               menor = num2;
           } else {
               medio = num2;
               menor = num1;
           }
       }
       // Mostrar los números ordenados de mayor a menor
       System.out.println("Los números ordenados de mayor a menor son: " + mayor + " > " + medio + " > " + menor);
       // Cerrar el objeto Scanner
       sc.close();
   }
}

