package webDriver;

import java.util.Random;

public class GeradorNumerosAleatorios {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(gerarNumerosAleatorios());
		}
		
	}
	
	public static String gerarNumerosAleatorios()
    {
        Random random = new Random();
        String result= "";
        int temp;

        for (int i = 1; i < 10; i++)
        {
             temp = random.nextInt(9);
            result+=temp;
        }

        return result;
    }

}
