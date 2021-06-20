package assistenciaTecnica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AssistenciaTecnica extends Chamado {

	List<Chamado> listChamado;
	Scanner entrada;
	Chamado c;

	public AssistenciaTecnica() {
		listChamado = new ArrayList<Chamado>();
		entrada = new Scanner(System.in);
	}

	public void AbrirChamado() {
		MenuTemporareo();
		int opcao = entrada.nextInt();

		if (opcao == 1) {
			for (int i = 0; i < 5; i++) {
				c = new Chamado();
				c.setNumChamado(i);
				c.setNomeCliente("Cliente 0" + (i + 1));
				c.setCpfCliente(i + "00" + i + "00" + i + "00" + i + "" + i);
				c.setDescricaoProblema("Problema 00" + i);
				c.setDataAbertura(dataAbertura());
				c.setSituacaoChamado("Aberto");
				c.setPrevisaoAtendimento(dataAtendimento());
				c.setCpfFuncionario("");
				c.setSolucaoProblema("");

				listChamado.add(c);
			}
		} else {

			c = new Chamado();
			int numChamado;
			String nomeCliente, cpfCliente, descricaoProblema;

			do {
				System.out.print("\nInforme o Nº do chamado: ");
				numChamado = entrada.nextInt();
				c.setNumChamado(numChamado);
			} while (verificaSeExiste(numChamado));

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

			c.setDataAbertura(dataAbertura());
			c.setSituacaoChamado("Aberto");
			c.setPrevisaoAtendimento(dataAtendimento());

			listChamado.add(c);
		}
	}

	public void AtenderChamado() {
		exibeTodosChamados();
		System.out.println("Informe o número do chamado que deseja atender: ");
		int atenderChamado = entrada.nextInt();
		for (int i = 0; i < listChamado.size(); i++) {
			if (listChamado.get(i).getNumChamado() == atenderChamado) {
				System.out.println("Informe o CPF do funcionário que atendeu o chamado: ");
				listChamado.get(i).setCpfFuncionario(entrada.next());
				System.out.println("Informe a solução para o problema: ");
				listChamado.get(i).setSolucaoProblema(entrada.next());
				listChamado.get(i).setSituacaoChamado("Encerrado");
				System.out.println("Chamado " + listChamado.get(i).getNumChamado() + " finalizado com sucesso");
				break;
			}
		}
	}

	public void CancelarChamado() {
		exibeTodosChamados();
		System.out.println("Informe o número do chamado que deseja cancelar: ");
		int cancelarChamado = entrada.nextInt();
		for (int i = 0; i < listChamado.size(); i++) {
			if (listChamado.get(i).getNumChamado() == cancelarChamado) {
				listChamado.get(i).setSituacaoChamado("Cancelado");
				System.out.println("Chamado " + listChamado.get(i).getNumChamado() + " cancelado com sucesso");
				break;
			}
		}
	}

	public void ConsultarChamado() {
		int cont = 1;
		for (Chamado chamado : listChamado) {
			if (chamado.getSituacaoChamado().equalsIgnoreCase("Aberto")) {
				System.out.println("Dados do Chamado :");
				System.out.println("\tNumero do Chamado: " + chamado.getNumChamado());
				System.out.println("\tNome do Cliente: " + chamado.getNomeCliente());
				System.out.println("\tCPF do Cliente: " + chamado.getCpfCliente());
				System.out.println("\tSituação do Chamado: " + chamado.getSituacaoChamado());
				System.out.println("\tData Abertura: " + chamado.getDataAbertura());
				System.out.println("\tPrevisão de atendimento: " + chamado.getPrevisaoAtendimento());
				cont++;
			}
		}
		System.out.println();
	}

	private void MenuTemporareo() {
		System.out.println("===========================");
		System.out.println(" Preencher automaticamente ");
		System.out.println("===========================");
		System.out.println("[0] NÃO.                   ");
		System.out.println("[1] SIM.                   ");
		System.out.println("===========================");
		System.out.println("Escolha a opção.           ");
	}

	private boolean verificaSeExiste(int numChamado) {
		for (Chamado chamado : listChamado) {
			if (chamado.getNumChamado() == numChamado) {
				return true;
			}
		}
		return false;
	}

	private void exibeTodosChamados() {
		int cont = 1;
		for (Chamado chamado : listChamado) {
			System.out.println("Dados do Chamado :");
			System.out.println("\tNumero do Chamado: " + chamado.getNumChamado());
			System.out.println("\tNome do Cliente: " + chamado.getNomeCliente());
			System.out.println("\tCPF do Cliente: " + chamado.getCpfCliente());
			System.out.println("\tSituação do Chamado: " + chamado.getSituacaoChamado());
			System.out.println("\tData Abertura: " + chamado.getDataAbertura());
			System.out.println("\tPrevisão de atendimento: " + chamado.getPrevisaoAtendimento());
			if (!chamado.getSituacaoChamado().equalsIgnoreCase("Aberto")) {
				System.out.println("\t" + chamado.getCpfFuncionario());
				if (!chamado.getSituacaoChamado().equalsIgnoreCase("Cancelado")) {
					System.out.println("\t" + chamado.getSolucaoProblema());
				}
			}
			cont++;
		}
		System.out.println();
	}

	private String dataAbertura() {
		Date dataAbertura = new Date();
		DateFormat formatterPT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataAberturaFormatada = formatterPT.format(dataAbertura);
		return dataAberturaFormatada;
	}

	private String dataAtendimento() {
		Date dt = new Date();
		// System.out.println("Today: " + dt);
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, 1);
		dt = c.getTime();
		// System.out.println("Tomorrow: " + dt);
		return dt.toString();
	}

}
