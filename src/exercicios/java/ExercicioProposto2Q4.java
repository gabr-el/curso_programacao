package exercicios.java;

import java.util.Scanner;

public class ExercicioProposto2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a hora inicial:");
		int horaI = entrada.nextInt();
		System.out.println("Digite a hora final:");
		int horaF = entrada.nextInt();

		int duracao;
		if (horaI < horaF) {
			duracao = horaF - horaI;
		} else {
			duracao = 24 - horaI + horaF;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		entrada.close();
	}

}
