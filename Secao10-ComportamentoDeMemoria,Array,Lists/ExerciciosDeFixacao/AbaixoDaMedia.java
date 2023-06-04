package ExerciciosDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media = 0.0;


        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i< vect.length;i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            media += vect[i];
        }

        media = media / n;
        System.out.println("\nMEDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA : ");
        for (int i=0;i<n;i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f\n" , vect[i]);
            }
        }

        sc.close();
    }
}
