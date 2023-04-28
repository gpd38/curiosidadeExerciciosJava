package programa012;

public class Atendimento {
	String[] fila = new String[10];
	int posicao = 0;

	// Metodo que atende os pacientes, ou seja, remove da fila
	public void atender() {
		// Criar uma condição validar se tem paciente para ser atendido
		if (posicao <= 0) {
			System.out.println("Não existe mais pacientes para atender.");
		} else {
			System.out.println("Atendendo paciente " + fila[0]);
			// Organizar a fila após atendimento
			for (int i = 0; i < fila.length - 1; i++) {
				fila[i] = fila[i + 1];
			}
			posicao--;
		}
	}

	// Metodo que informa que chegou um novo paciente, ou seja, insere na fila
	public void chegar(String nome) {
		// Criar uma condição para parar de inserir quando a fila estiver cheia
		if (posicao == fila.length) {
			System.out.println("Não estamos mais atendendo, pois a agenda está lotada.");
		} else {
			fila[posicao] = nome;
			posicao++;
			System.out.println("O cliente " + nome + " acabou de chegar.");
		}
	}

	// Metodo que mostra a fila de pacientes
	public void imprimir() {
		System.out.println("------------------");
		System.out.println("Fila de pacientes:");
		if (posicao <= 0) {
			System.out.println("Não existe mais pacientes para atender.");
		} else {
			System.out.println("Falta atender o(s) seguinte(s) paciente(s): ");
			for (int i = 0; i < posicao; i++) {
				System.out.println("\t- " + fila[i]);
			}
		}
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		// Criando a fila de pacientes
		Atendimento teste = new Atendimento();

		// Adicionando e atendendo a fila de paciente
		teste.chegar("Gleibson Pancho");// inserindo
		teste.chegar("Rodrigo Vieira");// inserindo
		teste.chegar("Amarildo Santos");// inserindo
		teste.chegar("Breno Ramos");// inserindo
		teste.imprimir();// mostrar andamento da fila
		teste.chegar("Carlos Eduardo");// inserindo
		teste.chegar("Daniel Silva");// inserindo
		teste.chegar("Emanuela Dantas");// inserindo
		teste.chegar("Fátima Bernardes");// inserindo
		teste.chegar("Gabriela Souza");// inserindo
		teste.imprimir();// mostrar andamento da fila
		teste.atender();// removendo
		teste.atender();// removendo
		teste.atender();// removendo
		teste.atender();// removendo
		teste.imprimir();// mostrar andamento da fila
		teste.atender();// removendo
		teste.atender();// removendo
		teste.atender();// removendo
		teste.atender();// removendo
		teste.atender();// removendo
		teste.atender();// removendo
		teste.chegar("Renato Oliveira");// inserindo
		teste.imprimir();// mostrar andamento da fila
		teste.chegar("Mateus Andrade");// inserindo
		teste.atender();// removendo
		teste.imprimir();// mostrar andamento da fila
		teste.atender();// removendo
		teste.imprimir();// mostrar andamento da fila
	}
}