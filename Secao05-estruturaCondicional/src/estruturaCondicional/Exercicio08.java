package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		double imposto1 = (salario - 2000.00) * 8 /100;
		
		double imposto2 = (salario - 3000.00) * 18 /100  + 80.00 ;
		
		double imposto3 = (salario - 4500.00 ) *28 /100 + 350.00;
		
		
		
		if (salario <= 2000.00) {
			System.out.print("Isento");
		}
		else if (salario >= 2000.01 && salario <= 3000.00) {
			salario = imposto1;
			System.out.printf("R$ %.2f%n", salario);
		}
		else if (salario >= 3000.01 && salario <= 4500.00) {
			salario = imposto2 ;
			System.out.printf("R$ %.2f%n", salario);
		}
		else {
			salario = imposto3;
			System.out.printf("R$ %.2f%n", salario);
		}
		
		sc.close();
	}
	
	

}
