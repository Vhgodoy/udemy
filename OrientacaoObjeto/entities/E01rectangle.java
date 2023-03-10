package entities;

import java.awt.geom.Area;

public class E01rectangle {

        public double Width ;
        public double Height;

        public double Area () {
           double A ;
           return Width * Height;
        }

        public double Perimeter() {
            double P;
            return 2 * (Width + Height);
        }

        public double Diagonal () {
            double D;
            return Math.sqrt(Math.pow(Width,2) + Math.pow(Height ,2));
        }

        public String toString () {
            return String.format("%.2f", Diagonal())
                    + String.format("%.2f", Perimeter())
                    + String.format("%.2f", Area());
        }

}

