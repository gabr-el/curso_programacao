package anotacoes;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int x = entrada.nextInt();

		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = entrada.nextInt();
		}
		
		System.out.println(soma);
		
		entrada.close();
	}

}
