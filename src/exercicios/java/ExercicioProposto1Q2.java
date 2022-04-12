package exercicios.java;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double raio = leia.nextDouble();

		double area = Math.PI * Math.pow(raio, raio);

		System.out.printf("A área corresponde: %.4f", area);
		
		leia.close();
	}

}
