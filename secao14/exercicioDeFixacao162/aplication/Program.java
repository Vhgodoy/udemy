package exercicioDeFixacao162.aplication;

import exercicioDeFixacao162.entities.ImportedProduct;
import exercicioDeFixacao162.entities.Product;
import exercicioDeFixacao162.entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {

    public static void main (String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=0; i<n;i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                if (type == 'c') {
                    list.add(new Product(name, price));
                }
                else if (type == 'u') {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new UsedProduct(name,price,date));
                } else if (type == 'i') {
                    System.out.print("Customs fee: ");
                    double fee = sc.nextDouble();
                    list.add(new ImportedProduct(name,price,fee));
                }

        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product:list
             ) {
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
