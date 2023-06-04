package exercicioFixacao80.aplication;

import exercicioFixacao80.entities.clientCount;

import java.util.Locale;

import java.util.Scanner;

public class program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int id = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        clientCount client = new clientCount(id,name);

        System.out.print("Is there initial deposit (y/n): ");
        char resp = sc.next().charAt(0);

        if (resp == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            client.CreditAccount(balance);
            System.out.println();
            System.out.println("Account data:");
            System.out.println(client);
        } else {
            System.out.println();
            System.out.println("Account data:");
            System.out.println(client);
        }

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double credit = sc.nextDouble();
        client.CreditAccount(credit);
        System.out.println("Updated account data:");
        System.out.println(client);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        client.withdrawalAccount(withdraw);
        System.out.println("Updated account data:");
        System.out.println(client);

        sc.close();
    }

}
