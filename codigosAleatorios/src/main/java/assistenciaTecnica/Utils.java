package assistenciaTecnica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {

	ThreadLocalRandom gerador;
	Random random;
	int quantidadeCaracteresMaxima = 15;
	int quantiadeCaracteresMinima = 3;
	List<Integer> listNumAleatorio;

	public Utils() {
		gerador = ThreadLocalRandom.current();
		random = new Random();
		listNumAleatorio = new ArrayList<Integer>();
	}

	/**
	 * Metodo que gera um número aleatorio com a quantidade de caracteres informada
	 * no parâmetro
	 * 
	 * @param tamanhoNumeroEmCaracteres
	 * @return
	 */
	public int getNumeroAleatorio(int tamanhoNumeroEmCaracteres) {

		String concatenarNumero = "";
		int numero;

		for (int i = 0; i < tamanhoNumeroEmCaracteres; i++) {
			numero = random.nextInt(9);
			concatenarNumero += numero;
		}

		if (verificaSeExiste(Integer.parseInt(concatenarNumero))) {
			getNumeroAleatorio(tamanhoNumeroEmCaracteres);
		} else {
			return (Integer.parseInt(concatenarNumero));
		}

		return -1;

	}

	/**
	 * Metodo que gea um numero aleatorio com a quantidade de caracteres informada
	 * no parâmetro.
	 * 
	 * @param tamanhoNumeroEmCaracteres
	 * @return
	 */

	public String gerarNomeAleatorio() {
		String nomeCompleto;
		char letra;

		int tamanhoNome = gerador.nextInt(quantiadeCaracteresMinima, quantidadeCaracteresMaxima);
		int tamanhoSobrenome = gerador.nextInt(quantiadeCaracteresMinima, quantidadeCaracteresMaxima);

		StringBuilder nome = new StringBuilder();
		StringBuilder sobreNome = new StringBuilder();

		for (int i = 1; i < tamanhoNome; i++) {
			letra = (char) gerador.nextInt(97, 122);
			nome.append(letra);
		}

		for (int i = 1; i < tamanhoSobrenome; i++) {
			letra = (char) gerador.nextInt(97, 122);
			sobreNome.append(letra);
		}

		nomeCompleto = nome + " " + sobreNome;

		return nomeCompleto;
	}

	/**
	 * Metodo que gera um cpf aleatório
	 * 
	 * @return
	 */

	public String gerarCPFAleatorio() {

		String cpf;

		int limitNum = 9;
		int n1 = random.nextInt(limitNum);
		int n2 = random.nextInt(limitNum);
		int n3 = random.nextInt(limitNum);
		int n4 = random.nextInt(limitNum);
		int n5 = random.nextInt(limitNum);
		int n6 = random.nextInt(limitNum);
		int n7 = random.nextInt(limitNum);
		int n8 = random.nextInt(limitNum);
		int n9 = random.nextInt(limitNum);

		int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

		d2 = 11 - (mod(d2, 11));

		if (d2 >= 10)
			d2 = 0;

		cpf = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

		return cpf;
	}

	/**
	 * Metodo que gera um CNPJ aleatório
	 * 
	 * @return
	 */

	public String gerarCNPJAleatorio() {

		String cnpj;

		int limitNum = 9;
		int n01 = random.nextInt(limitNum);
		int n02 = random.nextInt(limitNum);
		int n03 = random.nextInt(limitNum);
		int n04 = random.nextInt(limitNum);
		int n05 = random.nextInt(limitNum);
		int n06 = random.nextInt(limitNum);
		int n07 = random.nextInt(limitNum);
		int n08 = random.nextInt(limitNum);
		int n09 = 0;
		int n10 = 0;
		int n11 = 0;
		int n12 = 1;
		int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n09 * 5 + n08 * 6 + n07 * 7 + n06 * 8 + n05 * 9 + n04 * 2 + n03 * 3
				+ n02 * 4 + n01 * 5;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n09 * 6 + n08 * 7 + n07 * 8 + n06 * 9 + n05 * 2 + n04 * 3
				+ n03 * 4 + n02 * 5 + n01 * 6;

		d2 = 11 - (mod(d2, 11));

		if (d2 >= 10)
			d2 = 0;

		cnpj = "" + n01 + n02 + n03 + n04 + n05 + n06 + n07 + n08 + n09 + n10 + n11 + n12 + d1 + d2;

		return cnpj;
	}

	/**
	 * Metodo que gera uma string com uma quantidade de caracteres aleatório
	 * 
	 * @return
	 */

	public String gerarDescricaoAleatoria() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que retorna a data atual
	 * 
	 * @return
	 */
	public String gerarDataNoMomentoAtual() {
		Date dataAbertura = new Date();
		DateFormat formatterPT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataAberturaFormatada = formatterPT.format(dataAbertura);
		return dataAberturaFormatada;
	}

	/**
	 * Metodo que retorna uma data futura simulando uma previsão de tempo para
	 * resolver alguma coisa
	 * 
	 * @return
	 */
	public String gerarDataPrevisao() {
		Date dt = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, random.nextInt(7));
		dt = c.getTime();

		DateFormat formatterPT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataPrevisaoFormatada = formatterPT.format(dt);
		return dataPrevisaoFormatada;
	}

	/**
	 * Metodo que valida se o numeroAleatorio gerado, já foi utilizado pelo sistema.
	 * 
	 * @param numAleatorio
	 * @return
	 */
	public boolean verificaSeExiste(int numAleatorio) {
		for (Integer valor : listNumAleatorio) {
			if (valor == numAleatorio) {
				return true;
			}
		}
		listNumAleatorio.add(numAleatorio);
		return false;
	}

	private int mod(int dividendo, int divisor) {
		return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
	}

}
