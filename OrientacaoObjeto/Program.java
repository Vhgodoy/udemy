import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xa ,xb ,xc ,ya ,yb ,yc ;


        System.out.println("Enter the measure of triangle X:");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        double p1 = (xa + xb + xc) / 2.0;
        double AreaX = Math.sqrt(p1 *(p1 - xa)*(p1 - xb)* (p1 - xc));


        System.out.println("Enter the measure of triangle Y");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();
        double p2 = (ya + yb + yc) / 2.0;
        double AreaY = Math.sqrt(p2 * (p2 - ya)*(p2 - yb)*(p2 - yc));

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
