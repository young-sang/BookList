package test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;


public class TestFrame extends JFrame{

	public TestFrame() {
		setTitle("1000x600 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(500,300);
		
		// 컨테이너
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		// 레이블
		JLabel lblNewLabel = new JLabel("레이블 테스트 입니다.");
		lblNewLabel.setBounds(182,133,124,15);
		contentPane.add(lblNewLabel);
		
		// 버튼
		JButton btnNewButton = new JButton("버튼 테스트");
		btnNewButton.setBounds(182, 59, 110, 23);
		contentPane.add(btnNewButton);
		
		// 텍스트 에리어
		JTextField textField = new JTextField();
		textField.setBounds(190,203,96,21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFrame mf = new TestFrame();
//		System.out.println("hello");
	}

}
