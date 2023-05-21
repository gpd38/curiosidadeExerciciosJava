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

		// validação
		if (isTriangulo(lado1, lado2, lado3)) {
			String tipoTriangulo = obterTipoTriangulo(lado1, lado2, lado3);
			result = "Os lados formam um triângulo " + tipoTriangulo;

			if (podeSerTrianguloRetangulo(lado1, lado2, lado3)) {
				result = "O triângulo pode ser um triângulo retângulo.";
			} else {
				result = "O triângulo não pode ser um triângulo retângulo.";
			}
		} else {
			result = "Os lados não formam um triângulo.";
		}

		// resultado
		System.out.println(result);

		scanner.close();
	}

	/**
	 * Metodo que verifica se é forma um triangulo
	 */
	public static boolean isTriangulo(double lado1, double lado2, double lado3) {
		return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
	}

	/**
	 * Metodo que verifica se é um triangulo isósceles, escaleno ou equilátero
	 */
	public static String obterTipoTriangulo(double lado1, double lado2, double lado3) {
		if (lado1 == lado2 && lado1 == lado3) {
			return "equilátero";
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "isósceles";
		} else {
			return "escaleno";
		}
	}

	/**
	 * Metodo que verifica se é um triangulo retangulo
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