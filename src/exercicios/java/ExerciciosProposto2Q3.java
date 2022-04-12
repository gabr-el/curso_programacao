package exercicios.java;

import java.util.Scanner;

public class ExerciciosProposto2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um valor para A:");
		int a = entrada.nextInt();
		System.out.println("Insira um valor para B:");
		int b = entrada.nextInt();

		if (a % b == 0 || b % a == 0)
			System.out.println("São multiplos");
		else
			System.out.println("Não são multiplos");

		entrada.close();
	}

}
