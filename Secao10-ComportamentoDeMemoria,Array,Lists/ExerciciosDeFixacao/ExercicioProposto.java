package ExerciciosDeFixacao;

import entities.Employee;
import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double percent;
        int idEmployee;

        List<Employee> list = new ArrayList<>();


        System.out.print("How many employees will be registered ? ");
        n = sc.nextInt();


        System.out.println();

        for (int i=0;i<n;i++) {

            System.out.printf("Emplyoee #%d:\n", i + 1  );
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            while (hasId(list,id)){
                System.out.println("Id already taken! Try again: ");
                System.out.print("Id: ");
                id = sc.nextInt();
                sc.nextLine();
            }

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            Employee employee = new Employee(id,name,salary);

            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        idEmployee = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

        if (emp == null) {
            System.out.print("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            percent = sc.nextDouble();
            emp.increase(percent);
        }

        System.out.println();
        System.out.println("List of employee:");
        for (Employee x : list
             ) {
            System.out.println(x);
        }
        sc.close();
    }

    public static boolean hasId (List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
