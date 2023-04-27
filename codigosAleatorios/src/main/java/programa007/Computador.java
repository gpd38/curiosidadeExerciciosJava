package programa007;

import java.util.Random;

public class Computador extends Jogador {

	public Computador(int jogador) {
		super(jogador);
		System.out.println("Jogador 'Computador' criado!");
	}

	@Override
	public void jogar(Tabuleiro tabuleiro) {
		Tentativa(tabuleiro);
		tabuleiro.setPosicao(tentativa, jogador);
	}

	@Override
	public void Tentativa(Tabuleiro tabuleiro) {
		Random random = new Random();
		do {
			do {
				tentativa[0] = random.nextInt(4);
			} while (tentativa[0] > 3 || tentativa[0] < 1);
			System.out.print("Linha: " + tentativa[0]);
			System.out.println();
			do {
				tentativa[1] = random.nextInt(4);
			} while (tentativa[1] > 3 || tentativa[1] < 1);
			System.out.print("Coluna: " + tentativa[1]);
			System.out.println();

			tentativa[0]--;
			tentativa[1]--;

			if (!checaTentativa(tentativa, tabuleiro))
				System.out.println("Esse local j� foi marcado. Tente outro.");
		} while (!checaTentativa(tentativa, tabuleiro));
	}
}