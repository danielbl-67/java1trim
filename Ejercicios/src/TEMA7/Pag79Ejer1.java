package TEMA7;
import java.util.*;
public class Pag79Ejer1 {

	public static void main(String[] args) {
		var sc =new Scanner(System.in);
	
		int[] num = new int[]{1,2,3,4,5,8,6,7,9};
		
		System.out.println("Array original: "+Arrays.toString(num));
		
		System.out.println();
		
		Arrays.sort(num);
		
		System.out.println("Array ordenado: "+Arrays.toString(num));
		
	}

}
