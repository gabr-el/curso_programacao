package exercicios.java;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		float a = leia.nextFloat();
		float b = leia.nextFloat();
		float c = leia.nextFloat();

		float triangulo = (a * c) / 2;
		float circulo = (float) (Math.PI * Math.pow(c, 2));
		float trapezio = (a + b) * c / 2;
		float quadrado = (float) Math.pow(b, 2);
		float retangulo = a * b;

		System.out.printf("Triangulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f%n",
				triangulo, circulo, trapezio, quadrado, retangulo);

		leia.close();

	}

}
