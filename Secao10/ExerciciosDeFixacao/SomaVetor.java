package ExerciciosDeFixacao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double soma = 0.0;

        System.out.println();

        double[] vetor = new double[n];

        for (int i = 0 ; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma = soma + vetor[i];
        }

        double media = soma / n;

        System.out.println("VALORES = " + Arrays.toString(vetor));
        System.out.printf("SOMA = %.2f%n" , soma);
        System.out.printf("MEDIA = %.2f%n" , media);

        sc.close();
    }
}
