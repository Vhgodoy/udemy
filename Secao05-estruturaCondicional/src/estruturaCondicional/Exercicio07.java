package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0.0  & y == 0.0) {
			System.out.print("Origem");
		}
		else if (x == 0.0 & y != x) {
			System.out.print("Eixo Y");
		}
		else if (x != y & y == 0.0) {
			System.out.print("Eixo X");
		}
		else if (x > 0 & y > 0) {
			System.out.print("Q1");
		}
		else if (x < 0 & y < 0) {
			System.out.print("Q3");
		}
		else if (x < 0 & y >0) {
			System.out.print("Q2");
		}
		else {
			System.out.print("Q4");
		}
		
		sc.close();
	}

}
