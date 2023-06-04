package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;



public class exercicio04 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int id, horas, preco;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID, as horas trabalhadas e o preço do das horas ...");
		

		
		id = sc.nextInt();
		horas = sc.nextInt();
		preco = (int) sc.nextDouble();
		
		salary = preco * horas;
		
		System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", id, salary);
		sc.close();

		
	}

}
