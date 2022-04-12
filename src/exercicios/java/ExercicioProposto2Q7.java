package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Valor de X e Y:");
		double x = entrada.nextDouble();
		double y = entrada.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x < 0 && y > 0) {
			System.out.println("Q4");
		} else if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else {
			System.out.println("Nulo");
		}

		entrada.close();
	}

}
