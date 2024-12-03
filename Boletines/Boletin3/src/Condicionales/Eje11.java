package Condicionales;
import java.util.*;
public class Eje11 {

	public static void main(String[] args) {
		// programa que calcule el precio final de un producto
		var sc = new Scanner(System.in);
	
		//valor
		double IVAGe = 0.21 ;
		double IVAredu = 0.10;
		double IVASuper= 0.04 ;
		
		
		//
		// Pedir la base imponible
   		System.out.println("Introduzca la base imponible del producto: ");
   		double baseImponible = sc.nextDouble();
  
   // Pedir el tipo de IVA
   		System.out.println("Introduzca el tipo de IVA (1-general, 2-reducido, 3-superreducido): ");
   		int tipoIVA = sc.nextInt();
  
   // Validar el tipo de IVA
   double iva= 0 ;
   switch (tipoIVA) {
       case 1:
           iva = IVAGe;
           break;
       case 2:
           iva = IVAredu;
           break;
       case 3:
           iva = IVASuper;
           break;
          
       default:
           System.out.println("Tipo de IVA no válido.");
           sc.close();
     }
  
   // Pedir código promocional
   		System.out.println("Introduzca el código promocional (1-nopro, 2-mitad, 3-meno5, 4-5porc): ");
   		int codigoPromocional = sc.nextInt();
   
   	// Calcular precio con IVA
   		
   double precioConIVA = baseImponible * (1 + iva);
   double precioFinal = precioConIVA;
   
   // Aplicar descuento según código seleccionado
  
   switch (codigoPromocional) {
       case 1:
           // No cambia el precio
           break;
       case 2:
           precioFinal = precioConIVA / 2;
           break;
       case 3:
           precioFinal = precioConIVA - 5;
           break;
       case 4:
           precioFinal = precioConIVA * 0.95;
           break;
       default:
           System.out.println("Código promocional no válido.");
           break;
   }
  
   // Mostrar el precio final
   System.out.printf("El precio final del producto es: %.2f €%n", precioFinal);
  
	}
}
