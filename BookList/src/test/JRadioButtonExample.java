package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JRadioButton Example");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());
		
		JRadioButton radioButton1 = new JRadioButton("Option 1");
		JRadioButton radioButton2 = new JRadioButton("Option 2");
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		
		ActionListener radioBUttonListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Selected: " + ((JRadioButton) e.getSource()).getText());
			}
		};
		radioButton1.addActionListener(radioBUttonListener);
		radioButton2.addActionListener(radioBUttonListener);
		
		frame.add(radioButton1);
		frame.add(radioButton2);
		
		frame.setVisible(true);
	}

}
