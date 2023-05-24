package exercicio161.aplication;

import exercicio161.entities.Employee;
import exercicio161.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        List<Employee> list = new ArrayList<>();


        System.out.print("Enter the Number of employees: ");
        n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Employee #"+ (i + 1) + " data:");
            System.out.print("Outsourced (y/n) ? ");
            char empOurOut = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (empOurOut == 'y') {
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();
                OutsourcedEmployee outsourcedEmployee = new OutsourcedEmployee(name,hours,valuePerHour,charge);
                list.add(outsourcedEmployee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);
                }
            }


        System.out.println();
        System.out.println("Payments:");
        for (Employee emp : list
             ) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
          sc.close();
        }
    }

