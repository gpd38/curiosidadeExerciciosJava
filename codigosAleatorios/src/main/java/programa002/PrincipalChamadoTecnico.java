package programa002;

import java.util.Scanner;

public class PrincipalChamadoTecnico {

	static Scanner entrada;
	static int operacao;
	static AssistenciaTecnica assTecnica;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		assTecnica = new AssistenciaTecnica();

		do {
			MenuInicial();
			operacao = entrada.nextInt();

			switch (operacao) {
			case 0: {
				System.out.println("Sistema sendo finalizado com sucesso!");
				System.exit(0);
			}
				break;
			case 1: {
				// System.out.println("Abrir chamado.");
				assTecnica.AbrirChamado();
			}
				break;
			case 2: {
				// System.out.println("Atender chamado.");
				assTecnica.AtenderChamado();
			}
				break;
			case 3: {
				// System.out.println("Cancelar chamado.");
				assTecnica.CancelarChamado();
			}
				break;
			case 4: {
				// System.out.println("Consultar chamado.");
				assTecnica.ConsultarChamado();
			}
				break;
			case 5: {
				// System.out.println("Relat�rio chamado.");
				assTecnica.RelatorioChamado();
			}
				break;
			default:
				System.out.println("Opera��o Inv�lida!");
				break;
			}
		} while (operacao != 0 || operacao > 5);

	}

	private static void MenuInicial() {

		System.out.println("=========================");
		System.out.println("   Assit�ncia T�cnica    ");
		System.out.println("=========================");
		System.out.println("[0] Finalizar.           ");
		System.out.println("[1] Abrir Chamado.       ");
		System.out.println("[2] Atender Chamado.     ");
		System.out.println("[3] Cancelar Chamado.    ");
		System.out.println("[4] Consultar Chamado.   ");
		System.out.println("[5] Relat�rio Chamado.   ");
		System.out.println("=========================");
		System.out.print("Escolha a opera��o: ");

	}

}
