package test;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JtextField Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setLayout(new FlowLayout());
		
		JTextField textField = new JTextField(20);
		JButton button = new JButton("확인");
		
		frame.add(textField);
		frame.add(button);
		
		frame.setVisible(true);
	}

}
