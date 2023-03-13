package exemploStatico.Aplication;

import exemploStatico.Util.Calculator1;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator1 calc = new Calculator1();

        System.out.println("Enter radius:");

        double radius = sc.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n",c );
        System.out.printf("Volume: %.2f%n",v );
        System.out.printf("PI value: %.2f%n", calc.PI );

        sc.close();
    }
}
