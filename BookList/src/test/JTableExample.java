package test;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JTable Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] columnNames = {"Name", "Age", "Gender"};
		Object[][] data = {
				{"John", 25, "Male"},
				{"Alice", 30, "Female"},
				{"Bob", 28, "Male"},
				{"Eve", 22, "Female"}
		};
		
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
		
		frame.pack();
		frame.setVisible(true);
	}

}
