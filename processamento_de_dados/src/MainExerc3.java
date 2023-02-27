
import java.util.Scanner;

public class MainExerc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  A, B, C, D, prod;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		prod = A*B-C*D;
		
		System.out.println("DIFERENCA = " + prod);
		
		sc.close();

	}

}
