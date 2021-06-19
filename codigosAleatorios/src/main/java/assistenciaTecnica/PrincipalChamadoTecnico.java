package assistenciaTecnica;

import java.util.Date;
import java.util.Scanner;

public class PrincipalChamadoTecnico {

	static Scanner entrada;
	static int operacao;
	static AssistenciaTecnica assTecnica;
	
	public static void main(String[] args) {
		
		Date data = new Date();
		
		System.out.println(data);
		System.out.println(data.getDate()+"/"+data.getMonth()+"/"+data.getDay() );
	}

	public static void maina(String[] args) {

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
				System.out.println("Abrir chamado.");
				assTecnica.AbrirChamado();
			}
				break;
			case 2: {
				System.out.println("Atender chamado.");
				assTecnica.AtenderChamado();
			}
				break;
			case 3: {
				System.out.println("Cancelar chamado.");
				assTecnica.CancelarChamado();
			}
				break;
			case 4: {
				System.out.println("Consultar chamado.");
				assTecnica.ConsultarChamado();
			}
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} while (operacao != 0);

	}

	private static void MenuInicial() {

		System.out.println("=========================");
		System.out.println("   Assistência Técnica   ");
		System.out.println("=========================");
		System.out.println("[0] Finalizar.           ");
		System.out.println("[1] Abrir Chamado.       ");
		System.out.println("[2] Atender Chamado.     ");
		System.out.println("[3] Cancelar Chamado.    ");
		System.out.println("[4] Consultar Chamado.   ");
		System.out.println("=========================");
		System.out.println("Escolha a operação");

	}

}
