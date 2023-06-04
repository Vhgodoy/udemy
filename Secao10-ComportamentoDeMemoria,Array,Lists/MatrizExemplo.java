import java.util.Arrays;
import java.util.Scanner;

public class MatrizExemplo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor da matriz: ");
        int n = sc.nextInt();

        Integer[][] mat = new Integer[n][n];

        System.out.println(Arrays.deepToString(mat));

        int negativos = 0;
        for (int i=0; i<mat.length;i++) {
            for (int j=0;j< mat[i].length;j++){
                mat[i][j]= sc.nextInt();
                if (mat[i][j] < 0 ) {
                    negativos++ ;
                }
            }
        }

        System.out.println("Main diagonal: ");
        for (int i=0; i< mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.print("numeros negativos: " + negativos);

        System.out.println();

        sc.close();
    }
}
