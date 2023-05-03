package programa014;

public class ValidadorCPFCNPJ {

	/**
	 * Nesse exemplo, o método validaCPF recebe uma String contendo o CPF a ser
	 * validado e retorna um boolean indicando se o CPF é válido ou não. O código
	 * faz uso do algoritmo de validação de CPF utilizando o cálculo do dígito
	 * verificador. No método main, é possível ver um exemplo de como utilizar o
	 * método validaCPF.
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
	 * O código recebe como entrada uma String representando o CNPJ, e retorna true
	 * se o CNPJ é válido, ou false caso contrário.
	 * 
	 * Para validar o CNPJ, primeiro é removido todos os caracteres não-numéricos da
	 * String, para facilitar a validação. Em seguida, é calculado o primeiro dígito
	 * verificador usando o algoritmo de validação do CNPJ, e comparado com o dígito
	 * verificador informado. Se os dígitos verificadores não forem iguais, o CNPJ é
	 * considerado inválido. O processo é repetido para o segundo dígito
	 * verificador. Se ambos os dígitos verificadores estiverem corretos, o CNPJ é
	 * considerado válido.
	 */
	public static boolean validaCNPJ(String cnpj) {
		cnpj = cnpj.replaceAll("[^\\d]+", "");

		if (cnpj.length() != 14) {
			return false;
		}

		// Calcula o primeiro dígito verificador
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

		// Calcula o segundo dígito verificador
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
			System.out.println("O CNPJ " + cpfValido + " é válido!");
		} else {
			System.out.println("O CNPJ " + cpfValido + " é inválido!");
		}
		
		String cpfInvalido = "12345678910";
		if (validaCPF(cpfInvalido)) {
			System.out.println("O CNPJ " + cpfInvalido + " é válido!");
		} else {
			System.out.println("O CNPJ " + cpfInvalido + " é inválido!");
		}

		String cnpjValido = "12.345.678/0001-95"; // cnpj válido
		if (validaCNPJ(cnpjValido)) {
			System.out.println("O CNPJ " + cnpjValido + " é válido!");
		} else {
			System.out.println("O CNPJ " + cnpjValido + " é inválido!");
		}
		
		String cnpjInvalido = "11.111.111/1111-11"; // cnpj inválido
		if (validaCNPJ(cnpjInvalido)) {
			System.out.println("O CNPJ " + cnpjInvalido + " é válido!");
		} else {
			System.out.println("O CNPJ " + cnpjInvalido + " é inválido!");
		}
	}
}
