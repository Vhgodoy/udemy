package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
	
	public static void main (String[] args) {
		
		int id, quant;
		double total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		id = sc.nextInt();
		quant = sc.nextInt();
		
		if ( id == 1 ) {
			 total = 4.00 * quant;
		} 
		else if (id == 2) {
			 total = 4.50 * quant;
		}
		else if (id == 3) {
			 total = 5.00 * quant;
		} 
		else if (id == 4) {
			 total = 2.00* quant;			
		}
		else  {
			 total = 1.5 * quant;
		} 
		
		System.out.printf("Total: R$ %.2f", total);
							
		sc.close();
		
		
	}

}
