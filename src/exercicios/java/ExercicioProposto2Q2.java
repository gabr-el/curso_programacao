package exercicios.java;

import java.util.Scanner;

public class ExercicioProposto2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = entrada.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		entrada.close();
	}

}
