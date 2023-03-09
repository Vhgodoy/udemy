package aplication;

import entities.triangle;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();


        System.out.println("Enter the measure of entities.triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        double p1 = (x.a + x.b + x.c) / 2.0;
        double AreaX = Math.sqrt(p1 *(p1 - x.a)*(p1 - x.b)* (p1 - x.c));


        System.out.println("Enter the measure of entities.triangle Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double p2 = (y.a + y.b + y.c) / 2.0;
        double AreaY = Math.sqrt(p2 * (p2 - y.a)*(p2 - y.b)*(p2 - y.c));

        System.out.printf("Triangle X area: %.4f%n", AreaX );
        System.out.printf("Triangle Y area: %.4f%n", AreaY );

        if (AreaY > AreaX) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("Larger area: X");
        }

        sc.close();
    }
}
