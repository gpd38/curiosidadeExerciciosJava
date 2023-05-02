package programa011;

import java.util.Scanner;

public class OperacoesComMatriz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0 || opcao > 32) {
			System.out.println("Escolha uma das opcoes abaixo:");
			System.out.println("00. Sair    ");
			System.out.println("01. Opcao 01");
			System.out.println("02. Opcao 02");
			System.out.println("03. Opcao 03");
			System.out.println("04. Opcao 04");
			System.out.println("05. Opcao 05");
			System.out.println("06. Opcao 06");
			System.out.println("07. Opcao 07");
			System.out.println("08. Opcao 08");
			System.out.println("09. Opcao 09");
			System.out.println("10. Opcao 10");
			System.out.println("11. Opcao 11");
			System.out.println("12. Opcao 12");
			System.out.println("13. Opcao 13");
			System.out.println("14. Opcao 14");
			System.out.println("15. Opcao 15");
			System.out.println("16. Opcao 16");
			System.out.println("17. Opcao 17");
			System.out.println("18. Opcao 18");
			System.out.println("19. Opcao 19");
			System.out.println("20. Opcao 20");
			System.out.println("21. Opcao 21");
			System.out.println("22. Opcao 22");
			System.out.println("23. Opcao 23");
			System.out.println("24. Opcao 24");
			System.out.println("25. Opcao 25");
			System.out.println("26. Opcao 26");
			System.out.println("27. Opcao 27");
			System.out.println("28. Opcao 28");
			System.out.println("29. Opcao 29");
			System.out.println("30. Opcao 30");
			System.out.println("31. Opcao 31");
			System.out.println("32. Opcao 32");
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
				// Realizar a��o da op��o 1
				break;
			case 2:
				// Realizar a��o da op��o 2
				break;
			case 3:
				// Realizar a��o da op��o 3
				break;
			case 4:
				// Realizar a��o da op��o 4
				break;
			case 5:
				// Realizar a��o da op��o 5
				break;
			case 6:
				// Realizar a��o da op��o 6
				break;
			case 7:
				// Realizar a��o da op��o 7
				break;
			case 8:
				// Realizar a��o da op��o 8
				break;
			case 9:
				// Realizar a��o da op��o 9
				break;
			case 10:
				// Realizar a��o da op��o 10
				break;
			case 11:
				// Realizar a��o da op��o 11
				break;
			case 12:
				// Realizar a��o da op��o 12
				break;
			case 13:
				// Realizar a��o da op��o 13
				break;
			case 14:
				// Realizar a��o da op��o 14
				break;
			case 15:
				// Realizar a��o da op��o 15
				break;
			case 16:
				// Realizar a��o da op��o 16
				break;
			case 17:
				// Realizar a��o da op��o 17
				break;
			case 18:
				// Realizar a��o da op��o 18
				break;
			case 19:
				// Realizar a��o da op��o 19
				break;
			case 20:
				// Realizar a��o da op��o 20
				break;
			case 21:
				// Realizar a��o da op��o 21
				break;
			case 22:
				// Realizar a��o da op��o 22
				break;
			case 23:
				// Realizar a��o da op��o 23
				break;
			case 24:
				// Realizar a��o da op��o 24
				break;
			case 25:
				// Realizar a��o da op��o 25
				break;
			case 26:
				// Realizar a��o da op��o 26
				break;
			case 27:
				// Realizar a��o da op��o 27
				break;
			case 28:
				// Realizar a��o da op��o 28
				break;
			case 29:
				// Realizar a��o da op��o 29
				break;
			case 30:
				// Realizar a��o da op��o 30
				break;
			case 31:
				// Realizar a��o da op��o 31
				break;
			case 32:
				// Realizar a��o da op��o 32
				break;
			case 33:
				// Realizar a��o da op��o 33
				break;
			case 34:
				// Realizar a��o da op��o 34
				break;
			default:
				System.out.println("Digitou um valor invalido.\nPrograma sendo finalizado!");
				System.exit(0);
				break;
			}
		}
	}
}
