package estruturaCondicional;

import java.util.Scanner;

public class exercicio03 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		// if ( A % 2 == 0 & B % 2 == 0 ) {
		   if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
		
	}

}
