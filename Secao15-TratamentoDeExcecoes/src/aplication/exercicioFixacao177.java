package src.aplication;

import src.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class exercicioFixacao177 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number,holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        Double withdraw = sc.nextDouble();
        account.withdraw(withdraw);


        sc.close();
    }
}
