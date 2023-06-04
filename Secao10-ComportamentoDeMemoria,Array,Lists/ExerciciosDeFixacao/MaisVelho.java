package ExerciciosDeFixacao;

import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n ;
        int count = 1;
        int old ;
        String oldName = null;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i=0; i<n;i++) {
            System.out.println("Dados da " + count + "a pessoa:");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            count ++ ;
        }

        old = age[0];

        for (int i=1;i < n; i++ ) {
            if (age[i] > old) {
                old = age[i];
                oldName = name[i];
            }
        }

        System.out.println("\nPESSOA MAIS VELHA: " + oldName);

        sc.close();
    }
}