package exercicios.java;

import java.util.Scanner;

public class ExercicioProposto1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();
		int d = leia.nextInt();

		int diferenca = a * b - c * d;
		
		System.out.println(diferenca);
		
		leia.close();
	}

}
