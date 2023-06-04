import java.util.Scanner;

public class Exercicio11 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for ( int i = 1 ; i <= N; i++ ) {

            int primeiro = i;
            int quad = (int) Math.pow(i,2);
            int cub = (int) Math.pow(i,3);

            System.out.printf("%d %d %d%n", primeiro,quad,cub);

        }


       sc.close();
    }
}
