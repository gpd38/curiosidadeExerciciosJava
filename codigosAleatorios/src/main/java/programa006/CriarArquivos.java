package programa006;
import java.io.File;
import java.io.IOException;

public class CriarArquivos {

    public static void main(String[] args) {
    	// Solicitar o nome da pasta ao usuário
        String nomePasta = lerNomePastaDoUsuario();

        // Criar a pasta com o nome fornecido pelo usuário
        criarPasta(nomePasta);

        // Criar arquivos dentro da pasta com várias extensões
        criarArquivos(nomePasta);
    }

    private static String lerNomePastaDoUsuario() {
        // Lógica para ler o nome da pasta do usuário, por exemplo, através do Scanner
        // Neste exemplo, vamos considerar que o nome da pasta é "arquivos"
        return "..\\codigosAleatorios\\src\\main\\java\\programa006\\arquivos";
    }

    private static void criarPasta(String nomePasta) {
     // Verificar se a pasta já existe
        File pasta = new File(nomePasta);
        if (pasta.exists()) {
            System.out.println("A pasta já existe!");
        } else {
            // Criar a pasta
            if (pasta.mkdir()) {
                System.out.println("Pasta criada com sucesso!");
            } else {
                System.out.println("Falha ao criar a pasta!");
            }
        }
    }

    private static void criarArquivos(String nomePasta) {
        File pasta = new File(nomePasta);

        // Criar arquivos com diferentes extensões dentro da pasta
        try {
            // Criar arquivo de texto
            File arquivoTexto = new File(pasta, "arquivo.txt");
            arquivoTexto.createNewFile();

            // Criar arquivo CSV
            File arquivoCsv = new File(pasta, "arquivo.csv");
            arquivoCsv.createNewFile();

            // Criar arquivo XML
            File arquivoXml = new File(pasta, "arquivo.xml");
            arquivoXml.createNewFile();

            // Criar arquivo JSON
            File arquivoJson = new File(pasta, "arquivo.json");
            arquivoJson.createNewFile();

            System.out.println("Arquivos criados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao criar os arquivos!");
            e.printStackTrace();
        }
    }
}
