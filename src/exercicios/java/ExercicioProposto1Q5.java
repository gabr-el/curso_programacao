package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		leia.nextInt();
		int quaPeca1 = leia.nextInt();
		double valPeca1 = leia.nextDouble();

		leia.nextInt();
		int quaPeca2 = leia.nextInt();
		double valPeca2 = leia.nextDouble();

		double total = quaPeca1 * valPeca1 + quaPeca2 * valPeca2;

		System.out.printf("Valor a pagar: %.2f", total);

		leia.close();
	}

}
