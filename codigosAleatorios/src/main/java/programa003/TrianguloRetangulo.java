package programa003;

import java.util.Scanner;

public class TrianguloRetangulo {

	private static Scanner entrada;

	public static void main(String args[]) {
		int ladoA, ladoB, ladoC;
		int hipotenusa = 0, catetos = 0;
		entrada = new Scanner(System.in);

		do {
			System.out.println("Informe o lado A do triangulo: ");
			ladoA = entrada.nextInt();
		} while (ladoA <= 0);

		do {
			System.out.println("Informe o lado B do triangulo: ");
			ladoB = entrada.nextInt();
		} while (ladoB <= 0);

		do {
			System.out.println("Informe o lado C do triangulo: ");
			ladoC = entrada.nextInt();
		} while (ladoC <= 0);

		if (ladoA > ladoB && ladoA > ladoC) {
			// ladoA ï¿½ a hipotenusa
			hipotenusa = (ladoA * ladoA);
			catetos = (ladoB * ladoB) + (ladoC * ladoC);
		} else if (ladoB > ladoA && ladoB > ladoC) {
			// ladoB ï¿½ a hipotenusa
			hipotenusa = (ladoB * ladoB);
			catetos = (ladoA * ladoA) + (ladoC * ladoC);
		} else if (ladoC > ladoA && ladoC > ladoB) {
			// ladoC ï¿½ a hipotenusa
			hipotenusa = (ladoC * ladoC);
			catetos = (ladoA * ladoA) + (ladoB * ladoB);
		} else {
			hipotenusa = -1;
		}

		if ((hipotenusa) == catetos) {
			System.out.println("O triangulo é retangulo");
		} else {
			System.out.println("O triangulo não é retangulo");
		}
	}
}