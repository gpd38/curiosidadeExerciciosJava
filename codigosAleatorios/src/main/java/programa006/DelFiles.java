package programa006;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class DelFiles {

	public static void main(String[] args) {

		String caminho = "..\\codigosAleatorios\\src\\main\\java\\programa006\\arquivos";

		exibeArquivos(caminho);
		deletarArquivos(0, caminho);
	}

	public static void deletarArquivos(int qtdDias, String path) {
		Date data = new Date();
		Calendar c = Calendar.getInstance();// obtendo a instancia do Calender
		c.setTime(data);//// setando a data atual
		c.add(Calendar.DATE, -qtdDias);// removendo a quantidade de dias
		data = c.getTime();// obtendo a data alterada

		File arquivos = new File(path);// instanciando o caminho dos arquivos
		String[] nomes = arquivos.list();
		for (String nome : nomes) {
			File temp = new File(arquivos.getPath(), nome);
			Date arquivo = new Date(temp.lastModified());
			if (arquivo.before(data)) {
				temp.delete();
			}
		}
	}

	public static void exibeArquivos(String path) {
		File arquivos = new File(path);// instanciando o caminho dos arquivos
		String[] nomes = arquivos.list();
		for (String nome : nomes) {
			File temp = new File(arquivos.getPath(), nome);
			System.out.println("Arquivo: " + temp);
		}
	}

}
