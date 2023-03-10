package aplication;

import entities.E01rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        E01rectangle rectangle = new E01rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        double area = rectangle.Area();
        double perimeter = rectangle.Perimeter();
        double diagonal = rectangle.Diagonal();

        System.out.printf("AREA = %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());
        sc.close();
    }
}
