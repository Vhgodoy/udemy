
import java.util.Scanner;

public class ExercicioProposto {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int m = sc.nextInt();

        System.out.print("Digite q quantidade de colunas: ");
        int n = sc.nextInt();

        System.out.println("Entre com os valores correspondentes a matriz:");
        int[][] matriz = new int[m][n];

        for (int i=0;i<matriz.length;i++ ) {
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Entre com o valor de 'X': ");
        int x = sc.nextInt();

        for (int i=0; i < matriz.length;i++){
            for ( int j=0 ;j < matriz[i].length;j++){
                if (matriz[i][j] == x) {
                    m = i;
                    n = j;
                    System.out.printf("position %d,%d: \n" , m, n  );
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("right: " + matriz[i][j+1]);
                    }
                    if (i > 0) {
                        System.out.println("Upper: " + matriz[i-1][j]);
                    }
                    if (i < matriz[i].length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
