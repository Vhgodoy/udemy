package aplication;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Enter the measure of entities.triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        double AreaX = x.area();

        System.out.println("Enter the measure of entities.triangle Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double AreaY = y.area();

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
