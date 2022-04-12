package exercicios.java;

import java.util.Locale;

public class Fixacao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declarando variaveis
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		// exibindo
		System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n", product1, price1, product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f%nRounded (three decimal places): %.3f%nUS decimal point: %.3f%n", measure, measure, measure);
		System.out.println();
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
