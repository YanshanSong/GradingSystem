import java.awt.Toolkit;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class MainScreen extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainScreen() {
		// set the frame centered
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		int width = 1200;
		int height = 800;
		setBounds(screenWidth/2 - width/2, screenHeight/2 - height/2, width, height);
		setLayout(null);

		String[] header1 = {"Name", "Deadline"};
		String[][] data1 = {};

		Table table1 = new Table(header1, data1);
		JScrollPane jScrollPane1 = table1.generateTable();
		jScrollPane1.setBounds(50, 150, 300, 500);
		add(jScrollPane1);


		String[] header2 = {"Name", "Deadline"};
		String[][] data2 = {};

		Table table2 = new Table(header2, data2);
		JScrollPane jScrollPane2 = table2.generateTable();
		jScrollPane2.setBounds(450, 150, 300, 500);
		add(jScrollPane2);

		String[] header3 = {"Name", "Deadline"};
		String[][] data3 = {};

		Table table3 = new Table(header3, data3);
		JScrollPane jScrollPane3 = table2.generateTable();
		jScrollPane3.setBounds(850, 150, 300, 500);
		add(jScrollPane3);
		
		JLabel lblNewLabel = new JLabel("Active Course");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(141, 90, 118, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Past Course");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(549, 90, 102, 25);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Template");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(960, 90, 81, 25);
		add(lblNewLabel_2);
	}
}
