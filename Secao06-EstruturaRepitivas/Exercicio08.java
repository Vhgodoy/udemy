import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            int den = sc.nextInt();

                if ( den == 0) {
                    System.out.println("divisao impossivel");
                } else  {
                    float div = (float) num / den ;
                    System.out.println(div);
                }
        }

        // test
        sc.close();
    }
}
