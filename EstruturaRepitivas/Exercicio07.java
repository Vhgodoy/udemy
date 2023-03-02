import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        double media = 0.0;

            for (int i = 1; i <= N; i ++) {

                double X1 = sc.nextDouble() * 2.0;
                double X2 = sc.nextDouble() * 3.0;
                double X3 = sc.nextDouble() * 5.0;

                media = ( X1 + X2  + X3 ) / 10.0 ;

                System.out.printf("%.1f%n",media);
            }



        sc.close();
    }
}
