import java.util.Scanner;
import java.util.Locale;

public class Exerc4_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, horas;
		double salario, rsHr;
		
		number = sc.nextInt();
		horas = sc.nextInt();
		salario = sc.nextDouble();
		
		rsHr = horas * salario;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n ", rsHr);
		
		sc.close();
			
	}

}
