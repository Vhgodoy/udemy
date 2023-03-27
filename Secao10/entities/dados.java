package entities;

public class dados {

    public String name;
    public int age;
    public double height;


    public dados(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public dados(String name) {
        this.name = name;
    }

    public dados(int age , double height) {
        this.age = age;
        this.height = height;
    }

    public dados(double height) {
        this.height = height;
    }

    public void mediaHeight(int n) {
        this.height = height / n;
    }

    public void percentAge(int minAge , int n) {
        this.age = (minAge * 100) / n;

    }
}

