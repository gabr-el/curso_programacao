package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int numero = leia.nextInt();
		int horas = leia.nextInt();
		double valorHoras = leia.nextDouble();

		double salario = horas * valorHoras;

		System.out.printf("Número = %d %nSalário = U$ %.2f ", numero, salario);

		leia.close();
	}

}
