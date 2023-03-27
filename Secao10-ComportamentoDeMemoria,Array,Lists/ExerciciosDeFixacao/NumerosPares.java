package ExerciciosDeFixacao;

import java.util.Scanner;

public class NumerosPares {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int cont = 0;
        for (int i=0; i<n;i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                cont++;
            }
        }

        System.out.println("\nNUMEROS PARES:");
        for (int i=0; i<n; i++){
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + cont);

        sc.close();
    }
}
