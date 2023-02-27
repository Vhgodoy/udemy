import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, horas;
		double rsHr, salario;

		number = sc.nextInt();
		horas = sc.nextInt();
		rsHr = sc.nextDouble();

		salario = rsHr * horas;

		System.out.println("NUMBER  = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
