package leituraDeArquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadWithScanner {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\input.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}