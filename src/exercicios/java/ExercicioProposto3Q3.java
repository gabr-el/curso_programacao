package exercicios.java;

import java.util.Scanner;

public class ExercicioProposto3Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		byte alcool = 0;
		byte gasolina = 0;
		byte diesel = 0;

		byte combustivel = entrada.nextByte();

		while (combustivel != 4) {

			if (combustivel == 1) {
				alcool += +1;
			} else if (combustivel == 2) {
				gasolina += +1;
			} else if (combustivel == 3) {
				diesel += +1;
			}
		}
		entrada.close();
		System.out.printf("Muito obrigado%nAlcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);

	}

}
