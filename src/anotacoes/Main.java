package anotacoes;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		// atribuindo um valor a variavel e imprimindo
		double x = 10.35784;
		System.out.println(x);

		// formatando com duas casas decimais após a vírgula
		System.out.printf("%.2f%n", x);

		// formatando para utilizar o ponto no lugar da vírgula
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		// concatenando a exibição da variavel com strings
		System.out.println("RESULTADO = " + x + " METROS");

		// formatando para exibir o conteudo da variavel entre strings
		System.out.printf("RESULTADO = %.2f metros%n", x);

		// interpolando valores com strings
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
