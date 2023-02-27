
import java.util.Locale;
import java.util.Scanner;

public class Exerc5_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, numero1, numero2;
		double valorDaPeca1, valorDaPeca2, total;
		
		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valorDaPeca1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valorDaPeca2 = sc.nextDouble();
		
		total = (valorDaPeca1 * numero1) + (valorDaPeca2 * numero2);
		
		System.out.printf("VALOR A PAGAR : R$ %.2f%n", total);
		
		sc.close();

	}

}
