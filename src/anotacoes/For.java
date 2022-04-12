package anotacoes;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();

		int soma = 0;

		for (int i = 0; i < n; i++) {
			int x = entrada.nextInt();
			soma += x;
		}
		System.out.println(soma);
		entrada.close();

	}

}
