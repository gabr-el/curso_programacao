package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Código:");
		byte codigo = entrada.nextByte();
		System.out.println("Quantidade:");
		int quantidade = entrada.nextInt();

		double total;

		if (codigo == 1) {
			total = quantidade * 4.00;
			System.out.printf("Total = $ %.2f", total);
		} else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Total = $ %.2f", total);
		} else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.printf("Total = $ %.2f", total);
		} else if (codigo == 4) {
			total = quantidade * 2.00;
			System.out.printf("Total = $ %.2f", total);
		} else {
			total = quantidade * 1.50;
			System.out.printf("Total = $ %.2f", total);
		}

		entrada.close();
	}

}
