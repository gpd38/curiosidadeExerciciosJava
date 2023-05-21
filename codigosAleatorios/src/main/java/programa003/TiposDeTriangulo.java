package programa003;

import java.util.Scanner;

public class TiposDeTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String result;

		// entrada
		System.out.println("Digite o comprimento do lado 1: ");
		double lado1 = scanner.nextDouble();
		System.out.println("Digite o comprimento do lado 2: ");
		double lado2 = scanner.nextDouble();
		System.out.println("Digite o comprimento do lado 3: ");
		double lado3 = scanner.nextDouble();

		// valida��o
		if (isTriangulo(lado1, lado2, lado3)) {
			String tipoTriangulo = obterTipoTriangulo(lado1, lado2, lado3);
			result = "Os lados formam um tri�ngulo " + tipoTriangulo;

			if (podeSerTrianguloRetangulo(lado1, lado2, lado3)) {
				result = "O tri�ngulo pode ser um tri�ngulo ret�ngulo.";
			} else {
				result = "O tri�ngulo n�o pode ser um tri�ngulo ret�ngulo.";
			}
		} else {
			result = "Os lados n�o formam um tri�ngulo.";
		}

		// resultado
		System.out.println(result);

		scanner.close();
	}

	/**
	 * Metodo que verifica se � forma um triangulo
	 */
	public static boolean isTriangulo(double lado1, double lado2, double lado3) {
		return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
	}

	/**
	 * Metodo que verifica se � um triangulo is�sceles, escaleno ou equil�tero
	 */
	public static String obterTipoTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 == lado2 && lado1 == lado3) {
			return "equil�tero";
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "is�sceles";
		} else {
			return "escaleno";
		}
	}

	/**
	 * Metodo que verifica se � um triangulo retangulo
	 */
	public static boolean podeSerTrianguloRetangulo(double lado1, double lado2, double lado3) {
		double maiorLado = Math.max(lado1, Math.max(lado2, lado3));

		if (maiorLado == lado1) {
			return lado1 * lado1 == lado2 * lado2 + lado3 * lado3;
		} else if (maiorLado == lado2) {
			return lado2 * lado2 == lado1 * lado1 + lado3 * lado3;
		} else {
			return lado3 * lado3 == lado1 * lado1 + lado2 * lado2;
		}
	}
}