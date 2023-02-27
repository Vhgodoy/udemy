package estruturaCondicional;


import java.util.Locale;
import java.util.Scanner;

public class Ecercicio06 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double result;
		
		result = sc.nextDouble();
		
		if (result >= 0.00 & result <= 25.00) {
			System.out.print("Intervalo (0,25]");
		}
		else if (result >= 25.01 & result <= 50.00) {
			System.out .print("Intervalo (25,50]");
		}
		else if (result >= 50.01 & result <= 75.00) {
			System.out.print("Intervalo (50,75]");
		}
		else if (result >= 75.01 & result <= 100) {
			System.out.print("Intervalo (75,100]");
		}
		else {
			System.out.print("Fora de intervalo");
		}
		
		sc.close();
	}

}
