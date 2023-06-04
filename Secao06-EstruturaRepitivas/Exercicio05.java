import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();


        for (int i = 0; i < X; i ++ ) {
            int impar = i += 1 ;
            System.out.println(impar);
        }

        sc.close();

    }
}
