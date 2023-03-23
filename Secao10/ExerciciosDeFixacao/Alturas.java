package ExerciciosDeFixacao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        int number = 1;
        int minAge = 0 ;
        double sum = 0;

        System.out.println("Dados da 1a pessoa: ");
        for (int i=0 ; i < n; i++) {

            System.out.print("name: ");
            names[i] = sc.next();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
            number ++;
            sum += heights[i];

            if ( number <= n ) {
                System.out.println("Dados da " + number  + " pessoa");
            }
        }

        for (int i=0; i<n; i++) {
            if (ages[i] < 16) {
                minAge++;
            }
        }

        double percentage = ((double) minAge / n) * 100;
        double media = sum / n;

        System.out.println();
        System.out.printf("Altura média: %.2f" , media);
        System.out.println();
        System.out.println("Pessoas com menos de 16 anos: " + percentage);

        for (int i=0; i<n; i++) {
            if (ages[i] < 16) {
                System.out.printf("%s\n", names[i]);
            }
        }

        sc.close();
    }
}
