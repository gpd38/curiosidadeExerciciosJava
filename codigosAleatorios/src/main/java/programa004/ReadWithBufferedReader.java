package programa004;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWithBufferedReader {

	public static void main(String[] args) {

		String path = "..\\codigosAleatorios\\src\\main\\java\\programa004\\in.txt";
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}