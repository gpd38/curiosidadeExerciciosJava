package programa013;

public class CadasturValidator {

	public static boolean isValid(String cadasturNumber) {

		// Verificar se o número tem 10 dígitos
		if (cadasturNumber.length() != 10) {
			return false;
		}

		// Extrair os dígitos do número
		int[] digits = new int[10];
		for (int i = 0; i < 10; i++) {
			char c = cadasturNumber.charAt(i);
			if (Character.isDigit(c)) {
				digits[i] = Character.getNumericValue(c);
			} else {
				return false;
			}
		}

		// Aplicar o algoritmo de validação
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += digits[i] * (i + 2);
		}
		int remainder = sum % 11;
		int checkDigit = remainder < 2 ? 0 : 11 - remainder;

		// Verificar se o dígito verificador está correto
		return checkDigit == digits[9];
	}

}
