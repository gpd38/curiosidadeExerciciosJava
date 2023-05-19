package programa011;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class OperacoesComMatriz {

	static long inicio, fim;
	static Scanner scanner;
	static int[][] matrizDefault;
	static int tamanho, elemento;
	static Random rand;

	public static void main(String[] args) {
		
		setup();

		scanner = new Scanner(System.in);
		char continuar = 's';
		int opcao;

		do {
			menuOpcoes();

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
				metodo21(matrizDefault);
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

	/**
	 * Criar uma matriz do tamanho que o usuário escolher.
	 * 
	 * Regra: A matriz deve ter no mínimo tamanho 3 e no máximo 50
	 */
	private static void metodo01() {
		console();
		do {
			System.out.print("Digite o tamanho da matriz (3 < x < 20): ");
			tamanho = scanner.nextInt();
		} while (tamanho < 3 || tamanho > 20);

		matrizDefault = new int[tamanho][tamanho];
		System.out.println("Uma matriz [" + tamanho + "][" + tamanho + "] foi criada com sucesso.");
		metodo21(matrizDefault);
	}

	/**
	 * Preencher a matriz automaticamente
	 * 
	 * Regra: Os valores podem variar de 1 até 99
	 */
	private static void metodo02() {
		if (matrizDefault != null) {
			console();
			rand = new Random();
			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizDefault[i][j] = rand.nextInt(98) + 1;
				}
			}
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Preencher a matriz manualmente
	 * 
	 * Regra: Os valores podem variar de 1 até 99
	 */
	private static void metodo03() {
		if (matrizDefault != null) {
			console();
			System.out.println("O elemento deve ser 0 < x < 100");
			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					do {
						System.out.print("Matriz [" + (i + 1) + "][" + (j + 1) + "] = ");
						elemento = scanner.nextInt();
					} while (elemento < 1 || elemento > 99);
					matrizDefault[i][j] = elemento;
				}
			}
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Somar cada linha da matriz
	 */
	private static void metodo04() {
		if (matrizDefault != null) {
			console();
			for (int i = 0; i < matrizDefault.length; i++) {
				int sum = 0;
				for (int j = 0; j < matrizDefault[0].length; j++) {
					sum += matrizDefault[i][j];
				}
				System.out.println("Row " + (i + 1) + ": " + sum);
			}
			System.out.println("Matriz Default");
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Somar cada coluna da matriz
	 */
	private static void metodo05() {
		if (matrizDefault != null) {
			console();
			for (int i = 0; i < matrizDefault[0].length; i++) {
				int sum = 0;
				for (int j = 0; j < matrizDefault.length; j++) {
					sum += matrizDefault[j][i];
				}
				System.out.println("Column " + (i + 1) + ": " + sum);
			}
			System.out.println("Matriz Default");
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Somar diagonal principal da matriz
	 */
	private static void metodo06() {
		if (matrizDefault != null) {
			console();
			int sum = 0;
			for (int i = 0; i < matrizDefault.length; i++) {
				sum += matrizDefault[i][i];
			}
			System.out.println("Soma dos elementos da diagonal principal: " + sum);
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Somar diagonal secundária da matriz
	 */
	private static void metodo07() {
		if (matrizDefault != null) {
			console();
			int sum = 0;
			for (int i = 0; i < matrizDefault.length; i++) {
				sum += matrizDefault[i][matrizDefault.length - i - 1];
			}
			System.out.println("Soma dos elementos da diagonal secundária: " + sum);
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Somar triangulo superior da matriz
	 * 
	 * Regra: Não deve utilizar os valores da diagonal
	 */
	private static void metodo08() {
		if (matrizDefault != null) {

			console();
			int sum = 0;
			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = i + 1; j < matrizDefault[i].length; j++) {
					sum += matrizDefault[i][j];
				}
			}
			System.out.println("Soma dos elementos do triângulo superior: " + sum);
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Somar triangulo inferior da matriz.
	 * 
	 * Regra: Não deve utilizar os valores da diagonal.
	 */
	private static void metodo09() {
		if (matrizDefault != null) {
			console();
			int sum = 0;
			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < i; j++) {
					sum += matrizDefault[i][j];
				}
			}
			System.out.println("Soma dos elementos do triângulo inferior: " + sum);
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Somar cada quadrante da matriz.
	 * 
	 * Regra: Não considerar a linha e coluna centrais. Adaptar a lógic para matriz
	 * par e matriz ímpar
	 */
	private static void metodo10() {
		if (matrizDefault != null) {
			console();
			int center;
			int sumQ1 = 0, sumQ2 = 0, sumQ3 = 0, sumQ4 = 0;
			center = (matrizDefault.length / 2);

			if (matrizDefault.length % 2 == 1) {
				for (int i = 0; i < center; i++) {
					for (int j = 0; j < center; j++) {
						sumQ1 += matrizDefault[i][j];
					}
				}
				for (int i = 0; i < center; i++) {
					for (int j = center + 1; j < matrizDefault.length; j++) {
						sumQ2 += matrizDefault[i][j];
					}
				}
				for (int i = center + 1; i < matrizDefault.length; i++) {
					for (int j = 0; j < center; j++) {
						sumQ3 += matrizDefault[i][j];
					}
				}
				for (int i = center + 1; i < matrizDefault.length; i++) {
					for (int j = center + 1; j < matrizDefault[0].length; j++) {
						sumQ4 += matrizDefault[i][j];
					}
				}
			} else {
				for (int i = 0; i < center; i++) {
					for (int j = 0; j < center; j++) {
						sumQ1 += matrizDefault[i][j];
					}
				}
				for (int i = 0; i < center; i++) {
					for (int j = center; j < matrizDefault.length; j++) {
						sumQ2 += matrizDefault[i][j];
					}
				}
				for (int i = center; i < matrizDefault.length; i++) {
					for (int j = 0; j < center; j++) {
						sumQ3 += matrizDefault[i][j];
					}
				}
				for (int i = center; i < matrizDefault.length; i++) {
					for (int j = center; j < matrizDefault[0].length; j++) {
						sumQ4 += matrizDefault[i][j];
					}
				}
			}

			System.out.println("Soma dos elementos do quadrante 1: " + sumQ1);
			System.out.println("Soma dos elementos do quadrante 2: " + sumQ2);
			System.out.println("Soma dos elementos do quadrante 3: " + sumQ3);
			System.out.println("Soma dos elementos do quadrante 4: " + sumQ4);
			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Pesquisar um elemento na matriz
	 * 
	 * Regra: Elementos a serem pesquisados devem ser maiores que zero.
	 */
	private static void metodo11() {
		boolean encontrou = false;
		if (matrizDefault != null) {
			console();
			try {
				do {
					System.out.print("Qual elemento deseja pesquisar? \nElemento = ");
					elemento = scanner.nextInt();
				} while (elemento < 0);
			} catch (InputMismatchException e) {
				System.out.println("Você digitou uma informação que não é um número!");
				scanner.nextLine();
			}

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					if (matrizDefault[i][j] == elemento) {
						encontrou = true;
						System.out.println(
								"O elemento " + elemento + " está na posição [" + (i + 1) + "][" + (j + 1) + "]");
						break;
					}
				}
			}

			if (!encontrou) {
				System.out.println("O elemento " + elemento + " não está presente na matriz. ");
			}

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Concatenar duas matrizes, ou seja, unir os valores de ambas as matrizes
	 */
	private static void metodo12() {
		if (matrizDefault != null) {
			int[][] matrizA = new int[tamanho][tamanho];
			int[][] matrizB = new int[tamanho][tamanho];
			int[][] matrizResultado = new int[tamanho][tamanho];
			String concat;
			rand = new Random();

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizA[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizB[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[0].length; j++) {
					concat = matrizA[i][j] + "" + matrizB[i][j];
					matrizResultado[i][j] = Integer.parseInt(concat);
				}
			}

			System.out.println("MatrizA");
			metodo21(matrizA);
			System.out.println("MatrizB");
			metodo21(matrizB);
			System.out.println("Matriz Concatenada");
			metodo21(matrizResultado);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Somar duas matrizes
	 */
	private static void metodo13() {
		if (matrizDefault != null) {
			console();
			int[][] matrizA = new int[matrizDefault.length][matrizDefault.length];
			int[][] matrizB = new int[matrizDefault.length][matrizDefault.length];
			;
			int[][] matrizSoma = new int[matrizA.length][matrizA.length];

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizA[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizB[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[0].length; j++) {
					matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
				}
			}

			System.out.println("MatrizA");
			metodo21(matrizA);
			System.out.println("MatrizB");
			metodo21(matrizB);
			System.out.println("Matriz Soma");
			metodo21(matrizSoma);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Subtrair matrizes
	 */
	private static void metodo14() {
		if (matrizDefault != null) {
			console();

			int[][] matrizA = new int[matrizDefault.length][matrizDefault.length];
			int[][] matrizB = new int[matrizDefault.length][matrizDefault.length];
			;
			int[][] matrizSubtracao = new int[matrizA.length][matrizA.length];

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizA[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizB[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[0].length; j++) {
					matrizSubtracao[i][j] = matrizA[i][j] - matrizB[i][j];
				}
			}

			System.out.println("MatrizA");
			metodo21(matrizA);
			System.out.println("MatrizB");
			metodo21(matrizB);
			System.out.println("Matriz Subtração");
			metodo21(matrizSubtracao);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Multiplicar duas matrizes
	 */
	private static void metodo15() {
		if (matrizDefault != null) {
			console();
			int[][] matrizA = new int[matrizDefault.length][matrizDefault.length];
			int[][] matrizB = new int[matrizDefault.length][matrizDefault.length];
			;
			int[][] matrizMultiplicacao = new int[matrizA.length][matrizA.length];

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizA[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizB[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[0].length; j++) {
					matrizMultiplicacao[i][j] = matrizA[i][j] * matrizB[i][j];
				}
			}

			System.out.println("MatrizA");
			metodo21(matrizA);
			System.out.println("MatrizB");
			metodo21(matrizB);
			System.out.println("Matriz Multiplicação");
			metodo21(matrizMultiplicacao);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo16() {
		if (matrizDefault != null) {
			console();
			int[][] matrizA = new int[matrizDefault.length][matrizDefault.length];
			int[][] matrizB = new int[matrizDefault.length][matrizDefault.length];
			;
			int[][] matrizDivisao = new int[matrizA.length][matrizA.length];

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizA[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					matrizB[i][j] = rand.nextInt(98) + 1;
				}
			}

			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[0].length; j++) {
					matrizDivisao[i][j] = matrizA[i][j] / matrizB[i][j];
				}
			}

			System.out.println("MatrizA");
			metodo21(matrizA);
			System.out.println("MatrizB");
			metodo21(matrizB);
			System.out.println("Matriz Multiplicação");
			metodo21(matrizDivisao);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo17() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo18() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo19() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo20() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Imprimir os elementos da matriz
	 */
	private static void metodo21(int[][] matriz) {
		if (matrizDefault != null) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print("\t" + String.format("%-6d", matriz[i][j]));
				}
				System.out.println();
			}
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo22() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo23() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo24() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo25() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo26() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo27() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo28() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo29() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo30() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo31() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	private static void metodo32() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Você não criou a matriz! Escolha a opção 1 do menu.");
		}
	}

	/**
	 * Configurações iniciais para funcionamento da classe
	 */
	private static void setup() {
		tamanho = 3;
		matrizDefault = new int[tamanho][tamanho];
		for (int i = 0; i < matrizDefault.length; i++) {
			for (int j = 0; j < matrizDefault[0].length; j++) {
				matrizDefault[i][j] = (i + j) * 2;
			}
		}
	}

	/**
	 * Inserir espaços entre uma execução e outra
	 */
	public static void console() {
		for (int i = 1; i < 3; i++) {
			System.out.println();
		}
	}

	/**
	 * Calcular a diferença entre os tempos e imprimir o resultado em milissegundos
	 */
	public static void tempoDeExecucao() {
		System.out.println("Tempo de execução: " + (fim - inicio) / 1000000 + " ms");
	}

	private static void menuOpcoes() {
		System.out.println("Escolha uma das opcoes abaixo:");
		System.out.println("\t00. Finalizar execução");

		System.out.println("Entrada de valores: ");
		System.out.println("\t01. Gerar uma matriz aleatória com o tamanho definido pelo usuário.");
		System.out.println("\t02. Preencher a matriz automaticamente");
		System.out.println("\t03. Preencher a matriz manualmente");

		System.out.println("Operações básicas: ");
		System.out.println("\t04. Somar cada linha da matriz.");
		System.out.println("\t05. Somar cada coluna da matriz.");
		System.out.println("\t06. Somar a diagonal principal da matriz.");
		System.out.println("\t07. Somar a diagonal secundária da matriz.");
		System.out.println("\t08. Somar o triângulo superior da matriz.");
		System.out.println("\t09. Somar o triângulo inferior da matriz.");
		System.out.println("\t10. Somar cada quadrante da matriz.");
		System.out.println("\t11. Pesquisar um elemento na matriz.");
		System.out.println("\t18. Encontrar o menor e o maior elemento da matriz.");
		System.out.println("\t20. Imprimir as posições da matriz.");
		System.out.println("\t21. Imprimir os valores da matriz.");
		System.out.println("\t22. Somar as posições da matriz.");
		System.out.println("\t23. Ordenar a matriz decrescente.");
		System.out.println("\t24. Ordenar a matriz crescente.");
		System.out.println("\t25. Atualizar um elemento específico. ");
		System.out.println("\t29. Contar quantos elementos pares e ímpares existem na matriz.");
		System.out.println("\t30. Validar se a soma de cada linha e coluna são iguais.");

		System.out.println("Operações entre matrizes: ");
		System.out.println("\t12. Concatenar duas matrizes.");
		System.out.println("\t13. Somar duas matrizes.");
		System.out.println("\t14. Subtrair duas matrizes.");
		System.out.println("\t15. Multiplicar duas matrizes.");
		System.out.println("\t16. Dividir duas matrizes.");
		System.out.println("\t28. Validar se duas matrizes são iguais.");

		System.out.println("Operações mais complexas com matriz: ");
		System.out.println("\t17. Gerar uma matriz com a borda em um e os demais em zero.");
		System.out.println("\t19. Gerar uma matriz com bordas intercaladas entre um e zero.");
		System.out.println("\t26. Calcular o determinante de uma matriz.");
		System.out.println("\t27. Calcular a transposta de uma matriz.");

		System.out.println("Exercícios Extras: ");
		System.out.println("\t31. Gerar uma matriz esparsa.");
		System.out.println("\t32. Transformar uma matriz 2D em 3D.");
		System.out.print("Opção escolhida: ");
	}

	public static int[][][] calculaQuadrante(int[][] matriz) throws Exception {
		int n = matriz.length;
		if (n == 0 || n % 2 != 0) {
			throw new Exception("Matriz inválida");
		}

		int[][][] quadrantes = new int[4][n / 2][n / 2];

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n / 2; j++) {
				quadrantes[0][i][j] = matriz[i][j]; // primeiro quadrante
				quadrantes[1][i][j] = matriz[i][j + n / 2]; // segundo quadrante
				quadrantes[2][i][j] = matriz[i + n / 2][j]; // terceiro quadrante
				quadrantes[3][i][j] = matriz[i + n / 2][j + n / 2]; // quarto quadrante
			}
		}

		return quadrantes;
	}

}
