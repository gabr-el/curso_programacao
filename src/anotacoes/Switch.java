package anotacoes;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor:");
		byte valor = entrada.nextByte();

		String dia;

		switch (valor) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter�a";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "S�bado";
			break;
		default:
			dia = "Inv�lido";
			break;
		}
		entrada.close();
		System.out.println(dia);

	}

}
