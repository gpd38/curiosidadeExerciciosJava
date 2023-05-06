package programa011;

import java.util.Scanner;

public class OperacoesComMatriz {

	static long inicio, fim;
	static Scanner scanner;

	/**
	 * Calcular a diferença entre os tempos e imprimir o resultado em milissegundos
	 */
	public static void tempoDeExecucao() {
		System.out.println("Tempo de execução: " + (fim - inicio) / 1000000 + " ms");
	}

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		char continuar = 's';
		int opcao;

		do {
			System.out.println("Para sair digite 0. \nEscolha uma das opcoes abaixo:");
			System.out.println("\nCriar um método para: ");
			System.out.println("01. Gerar uma matriz com as dimensões que o usuário desejar, porém deve-se validar se o parâmetro mínimo é maior ou igual a 3 e menor ou igual a 50.");
			System.out.println("02. Preencher a matriz automaticamente com valores maiores que zero e menores que 1000.");
			System.out.println("03. Preencher a matriz manualmente limitando os valores digitados a maiores que zero e menores que 1000.");
			System.out.println("04. Somar cada linha da matriz e mostrar os valores separadamente.");
			System.out.println("05. Somar cada coluna da matriz e mostrar separadamente.");
			System.out.println("06. Somar a diagonal principal da matriz.");
			System.out.println("07. Somar a diagonal secundária da matriz.");
			System.out.println("08. Somar o triângulo superior da matriz.");
			System.out.println("09. Somar o triângulo inferior da matriz.");
			System.out.println("10. Somar cada quadrante da matriz.");
			System.out.println("11. Pesquisar um elemento na matriz.");
			System.out.println("12. Concatenar duas matrizes.");
			System.out.println("13. Somar duas matrizes.");
			System.out.println("14. Subtrair duas matrizes.");
			System.out.println("15. Multiplicar duas matrizes.");
			System.out.println("16. Dividir duas matrizes.");
			System.out.println("17. Gerar uma matriz com a borda em um e os demais em zero.");
			System.out.println("18. Encontrar o menor e o maior elemento da matriz.");
			System.out.println("19. Gerar uma matriz com bordas intercaladas entre um e zero.");
			System.out.println("20. Imprimir as posições da matriz.");
			System.out.println("21. Imprimir os valores da matriz.");
			System.out.println("22. Somar as posições da matriz.");
			System.out.println("23. Ordenar a matriz decrescente.");
			System.out.println("24. Ordenar a matriz crescente.");
			System.out.println("25. Atualizar um elemento específico. ");
			System.out.println("26. Calcular o determinante de uma matriz.");
			System.out.println("27. Calcular a transposta de uma matriz.");
			System.out.println("28. Validar se duas matrizes são iguais.");
			System.out.println("29. Contar quantos elementos pares e ímpares existem na matriz.");
			System.out.println("30. Validar se a soma de cada linha e coluna são iguais.");
			System.out.println("Exercícios Extras: ");
			System.out.println("31. Gerar uma matriz esparsa.");
			System.out.println("32. Transformar uma matriz 2D em 3D.");
			System.out.print("Opcao escolhida: ");

			try {
				opcao = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Opcao invalida! Digite um numero entre 1 e 32.");
				scanner.nextLine();
				continue;
			}

			switch (opcao) {
			case 0:
				System.out.println("Finalizando programa!");
				System.exit(0);
				break;
			case 1:
				inicio = System.nanoTime();
				metodo01();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 2:
				inicio = System.nanoTime();
				metodo02();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 3:
				inicio = System.nanoTime();
				metodo03();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 4:
				inicio = System.nanoTime();
				metodo04();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 5:
				inicio = System.nanoTime();
				metodo05();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 6:
				inicio = System.nanoTime();
				metodo06();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 7:
				inicio = System.nanoTime();
				metodo07();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 8:
				inicio = System.nanoTime();
				metodo08();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 9:
				inicio = System.nanoTime();
				metodo09();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 10:
				inicio = System.nanoTime();
				metodo10();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 11:
				inicio = System.nanoTime();
				metodo11();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 12:
				inicio = System.nanoTime();
				metodo12();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 13:
				inicio = System.nanoTime();
				metodo13();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 14:
				inicio = System.nanoTime();
				metodo14();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 15:
				inicio = System.nanoTime();
				metodo15();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 16:
				inicio = System.nanoTime();
				metodo16();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 17:
				inicio = System.nanoTime();
				metodo17();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 18:
				inicio = System.nanoTime();
				metodo18();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 19:
				inicio = System.nanoTime();
				metodo19();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 20:
				inicio = System.nanoTime();
				metodo20();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 21:
				inicio = System.nanoTime();
				metodo21();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 22:
				inicio = System.nanoTime();
				metodo22();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 23:
				inicio = System.nanoTime();
				metodo23();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 24:
				inicio = System.nanoTime();
				metodo24();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 25:
				inicio = System.nanoTime();
				metodo25();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 26:
				inicio = System.nanoTime();
				metodo26();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 27:
				inicio = System.nanoTime();
				metodo27();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 28:
				inicio = System.nanoTime();
				metodo28();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 29:
				inicio = System.nanoTime();
				metodo29();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 30:
				inicio = System.nanoTime();
				metodo30();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 31:
				inicio = System.nanoTime();
				metodo31();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			case 32:
				inicio = System.nanoTime();
				metodo32();
				fim = System.nanoTime();
				tempoDeExecucao();
				break;
			default:
				System.out.println("Digitou um valor invalido!");
				break;
			}

			System.out.println("Deseja continuar? (s/n)");
			continuar = scanner.next().charAt(0);

		} while (continuar == 's' || continuar == 'S');
		scanner.close();
	}

	private static void metodo01() {
		// TODO Auto-generated method stub

	}

	private static void metodo02() {
		// TODO Auto-generated method stub

	}

	private static void metodo03() {
		// TODO Auto-generated method stub

	}

	private static void metodo04() {
		// TODO Auto-generated method stub

	}

	private static void metodo05() {
		// TODO Auto-generated method stub

	}

	private static void metodo06() {
		// TODO Auto-generated method stub

	}

	private static void metodo07() {
		// TODO Auto-generated method stub

	}

	private static void metodo08() {
		// TODO Auto-generated method stub

	}

	private static void metodo09() {
		// TODO Auto-generated method stub

	}

	private static void metodo10() {
		// TODO Auto-generated method stub

	}

	private static void metodo11() {
		// TODO Auto-generated method stub

	}

	private static void metodo12() {
		// TODO Auto-generated method stub

	}

	private static void metodo13() {
		// TODO Auto-generated method stub

	}

	private static void metodo14() {
		// TODO Auto-generated method stub

	}

	private static void metodo15() {
		// TODO Auto-generated method stub

	}

	private static void metodo16() {
		// TODO Auto-generated method stub

	}

	private static void metodo17() {
		// TODO Auto-generated method stub

	}

	private static void metodo18() {
		// TODO Auto-generated method stub

	}

	private static void metodo19() {
		// TODO Auto-generated method stub

	}

	private static void metodo20() {
		// TODO Auto-generated method stub

	}

	private static void metodo21() {
		// TODO Auto-generated method stub

	}

	private static void metodo22() {
		// TODO Auto-generated method stub

	}

	private static void metodo23() {
		// TODO Auto-generated method stub

	}

	private static void metodo24() {
		// TODO Auto-generated method stub

	}

	private static void metodo25() {
		// TODO Auto-generated method stub

	}

	private static void metodo26() {
		// TODO Auto-generated method stub

	}

	private static void metodo27() {
		// TODO Auto-generated method stub

	}

	private static void metodo28() {
		// TODO Auto-generated method stub

	}

	private static void metodo29() {
		// TODO Auto-generated method stub

	}

	private static void metodo30() {
		// TODO Auto-generated method stub

	}

	private static void metodo31() {
		// TODO Auto-generated method stub

	}

	private static void metodo32() {
		// TODO Auto-generated method stub

	}

}
