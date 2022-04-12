package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor:");
		double valor = entrada.nextDouble();

		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalo (0,25)");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("Intervalo (25,50)");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("Intervalor (50,75)");
		} else if (valor > 75 && valor <= 100) {
			System.out.println("Intervalo (75,100)");
		} else {
			System.out.println("Fora de intervalo");
		}

		entrada.close();
	}

}
