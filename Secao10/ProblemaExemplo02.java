import entities.product01;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo02 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        product01[] vect = new product01[N];

        for (int i=0; i< vect.length; i++) {
            sc.nextLine();
            System.out.println("Enter name product: ");
            String name = sc.next();
            System.out.println("Enter with a price:  ");
            double price = sc.nextDouble();
            vect[i] = new product01(name, price);
        }

        System.out.println();
        System.out.println(Arrays.toString(vect));
        System.out.println();

        double sum = 0.0 ;
        for (int i = 0; i< vect.length; i++ ) {
            sum += vect[i].getPrice();
        }

        double avg = sum / N;

        System.out.printf("AVERAGE: %.2f%n", avg);

        sc.close();
    }
}
