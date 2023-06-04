package ExerciciosDeFixacao;

import entities.dados;
import java.util.Locale;
import java.util.Scanner;

public class Alturas01 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas sera digitadas? ");

        int n = sc.nextInt();
        int number = 1;
        dados[] vect = new dados[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da "+ number + "a pessoa: ");
            sc.nextLine();
            String name = sc.next();
            int age = sc.nextInt();
            double height = sc.nextDouble();
            vect[i] = new dados(name,age,height);
            number ++;
        }

        double totalHeight = 0.0;
        for (int i=0; i<n; i++) {
            totalHeight += vect[i].height;
        }

        dados dados = new dados(totalHeight);

        int minAge = 0;
        for (int i=0; i<n; i++) {
            if (vect[i].age < 16) {
                minAge++;
            }
        }

        dados.mediaHeight(n);
        dados.percentAge(minAge,n);

        System.out.printf("Altura média: %.2f" , dados.height);
        System.out.println();
        System.out.print("pessoas com menos de 16 anos: " + dados.age+"%");
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (vect[i].age < 16) {
                System.out.printf("%s\n" , vect[i].name);
            }
        }

        sc.close();
    }
}