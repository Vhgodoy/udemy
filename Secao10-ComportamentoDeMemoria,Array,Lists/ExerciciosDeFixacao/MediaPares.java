package ExerciciosDeFixacao;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int par = 0;
        double media = 0.0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                media += vect[i];
                par++;
            }
        }

        media = media / par;
        for (int i=0 ;i<1;i++) {
            if(par != 0) {
                System.out.print("\nMEDIA DOS PARES = " + media);
            } else  {
                System.out.println("NENHUM NUMERO");
            }

        }

        sc.close();
    }
}
