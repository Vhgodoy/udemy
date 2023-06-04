package ExercicioFixacao165.aplication;

import ExercicioFixacao165.entities.Company;
import ExercicioFixacao165.entities.Individual;
import ExercicioFixacao165.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the Number of tax payers: ");
        int n = sc.nextInt();

        for (int i=0 ; i<n ; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Individual or Company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double annualIncome = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();
                list.add(new Individual(name,annualIncome,healthExpenses));
            } else if (type == 'c') {
                System.out.print("Number of employee: ");
                int numberOfEmployee = sc.nextInt();
                list.add(new Company(name,annualIncome,numberOfEmployee));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : list
             ) {
            System.out.println(taxPayer.getName() + " $ " + String.format("%.2f",taxPayer.tax()));
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $ ");
        double totalTaxes = 0.0;
        for (TaxPayer taxPayer: list
             ) {
            totalTaxes += taxPayer.tax();
        }
        System.out.print(String.format("%.2f",totalTaxes));
        sc.close();
    }
}
