package exercicioResolvido164.aplication;

import exercicioResolvido164.entities.Circle;
import exercicioResolvido164.entities.Rectangle;
import exercicioResolvido164.entities.Shape;
import exercicioResolvido164.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();
        int n;

        System.out.print("Enter the number of shapes: ");
        n = sc.nextInt();

        for ( int i=0; i<n; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color,width,height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape: list
             ) {
            System.out.println(String.format("%.2f",shape.area()));
        }
        sc.close();
    }
}