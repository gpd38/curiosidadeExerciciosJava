package assistenciaTecnica;

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
		} while(cpfCliente.length() <= 0);// (cpfCliente.length() != 11);

		do {
			System.out.print("\nInforme a descrição do chamado: ");
			descricaoProblema = entrada.next();
			c.setDescricaoProblema(descricaoProblema);
		} while (descricaoProblema.length() < 3 && descricaoProblema != null);

		c.setDataAbertura();
		c.setSituacaoChamado("Aberto");
		Date previsaoAtendimento = new Date();
		c.setPrevisaoAtendimento(previsaoAtendimento);
		
		listChamado.add(c);
	}

	private boolean verificaSeExiste(int numChamado) {
		for (Chamado chamado : listChamado) {
			if(chamado.getNumChamado() == numChamado) {
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

}
