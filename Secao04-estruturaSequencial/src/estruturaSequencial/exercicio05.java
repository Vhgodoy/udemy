package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
	
	public static void main (String[] args) {
		
		int pc1, qtn1, pc2, qtn2;
		double valor1, valor2, total;
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			pc1 = sc.nextInt();
			qtn1 = sc.nextInt();
			valor1 = sc.nextDouble();
			
			pc2 = sc.nextInt();
			qtn2 = sc.nextInt();
			valor2 = sc.nextDouble();
			
		total = valor1 * qtn1 + valor2 * qtn2;
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		
		sc.close();
	}

}