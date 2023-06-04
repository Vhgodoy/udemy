package ExerciciosDeFixacao;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class DadosPessoas {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, man = 0, woman = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        double averageWoman = 0.0;
        for (int i=0;i<n;i++) {
            System.out.printf("Altura da %da pessoa: " , i + 1 );
            height[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: " , i + 1 );
            gender[i] = sc.next().charAt(0);
            if (gender[i] == 'M' || gender[i] == 'm') {
                man +=  1;

            } else if (gender[i] == 'F' || gender[i] == 'f'){
                woman += 1;
                averageWoman += height[i];
            }
        }

        double minHeight = height[0];
        double maxHeight = height[0];

        for (int i=1;i<n;i++) {
            if (height[i] < minHeight) {
                minHeight = height[i];
            } else if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
        }

        System.out.println("Menor altura: " + minHeight);
        System.out.println("Maior altura: " + maxHeight);
        System.out.printf("Media das alturas das mulheres = %.2f\n",averageWoman / woman);
        System.out.printf("Quantidade de homens = %d " , man);

        sc.close();
    }
}
