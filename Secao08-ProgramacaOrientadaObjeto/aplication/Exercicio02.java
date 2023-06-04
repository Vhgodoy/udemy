package aplication;

import entities.E02employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        E02employee  employee = new E02employee();

        System.out.print("Name: ");
        employee.Name = sc.nextLine();


        System.out.print("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();
        System.out.println();

        System.out.printf("Employee: %s, $ %.2f%n " , employee.Name, employee.NetSalary() );
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println();

        System.out.printf("Updated data: %s, $ %.2f ", employee.Name , employee.NetSalary());

        sc.close();
    }
}
