package aplication;

import entities03.Order;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Order order = new Order();

        System.out.println(order.getMomentOrder());

        sc.close();
    }
}
