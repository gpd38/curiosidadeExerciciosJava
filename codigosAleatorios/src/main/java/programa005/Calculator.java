package programa005;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
	private JTextField display;
	private JButton[] numberButtons;
	private JButton[] operatorButtons;
	private JButton equalsButton;
	private JButton clearButton;
	private JPanel panel;

	private String currentNumber="";
	private String currentOperator;
	private double result;

	public Calculator() {
		setTitle("Calculator");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setVisible(true);

		display = new JTextField();
		display.setEditable(false);
		add(display, BorderLayout.NORTH);

		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));

		numberButtons = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			panel.add(numberButtons[i]);
		}

		operatorButtons = new JButton[4];
		operatorButtons[0] = new JButton("+");
		operatorButtons[1] = new JButton("-");
		operatorButtons[2] = new JButton("*");
		operatorButtons[3] = new JButton("/");
		for (int i = 0; i < 4; i++) {
			operatorButtons[i].addActionListener(this);
			panel.add(operatorButtons[i]);
		}

		equalsButton = new JButton("=");
		equalsButton.addActionListener(this);
		panel.add(equalsButton);

		clearButton = new JButton("C");
		clearButton.addActionListener(this);
		panel.add(clearButton);

		add(panel, BorderLayout.CENTER);

	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("C")) {
			currentNumber = "";
			currentOperator = "";
			result = 0;
			display.setText("");
		} else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
			currentOperator = command;
			if (currentNumber.isBlank() || currentNumber.isEmpty() || currentNumber == null) {
				System.out.println("-- " + currentNumber.isBlank());
				System.out.println("-- " + currentNumber.isEmpty());
				result = 0;
			}
			result = Double.parseDouble(currentNumber);
			currentNumber = "";
			display.setText("");
		} else if (command.equals("=")) {
			double secondNumber = Double.parseDouble(currentNumber);
			if (currentOperator.equals("+")) {
				result += secondNumber;
			} else if (currentOperator.equals("-")) {
				result -= secondNumber;
			} else if (currentOperator.equals("*")) {
				result *= secondNumber;
			} else if (currentOperator.equals("/")) {
				result /= secondNumber;
			}
			currentNumber = String.valueOf(result);
			display.setText(currentNumber);
		} else {
			currentNumber += command;
			display.setText(currentNumber);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculator();
			}
		});
	}
}
