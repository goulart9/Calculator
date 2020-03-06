import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator {
	
	public static int width = 406, height = 729;
	static double op1 = 0, op2 = 0, result = 0;
	static String operation = "", ans = "";
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	static JButton one = new JButton();
	static JButton two = new JButton();
	static JButton three = new JButton();
	static JButton four = new JButton();
	static JButton five = new JButton();
	static JButton six = new JButton();
	static JButton seven = new JButton();
	static JButton eight = new JButton();
	static JButton nine = new JButton();
	static JButton neg = new JButton();
	static JButton zero = new JButton();
	static JButton dec = new JButton();
	static JButton add = new JButton();
	static JButton sub = new JButton();
	static JButton mul = new JButton();
	static JButton div = new JButton();
	static JButton clr = new JButton();
	static JButton equ = new JButton();
	
	public static void main(String[] args) {
		
		one.setBounds(0, 150, 130, 90);
		one.setText("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "1";
				label.setText(operation);
			}
		});
		
		two.setBounds(130, 150, 130, 90);
		two.setText("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "2";
				label.setText(operation);
			}
		});
		
		three.setBounds(260, 150, 130, 90);
		three.setText("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "3";
				label.setText(operation);
			}
		});
		
		four.setBounds(0, 240, 130, 90);
		four.setText("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "4";
				label.setText(operation);
			}
		});
		
		five.setBounds(130, 240, 130, 90);
		five.setText("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "5";
				label.setText(operation);
			}
		});
		
		six.setBounds(260, 240, 130, 90);
		six.setText("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "6";
				label.setText(operation);
			}
		});
		
		seven.setBounds(0, 330, 130, 90);
		seven.setText("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "7";
				label.setText(operation);
			}
		});
		
		eight.setBounds(130, 330, 130, 90);
		eight.setText("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "8";
				label.setText(operation);
			}
		});
		
		nine.setBounds(260, 330, 130, 90);
		nine.setText("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "9";
				label.setText(operation);
			}
		});
		
		neg.setBounds(0, 420, 130, 90);
		neg.setText("+/-");

		zero.setBounds(130, 420, 130, 90);
		zero.setText("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "0";
				label.setText(operation);
			}
		});
		
		dec.setBounds(260, 420, 130, 90);
		dec.setText(".");
		dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + ".";
				label.setText(operation);
			}
		});
		
		add.setBounds(0, 510, 97, 90);
		add.setText("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "+";
				label.setText(operation);
			}
		});
		
		sub.setBounds(97, 510, 98, 90);
		sub.setText("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "-";
				label.setText(operation);
			}
		});
		
		mul.setBounds(195, 510, 98, 90);
		mul.setText("x");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "*";
				label.setText(operation);
			}
		});
		
		div.setBounds(293, 510, 97, 90);
		div.setText("÷");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = operation + "÷";
				label.setText(operation);
			}
		});
		
		clr.setBounds(0, 600, 195, 90);
		clr.setText("CLR");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "";
				label.setText(operation);
			}
		});
		
		equ.setBounds(195, 600, 195, 90);
		equ.setText("=");
		equ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] ops;
				if (operation.contains("+")) {
					ops = operation.split("\\+");
					op1 = Double.parseDouble(ops[0]);
					op2 = Double.parseDouble(ops[1]);
					result = op1 + op2;
					
					if (result == (long)result) {
						label.setText(String.format("%d", (long)result));
					}
					
					else {
						label.setText(Double.toString(result));
					}
					operation = "";
				}
				
				else if (operation.contains("-")) {
					ops = operation.split("\\-");
					op1 = Double.parseDouble(ops[0]);
					op2 = Double.parseDouble(ops[1]);
					result = op1 - op2;
					
					if (result == (long)result) {
						label.setText(String.format("%d", (long)result));
					}
					
					else {
						label.setText(Double.toString(result));
					}
					operation = "";
				}
				
				else if (operation.contains("*")) {
					ops = operation.split("\\*");
					op1 = Double.parseDouble(ops[0]);
					op2 = Double.parseDouble(ops[1]);
					result = op1 * op2;
					
					if (result == (long)result) {
						label.setText(String.format("%d", (long)result));
					}
					
					else {
						label.setText(Double.toString(result));
					}
					operation = "";
				}
				
				else if (operation.contains("÷")) {
					ops = operation.split("\\÷");
					op1 = Double.parseDouble(ops[0]);
					op2 = Double.parseDouble(ops[1]);
					result = op1 / op2;
					
					if (result == (long)result) {
						label.setText(String.format("%d", (long)result));
					}
					
					else {
						label.setText(Double.toString(result));
					}
					operation = "";
				}
				
				else {
					label.setText("Invalid");
					operation = "";
				}
			}
		});
		
		label.setBounds(0, 0, 390, 140);
		label.setText(operation);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		panel.add(label);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(neg);
		panel.add(zero);
		panel.add(dec);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(clr);
		panel.add(equ);
		panel.setLayout(null);
		
		frame.add(panel);
		frame.setTitle("Aurora Calculator");
		frame.setResizable(true);
		frame.setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}