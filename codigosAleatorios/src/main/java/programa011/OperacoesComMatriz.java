package programa011;

import java.util.Scanner;

public class OperacoesComMatriz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0 || opcao > 34) {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("00. Sair    ");
			System.out.println("01. Opção 01");
			System.out.println("02. Opção 02");
			System.out.println("03. Opção 03");
			System.out.println("04. Opção 04");
			System.out.println("05. Opção 05");
			System.out.println("06. Opção 06");
			System.out.println("07. Opção 07");
			System.out.println("08. Opção 08");
			System.out.println("09. Opção 09");
			System.out.println("10. Opção 10");
			System.out.println("11. Opção 11");
			System.out.println("12. Opção 12");
			System.out.println("13. Opção 13");
			System.out.println("14. Opção 14");
			System.out.println("15. Opção 15");
			System.out.println("16. Opção 16");
			System.out.println("17. Opção 17");
			System.out.println("18. Opção 18");
			System.out.println("19. Opção 19");
			System.out.println("20. Opção 20");
			System.out.println("21. Opção 21");
			System.out.println("22. Opção 22");
			System.out.println("23. Opção 23");
			System.out.println("24. Opção 24");
			System.out.println("25. Opção 25");
			System.out.println("26. Opção 26");
			System.out.println("27. Opção 27");
			System.out.println("28. Opção 28");
			System.out.println("29. Opção 29");
			System.out.println("30. Opção 30");
			System.out.println("31. Opção 31");
			System.out.println("32. Opção 32");
			System.out.println("33. Opção 33");
			System.out.println("34. Opção 34");
			System.out.print("Opção escolhida: ");

			try {
				opcao = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Opção inválida! Digite um número entre 1 e 35.");
				scanner.nextLine();
				continue;
			}

			switch (opcao) {
			case 0:
				System.out.println("Finalizando programa!");
				System.exit(0);
				break;
			case 1:
				// Realizar ação da opção 1
				break;
			case 2:
				// Realizar ação da opção 2
				break;
			case 3:
				// Realizar ação da opção 3
				break;
			case 4:
				// Realizar ação da opção 4
				break;
			case 5:
				// Realizar ação da opção 5
				break;
			case 6:
				// Realizar ação da opção 6
				break;
			case 7:
				// Realizar ação da opção 7
				break;
			case 8:
				// Realizar ação da opção 8
				break;
			case 9:
				// Realizar ação da opção 9
				break;
			case 10:
				// Realizar ação da opção 10
				break;
			case 11:
				// Realizar ação da opção 11
				break;
			case 12:
				// Realizar ação da opção 12
				break;
			case 13:
				// Realizar ação da opção 13
				break;
			case 14:
				// Realizar ação da opção 14
				break;
			case 15:
				// Realizar ação da opção 15
				break;
			case 16:
				// Realizar ação da opção 16
				break;
			case 17:
				// Realizar ação da opção 17
				break;
			case 18:
				// Realizar ação da opção 18
				break;
			case 19:
				// Realizar ação da opção 19
				break;
			case 20:
				// Realizar ação da opção 20
				break;
			case 21:
				// Realizar ação da opção 21
				break;
			case 22:
				// Realizar ação da opção 22
				break;
			case 23:
				// Realizar ação da opção 23
				break;
			case 24:
				// Realizar ação da opção 24
				break;
			case 25:
				// Realizar ação da opção 25
				break;
			case 26:
				// Realizar ação da opção 26
				break;
			case 27:
				// Realizar ação da opção 27
				break;
			case 28:
				// Realizar ação da opção 28
				break;
			case 29:
				// Realizar ação da opção 29
				break;
			case 30:
				// Realizar ação da opção 30
				break;
			case 31:
				// Realizar ação da opção 31
				break;
			case 32:
				// Realizar ação da opção 32
				break;
			case 33:
				// Realizar ação da opção 33
				break;
			case 34:
				// Realizar ação da opção 34
				break;
			default:
				System.out.println("Digitou um valor inválido.\nPrograma sendo finalizado!");
				System.exit(0);
				break;
			}
		}
	}
}
