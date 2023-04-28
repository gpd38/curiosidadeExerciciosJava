package programa005;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora2 extends JFrame implements ActionListener {
   private JTextField campoTexto;
   private JButton botaoNumerico[];
   private JButton botaoOperacao[];
   private String textoNumero;
   private double resultado;
   private String operacao;

   public Calculadora2() {
      super("Calculadora");

      JPanel painelNumerico = new JPanel();
      painelNumerico.setLayout(new GridLayout(4, 3, 10, 10));
      botaoNumerico = new JButton[10];
      for (int i = 0; i < 10; i++) {
         botaoNumerico[i] = new JButton("" + i);
         botaoNumerico[i].addActionListener(this);
         painelNumerico.add(botaoNumerico[i]);
      }

      JPanel painelOperacao = new JPanel();
      painelOperacao.setLayout(new GridLayout(4, 1, 10, 10));
      botaoOperacao = new JButton[4];
      botaoOperacao[0] = new JButton("+");
      botaoOperacao[1] = new JButton("-");
      botaoOperacao[2] = new JButton("*");
      botaoOperacao[3] = new JButton("/");
      for (int i = 0; i < 4; i++) {
         botaoOperacao[i].addActionListener(this);
         painelOperacao.add(botaoOperacao[i]);
      }

      JPanel painelBotoes = new JPanel();
      painelBotoes.setLayout(new BorderLayout(10, 10));
      painelBotoes.add(painelNumerico, BorderLayout.CENTER);
      painelBotoes.add(painelOperacao, BorderLayout.EAST);

      campoTexto = new JTextField(20);
      campoTexto.setEditable(false);
      campoTexto.setHorizontalAlignment(SwingConstants.RIGHT);

      JPanel painelPrincipal = new JPanel();
      painelPrincipal.setLayout(new BorderLayout(10, 10));
      painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      painelPrincipal.add(campoTexto, BorderLayout.NORTH);
      painelPrincipal.add(painelBotoes, BorderLayout.CENTER);

      add(painelPrincipal);

      textoNumero = "";
      resultado = 0;
      operacao = "";
   }

   public void actionPerformed(ActionEvent e) {
      String comando = e.getActionCommand();
      if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
         textoNumero += comando;
         campoTexto.setText(textoNumero);
      } else if (comando.equals("+")) {
         resultado += Double.parseDouble(textoNumero);
         operacao = "+";
         textoNumero = "";
         campoTexto.setText("");
      } else if (comando.equals("-")) {
         resultado -= Double.parseDouble(textoNumero);
         operacao = "-";
         textoNumero = "";
         campoTexto.setText("");
      } else if (comando.equals("*")) {
         resultado *= Double.parseDouble(textoNumero);
         operacao = "*";
         textoNumero = "";
         campoTexto.setText("");
      } else if (comando.equals("/")) {
         resultado /= Double.parseDouble(textoNumero);
         operacao = "/";
         textoNumero = "";
         campoTexto.setText("");
      }
   }

   public static void main(String[] args) {
      Calculadora2 c = new Calculadora2();
      c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      c.setSize(250, 250);
      c.setLocationRelativeTo(null);
      c.setVisible(true);
   }
}
