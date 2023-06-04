package aplication;

import entities.E03student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        E03student student = new E03student();

        student.name = sc.nextLine();
        student.firstNote = sc.nextDouble();
        student.secondNote = sc.nextDouble();
        student.thirdNote = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n" , student.total());

        double pass = student.total();
        student.pass(pass);

        sc.close();
    }
}
