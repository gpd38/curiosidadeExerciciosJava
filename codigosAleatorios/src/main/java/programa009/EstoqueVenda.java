package programa009;

import java.util.Scanner;

public class EstoqueVenda {

	public static void main(String[] args) {
		
		// Menu de opções que o usuário escolhe qual deseja executar
		int opcao;

		System.out.println("[1] Cadastrar Vendedor.");
		System.out.println("[2] Cadastrar Produtos.");
		System.out.println("[3] Realizar Venda.");
		System.out.println("[4] Relatorio.");

		Scanner scanner = new Scanner(System.in);
		opcao = scanner.nextInt();

		do {
			switch (opcao) {
			case 1:
				cadastrarVendedor();
				break;
			case 2:
				cadastrarProduto();
				break;
			case 3:
				vender();
				break;
			case 4:
				relatorio();
				break;
			default:
				System.out.println("Opcao Inválida.");
			}
		} while (opcao < 1 || opcao > 4);
	}

	public static void cadastrarVendedor() {
		int qtdVendedores = 5;
		int tamNome = 15;
		String[] vetNome = new String[qtdVendedores];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < qtdVendedores; i++) {
			System.out.print("Digite o nome do vendedor: ");
			vetNome[i] = scanner.next();
		}

		// Exibir os nomes dos vendedores cadastrados
		System.out.println("Vendedores cadastrados:");
		for (int i = 0; i < qtdVendedores; i++) {
			System.out.println(vetNome[i]);
		}
	}

	public static void cadastrarProduto() {
		// Implemente a lógica de cadastro de produtos aqui
	}

	public static void vender() {
		// Implemente a lógica de venda aqui
	}

	public static void relatorio() {
		// Implemente a geração de relatório aqui
	}

}
