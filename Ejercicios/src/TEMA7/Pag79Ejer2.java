package TEMA7;
import java.util.*;
public class Pag79Ejer2 {

	public static void main(String[] args) {
		var sc =new Scanner(System.in);
		
	int[] num = new int[]{1,2,3,4,5,8,6,7,9};
		
	System.out.println("Array original: "+Arrays.toString(num));
	System.out.println();
	Arrays.sort(num);
		
	 for (int i = 0; i < num.length / 2; i++) {
         int temp = num[i];
         num[i] = num[num.length - 1 - i];
         num[num.length - 1 - i] = temp;
     }
	 System.out.println("Array orden descendente: " + Arrays.toString(num));
		
	}

}
