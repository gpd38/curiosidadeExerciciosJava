package desafiosWeb;

import javax.swing.JOptionPane;

public class Desafios {
	static int parar;
	static int x, y, z, k, w;

	public static void main(String[] args) {
		desafio01();
		desafio04();
	}

	public static void imprimir(String nomeDesafio, int x, int y, int z, int k, int w) {
		System.out.println("Resultado Final do " + nomeDesafio + "\n\tX: " + x + "\tY: " + y + "\tZ: " + z + "\tK: " + k
				+ "\tW: " + w);
		JOptionPane.showMessageDialog(null,
				"Resultado Final do " + nomeDesafio + "\n X: " + x + " Y: " + y + " Z: " + z + " K: " + k + " W: " + w);
	}

	public static void digitarValores(String nomeDesafio) {
		JOptionPane.showMessageDialog(null, "Inserindo valores para o " + nomeDesafio);
		do {
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
			y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y: "));
			z = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Z: "));
			k = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de K: "));
			w = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de W: "));
			parar = JOptionPane.showConfirmDialog(null,
					"Valores informados estão corretos ?\nX: " + x + " Y: " + y + " Z: " + z + " K: " + k + " W: " + w);
		} while (parar != 0);
	}

	public static void desafio01() {
		digitarValores("desafio01");

		imprimir("desafio01", x, y, z, k, w);
	}

	public static void desafio04() {
		digitarValores("desafio04");
		x = x * 5 - k;
		w = k + (z - y + x) - (1 + w) * 3;
		y = x - 2 * (w - 6) * 2 + x;
		z = (y + k) * 2 - 5;
		y = x - z + 2;
		w = y - 4 * (2 + 6);
		z = x + (y - 4) * k;
		k = k - y * z + 4;
		k = y + (2 * y - 3);
		x = (y + 1) * x - y;
		imprimir("desafio04", x, y, z, k, w);
	}

}
