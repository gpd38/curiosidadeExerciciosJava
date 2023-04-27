package programa005;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner calc = new Scanner(System.in);

		System.out.print("Quantas vezes deseja executar ?");
		int repetir = calc.nextInt();
		for (int i = 0; i < repetir; i++) {

			// Itera��o com usu�rio
			System.out.print("Digite um valor: ");
			int valor1 = calc.nextInt();
			System.out.print("Digite o segundo valor:");
			int valor2 = calc.nextInt();
			int resultado = 0;
			String saida = "\n�������������Calculadora�������������\n";

			System.out.print("\nQual operacao deseja fazer?" + "\n[1] - Soma" + "\n[2] - Subtra��o"
					+ "\n[3] - Multiplica��o" + "\n[4] - Divis�o\nOpera��o Escolhida: ");
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
				saida += "Opera��o N�o dispon�vel :(";
			}
			saida += "\n�����������������������������������������";

			// Saida
			System.out.println(saida);

		}
	}
}
