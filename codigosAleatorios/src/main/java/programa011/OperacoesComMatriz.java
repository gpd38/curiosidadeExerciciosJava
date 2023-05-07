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
	 * Criar uma matriz do tamanho que o usu�rio escolher.
	 * 
	 * Regra: A matriz deve ter no m�nimo tamanho 3 e no m�ximo 50
	 */
	private static void metodo01() {
		console();
		do {
			System.out.print("Digite o tamanho da matriz (3 < x < 50): ");
			tamanho = scanner.nextInt();
		} while (tamanho < 3 || tamanho > 50);

		matrizDefault = new int[tamanho][tamanho];
		System.out.println("Uma matriz [" + tamanho + "][" + tamanho + "] foi criada com sucesso.");
		metodo21(matrizDefault);
	}

	/**
	 * Preencher a matriz automaticamente
	 * 
	 * Regra: Os valores podem variar de 1 at� 99
	 */
	private static void metodo02() {
		if (matrizDefault != null) {
			console();
			rand = new Random();
			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[i].length; j++) {
					matrizDefault[i][j] = rand.nextInt(98) + 1;
				}
			}
			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	/**
	 * Preencher a matriz manualmente
	 * 
	 * Regra: Os valores podem variar de 1 at� 99
	 */
	private static void metodo03() {
		if (matrizDefault != null) {
			console();
			System.out.println("O elemento deve ser 0 < x < 100");
			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[i].length; j++) {
					do {
						System.out.print("Matriz [" + (i + 1) + "][" + (j + 1) + "] = ");
						elemento = scanner.nextInt();
					} while (elemento < 1 || elemento > 99);
					matrizDefault[i][j] = elemento;
				}
			}
			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
				for (int j = 0; j < matrizDefault[i].length; j++) {
					sum += matrizDefault[i][j];
				}
				System.out.println("Row " + (i + 1) + ": " + sum);
			}
			System.out.println("Matriz Default");
			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	/**
	 * Somar diagonal secund�ria da matriz
	 */
	private static void metodo07() {
		if (matrizDefault != null) {
			console();
			int sum = 0;
			for (int i = 0; i < matrizDefault.length; i++) {
				sum += matrizDefault[i][matrizDefault.length - i - 1];
			}
			System.out.println("Soma dos elementos da diagonal secund�ria: " + sum);
			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	/**
	 * Somar triangulo superior da matriz
	 * 
	 * Regra: N�o deve utilizar os valores da diagonal
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
			System.out.println("Soma dos elementos do tri�ngulo superior: " + sum);
			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	/**
	 * Somar triangulo inferior da matriz.
	 * 
	 * Regra: N�o deve utilizar os valores da diagonal.
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
			System.out.println("Soma dos elementos do tri�ngulo inferior: " + sum);
			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	/**
	 * Somar cada quadrante da matriz.
	 * 
	 * Regra: N�o considerar a linha e coluna centrais. Adaptar a l�gic para matriz
	 * par e matriz �mpar
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
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
				System.out.println("Voc� digitou uma informa��o que n�o � um n�mero!");
				scanner.nextLine();
			}

			for (int i = 0; i < matrizDefault.length; i++) {
				for (int j = 0; j < matrizDefault[0].length; j++) {
					if (matrizDefault[i][j] == elemento) {
						encontrou = true;
						System.out.println(
								"O elemento " + elemento + " est� na posi��o [" + (i + 1) + "][" + (j + 1) + "]");
						break;
					}
				}
			}

			if (!encontrou) {
				System.out.println("O elemento " + elemento + " n�o est� presente na matriz. ");
			}

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	/**
	 * Concatenar duas matrizes, ou seja, unir os valores de ambas as matrizes
	 */
	private static void metodo12() {
		if (matrizDefault != null) {
			int[][] matrizA = new int[matrizDefault.length][matrizDefault.length];
			int[][] matrizB = new int[matrizDefault.length][matrizDefault.length];
			;
			int[][] matrizResultado = new int[matrizA.length][matrizA.length];
			String concat;

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
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
			System.out.println("Matriz Subtra��o");
			metodo21(matrizSubtracao);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
			System.out.println("Matriz Multiplica��o");
			metodo21(matrizMultiplicacao);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
			System.out.println("Matriz Multiplica��o");
			metodo21(matrizDivisao);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo17() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo18() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo19() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo20() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
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
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo22() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo23() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo24() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo25() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo26() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo27() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo28() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo29() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo30() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo31() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	private static void metodo32() {
		if (matrizDefault != null) {
			console();

			metodo21(matrizDefault);
		} else {
			System.out.println("Voc� n�o criou a matriz! Escolha a op��o 1 do menu.");
		}
	}

	public static void console() {
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
	}

	/**
	 * Calcular a diferen�a entre os tempos e imprimir o resultado em milissegundos
	 */
	public static void tempoDeExecucao() {
		System.out.println("Tempo de execu��o: " + (fim - inicio) / 1000000 + " ms");
	}

	private static void menuOpcoes() {
		System.out.println("Para sair digite 0. \nEscolha uma das opcoes abaixo:");
		System.out.println("\nCriar um m�todo para: ");
		System.out.println("01. Gerar uma matriz.");
		System.out.println("02. Preencher a matriz automaticamente");
		System.out.println("03. Preencher a matriz manualmente");
		System.out.println("04. Somar cada linha da matriz.");
		System.out.println("05. Somar cada coluna da matriz.");
		System.out.println("06. Somar a diagonal principal da matriz.");
		System.out.println("07. Somar a diagonal secund�ria da matriz.");
		System.out.println("08. Somar o tri�ngulo superior da matriz.");
		System.out.println("09. Somar o tri�ngulo inferior da matriz.");
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
		System.out.println("20. Imprimir as posi��es da matriz.");
		System.out.println("21. Imprimir os valores da matriz.");
		System.out.println("22. Somar as posi��es da matriz.");
		System.out.println("23. Ordenar a matriz decrescente.");
		System.out.println("24. Ordenar a matriz crescente.");
		System.out.println("25. Atualizar um elemento espec�fico. ");
		System.out.println("26. Calcular o determinante de uma matriz.");
		System.out.println("27. Calcular a transposta de uma matriz.");
		System.out.println("28. Validar se duas matrizes s�o iguais.");
		System.out.println("29. Contar quantos elementos pares e �mpares existem na matriz.");
		System.out.println("30. Validar se a soma de cada linha e coluna s�o iguais.");
		System.out.println("Exerc�cios Extras: ");
		System.out.println("31. Gerar uma matriz esparsa.");
		System.out.println("32. Transformar uma matriz 2D em 3D.");
		System.out.print("Opcao escolhida: ");
	}

	public static int[][][] calculaQuadrante(int[][] matriz) throws Exception {
		int n = matriz.length;
		if (n == 0 || n % 2 != 0) {
			throw new Exception("Matriz inv�lida");
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
