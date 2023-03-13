package exemploStatico.Util;

public class Calculator1 {

    public final double PI = 3.14159;

    public double circumference (double radius) {
        return 2.0 * radius * PI ;
    }
    public double volume (double radius) {
        return 4.0 * PI * Math.pow(radius,3) / 3;
    }
}
