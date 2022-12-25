package calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner calc = new Scanner(System.in);

		System.out.print("Quantas vezes deseja executar ?");
		int repetir = calc.nextInt();
		for (int i = 0; i < repetir; i++) {

			// Iteração com usuário
			System.out.print("Digite um valor: ");
			int valor1 = calc.nextInt();
			System.out.print("Digite o segundo valor:");
			int valor2 = calc.nextInt();
			int resultado = 0;
			String saida = "\n¨¨¨¨¨¨¨¨¨¨¨¨¨Calculadora¨¨¨¨¨¨¨¨¨¨¨¨¨\n";

			System.out.print("\nQual operacao deseja fazer?" + "\n[1] - Soma" + "\n[2] - Subtração"
					+ "\n[3] - Multiplicação" + "\n[4] - Divisão\nOperação Escolhida: ");
			int operacao = calc.nextInt();

			// processamento
			switch (operacao) {
			case 1:
				resultado = valor1 + valor2;
				saida += valor1 + " + " + valor2 + " = " + resultado;
				break;
			case 2:
				resultado = valor1 - valor2;
				saida += valor1 + " - " + valor2 + " = " + resultado;
				break;
			case 3:
				resultado = valor1 * valor2;
				saida += valor1 + " X " + valor2 + " = " + resultado;
				break;
			case 4:
				saida += valor1 + " / " + valor2 + " = " + ((float) valor1 / valor2);
				break;
			default:
				saida += "Operação Não disponível :(";
			}
			saida += "\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨";

			// Saida
			System.out.println(saida);

		}
	}
}
