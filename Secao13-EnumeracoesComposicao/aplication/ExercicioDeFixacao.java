package aplication;

import entities03.Client;
import entities03.Order;
import entities03.OrderItem;
import entities03.Product;
import entities03.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao {

    public static void main (String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name,email,birthDate);

        System.out.println();
        System.out.println("Enter Order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.println();

        Order order = new Order(new Date(), status, client);

        System.out.println();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();


        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("Enter #" + (i + 1) + " item data? ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            Product item = new Product(productName,productPrice);

            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, item);

            order.addItem(orderItem);
            System.out.println("___________________________________________________");

        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);



        sc.close();
    }
}
