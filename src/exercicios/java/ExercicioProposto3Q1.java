package exercicios.java;

import java.util.Scanner;

public class ExercicioProposto3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int senha = entrada.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inv�lida");
			senha = entrada.nextInt();
		}
		entrada.close();
		System.out.println("Senha v�lida");
	}

}
