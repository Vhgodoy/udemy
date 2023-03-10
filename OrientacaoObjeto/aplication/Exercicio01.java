package aplication;

import entities.E01rectangle;
import entities.Triangle;

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

        System.out.println("AREA = " + area);
        System.out.println("PERIMETER = " + perimeter);
        System.out.println("DIAGONAL = " + diagonal);

        sc.close();
    }
}
