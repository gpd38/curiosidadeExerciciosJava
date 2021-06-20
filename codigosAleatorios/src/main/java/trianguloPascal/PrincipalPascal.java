package trianguloPascal;

import java.util.Scanner;

public class PrincipalPascal {

	static Scanner entrada = new Scanner(System.in);
	static int tamTriangulo;
	static int[] vetor = new int[1000];

	public static void main(String[] args) {

		do {
			System.out.print("Informe o tamanho do triangulo [N]x[N]: ");
			tamTriangulo = entrada.nextInt();
		} while (tamTriangulo <= 0);

		// inicializa a primeira coluna
		vetor[0] = 1;

		for (int i = 0; i <= tamTriangulo; i++) {
			int aux1 = 0;
			int aux2;
			for (int j = 0; j <= i; j++) {
				aux2 = aux1 + vetor[j];
				aux1 = vetor[j];
				vetor[j] = aux2;
				System.out.printf("%"+((tamTriangulo/2)+1)+"d", vetor[j]);
			}
			System.out.println();
		}

	}

}
