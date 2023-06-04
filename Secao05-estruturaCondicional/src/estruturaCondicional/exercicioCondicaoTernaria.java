package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicioCondicaoTernaria {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble() ;
		double discount = (price < 20.00) ? price * 0.1 : price * 0.5;
		
		// if (price <20.0) {
		//	discount = price * 0.1;
		// }
		// else {
		//	discount = price * 0.5;
		// }
		
		
		System.out.printf("O desconto é : R$ %.2f%n", discount);
		
		sc.close();

 }
	
}
