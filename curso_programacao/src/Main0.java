package src;

import java.util.Locale;

public class Main0 {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Oficce desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products:%n %s, which price is $", product1, product2);
		System.out.printf(" %.2f\n ", price1);
		System.out.printf("%s, which price is $ %.2f\n", product2, price2);
		System.out.print("\n");
		System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
		System.out.print("\n");
		System.out.printf("Measure with eight decimal places: %f\n", measure);
		System.out.printf("rouded (three decimal places): %.2f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

}
