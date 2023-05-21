package programa002;

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
	 * Menu para solicitar se a geração dos chamados devem ser automatica
	 */
	private void menuInterno() {
		System.out.println("===========================");
		System.out.println(" Gerar Chamados Aleatorios ");
		System.out.println("===========================");
		System.out.println("[0] NAO.                   ");
		System.out.println("[1] SIM.                   ");
		System.out.println("===========================");
		System.out.print("Escolha a opcao: ");
	}

	/**
	 * Metodo que realiza a abertura de uma solicitação / chamado
	 */
	public void AbrirChamado() {
		menuInterno();
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
				// c.setCpfFuncionario("");
				// c.setSolucaoProblema("");

				listChamado.add(c);
			}
		} else {
			// Gerar chamados manualmente
			c = new Chamado();
			int numChamado;
			String nomeCliente, cpfCliente, descricaoProblema;

			do {
				System.out.print("\nInforme o Numero do chamado: ");
				numChamado = entrada.nextInt();
				c.setNumChamado(numChamado);
			} while (utilidade.verificaSeExiste(numChamado));

			do {
				System.out.print("\nInforme o Nome do cliente: ");
				nomeCliente = entrada.nextLine();
				c.setNomeCliente(nomeCliente);
			} while (nomeCliente.isBlank() || nomeCliente.isEmpty());

			do {
				System.out.print("\nInforme o cpf do cliente: ");
				cpfCliente = entrada.nextLine();
				c.setCpfCliente(cpfCliente);
			} while (cpfCliente.isBlank() || cpfCliente.isEmpty());// (cpfCliente.length() != 11);

			do {
				System.out.print("\nInforme a descricao do problema do chamado: ");
				descricaoProblema = entrada.nextLine();
				c.setDescricaoProblema(descricaoProblema);
			} while (descricaoProblema.isBlank() || descricaoProblema.isEmpty());

			c.setDataAbertura(utilidade.gerarDataNoMomentoAtual());
			c.setSituacaoChamado("Aberto");
			c.setPrevisaoAtendimento(utilidade.gerarDataPrevisao());

			listChamado.add(c);
		}
	}

	/**
	 * Metodo que realiza a alteração de informações do chamado depois que o mesmo
	 * foi atendido
	 */
	public void AtenderChamado() {
		// [-1 ] Chamado não existe
		int controleDeMensagem = -1;

		exibeTodosChamados();
		System.out.print("Informe o numero do chamado que deseja atender: ");
		int atenderChamado = entrada.nextInt();
		String cpfTecnico, descricao;

		for (int i = 0; i < listChamado.size(); i++) {
			if (listChamado.get(i).getNumChamado() == atenderChamado) {
				if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Aberto")) {
					do {
						System.out.print("Informe o CPF do funcionario que atendeu o chamado: ");
						cpfTecnico = entrada.next();
						listChamado.get(i).setCpfFuncionario(cpfTecnico + "");
					} while (cpfTecnico.isBlank() || cpfTecnico.isEmpty());

					do {
						System.out.print("Informe a solucao para o problema: ");
						descricao = entrada.nextLine();
						listChamado.get(i).setSolucaoProblema(descricao);
					} while (descricao.isEmpty() || descricao.isBlank());

					listChamado.get(i).setSituacaoChamado("Encerrado");

					System.out
							.println("Chamado " + atenderChamado + " encerrado pelo técnico cujo cpf é " + cpfTecnico);
					controleDeMensagem = 0;
					break;
				} else if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Encerrado")) {
					System.out.println("\tChamado ja havia sido encerrado.");
					controleDeMensagem = 0;
					break;
				} else if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Cancelado")) {
					System.out.println("\tChamado cancelado nao pode ser encerrado.");
					controleDeMensagem = 0;
					break;
				}
			}
		}

		if (controleDeMensagem == -1) {
			System.out.println("\tChamado não existe.");
		}
	}

	/**
	 * Metodo que faz o canclamento de uma chamado
	 */
	public void CancelarChamado() {
		// [-1 ] Chamado não existe
		int controleDeMensagem = -1;

		exibeTodosChamados();
		System.out.print("Informe o número do chamado que deseja cancelar: ");
		int cancelarChamado = entrada.nextInt();
		String cpf;

		for (int i = 0; i < listChamado.size(); i++) {
			if (listChamado.get(i).getNumChamado() == cancelarChamado) {
				if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Aberto")) {
					do {
						System.out.print("Informe o cpf do técnico para cancelar o chamado: ");
						cpf = entrada.next();
					} while (cpf.isEmpty() || cpf.isBlank());
					listChamado.get(i).setSituacaoChamado("Cancelado");
					listChamado.get(i).setCpfFuncionario(cpf);
					System.out.println(
							"Chamado " + cancelarChamado + " cancelado com sucesso pelo técnico cujo CPF é " + cpf);
					controleDeMensagem = 0;
					break;
				} else if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Encerrado")) {
					System.out.println("\tChamado Encerrado não pode ser cancelado.");
					controleDeMensagem = 0;
					break;
				} else if (listChamado.get(i).getSituacaoChamado().equalsIgnoreCase("Cancelado")) {
					System.out.println("\tChamado ja tinha sido cancelado.");
					controleDeMensagem = 0;
					break;
				}
			}
		}

		if (controleDeMensagem == -1) {
			System.out.println("\tChamado não existe.");
		}
	}

	/**
	 * Metodo que realiza a consulta dos chamados em aberto
	 */
	public void ConsultarChamado() {
		int qtd = 0;
		if (!listChamado.isEmpty()) {
			for (Chamado chamado : listChamado) {
				if (chamado.getSituacaoChamado().equalsIgnoreCase("Aberto")) {
					System.out.println("Dados do Chamado :");
					System.out.println("\tNumero do Chamado:       " + chamado.getNumChamado());
					System.out.println("\tNome do Cliente:         " + chamado.getNomeCliente());
					System.out.println("\tCPF do Cliente:          " + chamado.getCpfCliente());
					System.out.println("\tStatus do Chamado:       " + chamado.getSituacaoChamado());
					System.out.println("\tData Abertura:           " + chamado.getDataAbertura());
					System.out.println("\tPrevisão de Atendimento: " + chamado.getPrevisaoAtendimento());

					qtd++;
				}
			}
			System.out.println();
			System.out
					.println((qtd == 0 ? "Existe(m) " + listChamado.size() + " chamado(s). Nenhum com o status aberto!"
							: "Existe(m) " + listChamado.size() + " chamado(s) cadastrados!"));
		} else {
			System.out.println("Não existem chamados!");
		}
	}

	/**
	 * Metodo utilizado para exibir os chamados existentes
	 */
	private void exibeTodosChamados() {
		for (Chamado chamado : listChamado) {
			System.out.println("Dados do Chamado :");
			System.out.println("\tNumero do Chamado:       " + chamado.getNumChamado());
			// System.out.println("\tNome do Cliente: " + chamado.getNomeCliente());
			// System.out.println("\tCPF do Cliente: " + chamado.getCpfCliente());
			// System.out.println("\tData Abertura: " + chamado.getDataAbertura());
			// System.out.println("\tPrevisao de atendimento: " +
			System.out.println("\tSituacao do Chamado:     " + chamado.getSituacaoChamado());
		}
		System.out.println();
	}

	public void RelatorioChamado() {
		int chamadosAbertos = 0;
		int chamadosAtendidos = 0;
		int chamadosCancelados = 0;

		List<Chamado> list = new ArrayList<Chamado>();
		for (Chamado chamado : listChamado) {
			// identificar as situações e somar a quantidade
			if (chamado.getSituacaoChamado().equalsIgnoreCase("Aberto")) {
				chamadosAbertos++;
			} else if (chamado.getSituacaoChamado().equalsIgnoreCase("Encerrado")) {
				chamadosAtendidos++;
				list.add(chamado);
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
