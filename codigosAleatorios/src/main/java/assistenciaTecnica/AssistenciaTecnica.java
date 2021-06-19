package assistenciaTecnica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
			int random;
			for (int i = 0; i < 10; i++) {
				c = new Chamado();
				do {
					random = (int) (Math.random() * 10000);
				} while (verificaSeExiste(random));
				c.setNumChamado(i);
				c.setNomeCliente("Nome" + (i + 1));
				c.setCpfCliente("" + i);
				c.setDescricaoProblema("descricao" + i);
				c.setDataAbertura(dataAbertura());
				c.setSituacaoChamado("Aberto");
				c.setPrevisaoAtendimento(c.getPrevisaoAtendimento());

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
			Date previsaoAtendimento = new Date();
			c.setPrevisaoAtendimento(previsaoAtendimento);

			listChamado.add(c);
		}
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

	public void AtenderChamado() {

	}

	public void CancelarChamado() {

	}

	public void ConsultarChamado() {
		for (Chamado chamado : listChamado) {
			System.out.println(chamado.getNumChamado());
			System.out.println(chamado.getNomeCliente());
			System.out.println(chamado.getCpfCliente());
			System.out.println(chamado.getSituacaoChamado());
			System.out.println(chamado.getDataAbertura());
			System.out.println(chamado.getPrevisaoAtendimento());
		}
	}

	private String dataAbertura() {
		Date dataAbertura = new Date();
		DateFormat formatterPT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataAberturaFormatada = formatterPT.format(dataAbertura);
		return dataAberturaFormatada;
	}

}
