package estruturaSequencial;

import java.util.Scanner;

public class exercicico03 {
	
	public static void main (String[] args) {
		
		int A;
		int B;
		int C;
		int D;
		int DIF;
		
		System.out.println("Digite os valores : A, B, C, D ...");
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt(); 
		C = sc.nextInt(); 
		D = sc.nextInt(); 
		
		DIF = (A * B) - (C* D); 
		
		System.out.printf("DIFERENCA = %d ", DIF );
		
		sc.close();
		
	}

}
