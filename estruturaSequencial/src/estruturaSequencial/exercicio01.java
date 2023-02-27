package estruturaSequencial;

import java.util.Scanner;

public class exercicio01 {
	
	public static void main (String[] args) {
		
		int A;
		int B;
		int soma;
		
		System.out.println("Digite um numero....");
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		
		System.out.println("Digite outro numero...");
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.printf("soma = %d", soma);
		
		sc.close();
				
	}
}
