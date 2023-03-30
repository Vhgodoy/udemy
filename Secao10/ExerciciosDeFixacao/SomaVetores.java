package ExerciciosDeFixacao;

import java.util.Scanner;

public class SomaVetores {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qauntos valores vai ter cada vetor? ");
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        System.out.println("Digite os valores do vetor A:");
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i=0;i<N;i++) {
            B[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i=0;i<N;i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }
            sc.close();
    }
}
