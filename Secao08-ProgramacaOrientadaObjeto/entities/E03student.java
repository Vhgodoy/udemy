package entities;

public class E03student {

    public String name;

    public double firstNote;
    public double secondNote;
    public double thirdNote;

    public double total () {
        return firstNote + secondNote + thirdNote;
    }



    public void pass (double total) {
        if (total >= 60) {
            System.out.println("PASS");
        } else {
            double MISS = 60 - total ;
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS" , MISS);
        }
    }
}
