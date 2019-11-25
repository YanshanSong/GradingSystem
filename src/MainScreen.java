import java.awt.Toolkit;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class MainScreen extends JPanel {
	private JButton logOutButton;
	private JButton aCViewButton;
	private JButton pCViewButton;
	private JButton tViewButton;
	private JButton aCAddButton;
	private JButton pCDeleteButton;
	private JButton tAddButton;

	private Table table1;
	private Table table2;
	private Table table3;

	/**
	 * Create the panel.
	 */
	public MainScreen() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 1200, 800);
		setLayout(null);

		String[] header1 = {"Name", "Deadline"};
		String[][] data1 = {{"CS591 K1", "12/13/2019"}, {"CS591 E1", "12/13/2019"}, {"CS591 J1", "12/13/2019"}};

		table1 = new Table(header1, data1);
		JScrollPane jScrollPane1 = table1.generateTable();
		jScrollPane1.setBounds(50, 150, 300, 500);
		add(jScrollPane1);

		String[] header2 = {"Name", "Deadline"};
		String[][] data2 = {{"CS530", "11/13/2019"}};

		table2 = new Table(header2, data2);
		JScrollPane jScrollPane2 = table2.generateTable();
		jScrollPane2.setBounds(450, 150, 300, 500);
		add(jScrollPane2);

		String[] header3 = {"Name", "Deadline"};
		String[][] data3 = {};

		table3 = new Table(header3, data3);
		JScrollPane jScrollPane3 = table3.generateTable();
		jScrollPane3.setBounds(850, 150, 300, 500);
		add(jScrollPane3);
		
		JLabel label1 = new JLabel("Active Course");
		label1.setForeground(Color.BLUE);
		label1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label1.setBounds(141, 100, 118, 25);
		add(label1);
		
		JLabel label2 = new JLabel("Past Course");
		label2.setForeground(Color.BLUE);
		label2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label2.setBounds(549, 100, 102, 25);
		add(label2);
		
		JLabel label3 = new JLabel("Template");
		label3.setForeground(Color.BLUE);
		label3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label3.setBounds(960, 100, 81, 25);
		add(label3);
		
		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(1025, 25, 117, 29);
		add(logOutButton);
		
		aCViewButton = new JButton("View");
		aCViewButton.setBounds(141, 670, 117, 29);
		add(aCViewButton);

		aCAddButton = new JButton("Add");
		aCAddButton.setBounds(141, 700, 117, 29);
		add(aCAddButton);
		
		pCViewButton = new JButton("View");
		pCViewButton.setBounds(541, 670, 117, 29);
		add(pCViewButton);

		pCDeleteButton = new JButton("Delete");
		pCDeleteButton.setBounds(541, 700, 117, 29);
		add(pCDeleteButton);
		
		tViewButton = new JButton("View");
		tViewButton.setBounds(941, 670, 117, 29);
		add(tViewButton);

		tAddButton = new JButton("Add");
		tAddButton.setBounds(941, 700, 117, 29);
		add(tAddButton);
	}

	public JButton getLogOutButton() {
		return logOutButton;
	}

	public JButton getACViewButton() {
		return aCViewButton;
	}

	public JButton getPCViewButton(){
		return pCViewButton;
	}

	public JButton getTViewButton() {
		return tViewButton;
	}
}
