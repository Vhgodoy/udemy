import java.util.Locale;
import java.util.Scanner;

public class Exerc4_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, horas;
		double valorHoras, salario;
		
		number = sc.nextInt();
		horas = sc.nextInt();
		valorHoras = sc.nextDouble();
		salario = valorHoras * horas;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		sc.close();
		
	}

}
