package assistenciaTecnica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssistenciaTecnica extends Chamado {

	List<Chamado> listChamado;
	Scanner entrada;
	Chamado c;
	Utils utilidade;

	public AssistenciaTecnica() {
		listChamado = new ArrayList<Chamado>();
		entrada = new Scanner(System.in);
		utilidade = new Utils();
	}

	/**
	 * Metodo que realiza a abertura de uma solicitação / chamado
	 */
	public void AbrirChamado() {
		MenuTemporareo();
		int opcao = entrada.nextInt();

		// Gerar chamados automáticos
		if (opcao == 1) {
			for (int i = 0; i < 5; i++) {
				c = new Chamado();
				c.setNumChamado(utilidade.getNumeroAleatorio(5));
				c.setNomeCliente(utilidade.gerarNomeAleatorio());
				c.setCpfCliente(utilidade.gerarCPFAleatorio());
				c.setDescricaoProblema(utilidade.gerarDescricaoAleatoria());
				c.setDataAbertura(utilidade.gerarDataNoMomentoAtual());
				c.setSituacaoChamado("Aberto");
				c.setPrevisaoAtendimento(utilidade.gerarDataPrevisao());
				c.setCpfFuncionario("");
				c.setSolucaoProblema("");

				listChamado.add(c);
			}
		} else {
			// Gerar chamados manualmente
			c = new Chamado();
			int numChamado;
			String nomeCliente, cpfCliente, descricaoProblema;

			do {
				System.out.print("\nInforme o Nº do chamado: ");
				numChamado = entrada.nextInt();
				c.setNumChamado(numChamado);
			} while (utilidade.verificaSeExiste(numChamado));

			do {
				System.out.print("\nInforme o Nome do cliente: ");
				nomeCliente = entrada.next();
				c.setNomeCliente(nomeCliente);
			} while (nomeCliente.length() <= 0);

			do {
				System.out.print("\nInforme o cpf do cliente: ");
				cpfCliente = entrada.next();
				c.setCpfCliente(cpfCliente);
			} while (cpfCliente.length() <= 0);// (cpfCliente.length() != 11);

			do {
				System.out.print("\nInforme a descrição do chamado: ");
				descricaoProblema = entrada.next();
				c.setDescricaoProblema(descricaoProblema);
			} while (descricaoProblema.length() < 3 && descricaoProblema != null);

			c.setDataAbertura(utilidade.gerarDataNoMomentoAtual());
			c.setSituacaoChamado("Aberto");
			c.setPrevisaoAtendimento(utilidade.gerarDataPrevisao());

			listChamado.add(c);
		}
	}

	/**
	 * Metodo que realiza a alteração de informações do chamado depois que o mesmo é
	 * atendido
	 */
	public void AtenderChamado() {
		// [-3 ] Chamado Cancelado
		// [-2 ] Chamado Encerrado
		// [-1 ] Chamado não existe
		// [ 0 ] Chamado existe e será alterado
		int controleDeMensagem = -1;

		exibeTodosChamados();
		System.out.print("Informe o número do chamado que deseja atender: ");
		int atenderChamado = entrada.nextInt();

		for (int i = 0; i < listChamado.size(); i++) {
			if (listChamado.get(i).getNumChamado() == atenderChamado) {
				if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Aberto")) {
					System.out.print("Informe o CPF do funcionário que atendeu o chamado: ");
					listChamado.get(i).setCpfFuncionario(entrada.next());
					System.out.print("Informe a solução para o problema: ");
					listChamado.get(i).setSolucaoProblema(entrada.next());
					listChamado.get(i).setSituacaoChamado("Encerrado");
					controleDeMensagem = 0;
					break;
				} else if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Encerrado")) {
					controleDeMensagem = -2;
					break;
				} else if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Cancelado")) {
					controleDeMensagem = -3;
					break;
				}
			}
		}
		if (controleDeMensagem == 0) {
			System.out.println("Chamado " + atenderChamado + " encerrado com sucesso");
		} else if (controleDeMensagem == -1) {
			System.out.println("\tChamado não existe.");
		} else if (controleDeMensagem == -2) {
			System.out.println("\tChamado já foi encerrado.");
		} else {
			System.out.println("\tChamado encerrado não pode ser cancelado.");
		}
	}

	/**
	 * Metodo que faz o canclamento de uma chamado
	 */
	public void CancelarChamado() {
		// [-3 ] Chamado Cancelado
		// [-2 ] Chamado Encerrado
		// [-1 ] Chamado não existe
		// [ 0 ] Chamado existe e será alterado
		int controleDeMensagem = -1;

		exibeTodosChamados();
		System.out.print("Informe o número do chamado que deseja cancelar: ");
		int cancelarChamado = entrada.nextInt();

		for (int i = 0; i < listChamado.size(); i++) {
			if (listChamado.get(i).getNumChamado() == cancelarChamado) {
				if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Aberto")) {
					listChamado.get(i).setSituacaoChamado("Cancelado");
					controleDeMensagem = 0;
					break;
				} else if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Encerrado")) {
					controleDeMensagem = -2;
					break;
				} else if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Cancelado")) {
					controleDeMensagem = -3;
					break;
				}
			}
		}

		if (controleDeMensagem == 0) {
			System.out.println("Chamado " + cancelarChamado + " cancelado com sucesso");
		} else if (controleDeMensagem == -1) {
			System.out.println("\tChamado não existe.");
		} else if (controleDeMensagem == -2) {
			System.out.println("\tChamado Encerrado não pode ser cancelado.");
		} else {
			System.out.println("\tChamado já foi cancelado.");
		}
	}

	/**
	 * Metodo que realiza a consulta dos chamados em aberto
	 */
	public void ConsultarChamado() {
		for (Chamado chamado : listChamado) {
			if (chamado.getSituacaoChamado().equalsIgnoreCase("Aberto")) {
				System.out.println("Dados do Chamado :");
				System.out.println("\tNumero do Chamado:       " + chamado.getNumChamado());
				System.out.println("\tNome do Cliente:         " + chamado.getNomeCliente());
				System.out.println("\tCPF do Cliente:          " + chamado.getCpfCliente());
				System.out.println("\tStatus do Chamado:       " + chamado.getSituacaoChamado());
				System.out.println("\tData Abertura:           " + chamado.getDataAbertura());
				System.out.println("\tPrevisão de Atendimento: " + chamado.getPrevisaoAtendimento());
			}
		}
		System.out.println();
	}

	/**
	 * Menu para solicitar se a geração dos chamados devem ser automatica
	 */
	private void MenuTemporareo() {
		System.out.println("===========================");
		System.out.println(" Gerar Chamados Aleatórios ");
		System.out.println("===========================");
		System.out.println("[0] NÃO.                   ");
		System.out.println("[1] SIM.                   ");
		System.out.println("===========================");
		System.out.print("Escolha a opção: ");
	}

	/**
	 * Metodo utilizado para exibir os chamados existentes
	 */
	private void exibeTodosChamados() {
		for (Chamado chamado : listChamado) {
			System.out.println("Dados do Chamado :");
			System.out.println("\tNumero do Chamado:       " + chamado.getNumChamado());
			System.out.println("\tNome do Cliente:         " + chamado.getNomeCliente());
			System.out.println("\tCPF do Cliente:          " + chamado.getCpfCliente());
			System.out.println("\tSituação do Chamado:     " + chamado.getSituacaoChamado());
			System.out.println("\tData Abertura:           " + chamado.getDataAbertura());
			System.out.println("\tPrevisão de atendimento: " + chamado.getPrevisaoAtendimento());

			/**
			 * if que trata as informações dos chamados ENCERRADOS e CANCELADOS que estão
			 * como null
			 */
			if (!chamado.getSituacaoChamado().equalsIgnoreCase("Aberto")
					&& !chamado.getSituacaoChamado().equalsIgnoreCase("Cancelado")) {
				System.out.println("\tCPF do Funcionario:      " + chamado.getCpfFuncionario());
				if (!chamado.getSituacaoChamado().equalsIgnoreCase("Cancelado")) {
					System.out.println("\tSoluçao do Chamado:      " + chamado.getSolucaoProblema());
				}
			}
		}
		System.out.println();
	}

	public void RelatorioChamado() {
		int chamadosAbertos = 0;
		int chamadosAtendidos = 0;
		int chamadosCancelados = 0;

		for (Chamado chamado : listChamado) {
			//identificar as situações e somar a quantidade
			if (chamado.getSituacaoChamado().equalsIgnoreCase("Aberto")) {
				chamadosAbertos++;
			} else if (chamado.getSituacaoChamado().equalsIgnoreCase("Encerrado")) {
				chamadosAtendidos++;
			} else {
				chamadosCancelados++;
			}
		}

		System.out.println("=========================");
		System.out.println("  Relatório de Chamados  ");
		System.out.println("=========================");
		System.out.println("Abertos:    " + chamadosAbertos);
		System.out.println("Encerrados: " + chamadosAtendidos);
		System.out.println("Cancelados: " + chamadosCancelados);
	}

}
