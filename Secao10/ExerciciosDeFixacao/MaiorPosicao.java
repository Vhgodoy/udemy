package ExerciciosDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n , highElement;
        double higher;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0;i< vect.length;i++) {
            System.out.print("Digite um numero: " );
            vect[i] = sc.nextDouble();
        }

        higher = vect[0];
        highElement = 0;

        for (int i=1; i< vect.length;i++) {
            if (vect[i] > higher) {
                higher = vect[i];
                highElement = i;
            }
        }

        System.out.printf("\nMaior valor = %.1f\n" , higher);
        System.out.println("Posicao do maior valor = " + highElement);


        sc.close();
    }
}