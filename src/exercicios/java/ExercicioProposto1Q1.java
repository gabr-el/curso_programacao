package exercicios.java;

import java.util.Scanner;

public class ExercicioProposto1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int n1 = leia.nextInt();
		int n2 = leia.nextInt();

		int soma = n1 + n2;

		System.out.println("O resultado da soma é: " + soma);
		
		leia.close();

	}

}
