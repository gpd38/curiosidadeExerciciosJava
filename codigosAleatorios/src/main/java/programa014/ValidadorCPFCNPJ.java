package programa014;

public class ValidadorCPFCNPJ {

	/**
	 * Nesse exemplo, o m�todo validaCPF recebe uma String contendo o CPF a ser
	 * validado e retorna um boolean indicando se o CPF � v�lido ou n�o. O c�digo
	 * faz uso do algoritmo de valida��o de CPF utilizando o c�lculo do d�gito
	 * verificador. No m�todo main, � poss�vel ver um exemplo de como utilizar o
	 * m�todo validaCPF.
	 */
	public static boolean validaCPF(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			return false;
		}
		int soma = 0;
		int resto;
		for (int i = 0; i < 9; i++) {
			soma += Integer.parseInt(cpf.substring(i, i + 1)) * (10 - i);
		}
		resto = 11 - soma % 11;
		if (resto == 10 || resto == 11) {
			resto = 0;
		}
		if (resto != Integer.parseInt(cpf.substring(9, 10))) {
			return false;
		}
		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i);
		}
		resto = 11 - soma % 11;
		if (resto == 10 || resto == 11) {
			resto = 0;
		}
		if (resto != Integer.parseInt(cpf.substring(10, 11))) {
			return false;
		}
		return true;
	}

	/**
	 * O c�digo recebe como entrada uma String representando o CNPJ, e retorna true
	 * se o CNPJ � v�lido, ou false caso contr�rio.
	 * 
	 * Para validar o CNPJ, primeiro � removido todos os caracteres n�o-num�ricos da
	 * String, para facilitar a valida��o. Em seguida, � calculado o primeiro d�gito
	 * verificador usando o algoritmo de valida��o do CNPJ, e comparado com o d�gito
	 * verificador informado. Se os d�gitos verificadores n�o forem iguais, o CNPJ �
	 * considerado inv�lido. O processo � repetido para o segundo d�gito
	 * verificador. Se ambos os d�gitos verificadores estiverem corretos, o CNPJ �
	 * considerado v�lido.
	 */
	public static boolean validaCNPJ(String cnpj) {
		cnpj = cnpj.replaceAll("[^\\d]+", "");

		if (cnpj.length() != 14) {
			return false;
		}

		// Calcula o primeiro d�gito verificador
		int soma = 0;
		int peso = 5;
		for (int i = 0; i < 12; i++) {
			soma += (cnpj.charAt(i) - '0') * peso;
			peso = (peso == 2) ? 9 : peso - 1;
		}
		int resto = (soma % 11 == 0 || soma % 11 == 1) ? 0 : 11 - (soma % 11);
		if (resto != (cnpj.charAt(12) - '0')) {
			return false;
		}

		// Calcula o segundo d�gito verificador
		soma = 0;
		peso = 6;
		for (int i = 0; i < 13; i++) {
			soma += (cnpj.charAt(i) - '0') * peso;
			peso = (peso == 2) ? 9 : peso - 1;
		}
		resto = (soma % 11 == 0 || soma % 11 == 1) ? 0 : 11 - (soma % 11);
		if (resto != (cnpj.charAt(13) - '0')) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String cpfValido = "12345678909";
		if (validaCPF(cpfValido)) {
			System.out.println("O CNPJ " + cpfValido + " � v�lido!");
		} else {
			System.out.println("O CNPJ " + cpfValido + " � inv�lido!");
		}
		
		String cpfInvalido = "12345678910";
		if (validaCPF(cpfInvalido)) {
			System.out.println("O CNPJ " + cpfInvalido + " � v�lido!");
		} else {
			System.out.println("O CNPJ " + cpfInvalido + " � inv�lido!");
		}

		String cnpjValido = "12.345.678/0001-95"; // cnpj v�lido
		if (validaCNPJ(cnpjValido)) {
			System.out.println("O CNPJ " + cnpjValido + " � v�lido!");
		} else {
			System.out.println("O CNPJ " + cnpjValido + " � inv�lido!");
		}
		
		String cnpjInvalido = "11.111.111/1111-11"; // cnpj inv�lido
		if (validaCNPJ(cnpjInvalido)) {
			System.out.println("O CNPJ " + cnpjInvalido + " � v�lido!");
		} else {
			System.out.println("O CNPJ " + cnpjInvalido + " � inv�lido!");
		}
	}
}
