package estruturaCondicional;

import java.util.Locale;

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double minuto = sc.nextInt();
		double plano = 50.00;
		double conta;

		if (minuto > 100) {
			conta = (minuto - 100) * 2 + plano;
			System.out.printf("Valor a pagar: %.2f%n", conta);
		}

		else {
			System.out.printf("Valor a pagar: 50.00 ");
		}

		sc.close();
	}

}
