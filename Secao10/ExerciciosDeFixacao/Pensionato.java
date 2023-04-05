package ExerciciosDeFixacao;

import entities.hostel;
import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n ;
        int account = 1;

        System.out.print("How many rooms will be rented? " );
        n = sc.nextInt();
        System.out.println();

        hostel[] hostel = new hostel[10];

        for (int i=0;i<n;i++) {
            System.out.println("Rent #" + account + ":" );
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            hostel[room] = new hostel(room, name, email);
            account ++;
            System.out.println();

            }

        System.out.println("Busy rooms:");
        for (entities.hostel value : hostel) {
            if (value != null) {
                System.out.println(value);
            }
        }
        sc.close();
    }
}
