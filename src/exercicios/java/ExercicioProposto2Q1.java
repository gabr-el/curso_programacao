package exercicios.java;

import java.util.Scanner;

public class ExercicioProposto2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = leia.nextInt();

		if (numero >= 0)
			System.out.println("Não negativo");
		else
			System.out.println("Negativo");

		leia.close();

	}

}
