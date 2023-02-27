package estruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int comeco, fim;
		int duracao ; 
		
		comeco = sc.nextInt();
		fim = sc.nextInt();
		
		if (comeco < fim ) {
				duracao = fim - comeco;
		}
		else {
			duracao = 24 - comeco + fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		
	}

}
