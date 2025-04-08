package test;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JTextArea Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setLayout(new BorderLayout());
		
		JTextArea textArea = new JTextArea(10, 30);
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		JButton button = new JButton("확인");
		
		frame.add(scrollPane, BorderLayout.CENTER);
		frame.add(button, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}

}
