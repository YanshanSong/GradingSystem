import javax.swing.*;
import java.awt.*;

public class CourseView extends JPanel {
	private JButton newTaskButton;
	private JButton starsButton;
	private JButton studentsButton;
	private JButton backButton;

	private JButton aTViewButton;
	private JButton aTDeleteButton;
	private JButton pTViewButton;
	private JButton pTDeleteButton;
	private JButton uTViewButton;
	private JButton uTDeleteButton;

	private Table table1;
	private Table table2;
	private Table table3;

	/**
	 * Create the panel.
	 */
	public CourseView() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 1200, 800);
		setLayout(null);

		String[] header1 = {"Name", "Deadline"};
		String[][] data1 = {{"HW2", "12/01/2019"}};

		table1 = new Table(header1, data1);
		JScrollPane jScrollPane1 = table1.generateTable();
		jScrollPane1.setBounds(50, 150, 300, 500);
		add(jScrollPane1);

		String[] header2 = {"Name", "Deadline"};
		String[][] data2 = {{"HW1", "11/20/2019"}};

		table2 = new Table(header2, data2);
		JScrollPane jScrollPane2 = table2.generateTable();
		jScrollPane2.setBounds(450, 150, 300, 500);
		add(jScrollPane2);

		String[] header3 = {"Name", "Start Time", "Deadline"};
		String[][] data3 = {{"HW3", "12/02/2019", "12/20/2019"}};

		table3 = new Table(header3, data3);
		JScrollPane jScrollPane3 = table3.generateTable();
		jScrollPane3.setBounds(850, 150, 300, 500);
		add(jScrollPane3);

		JLabel label1 = new JLabel("Active Tasks");
		label1.setForeground(Color.BLUE);
		label1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label1.setBounds(141, 100, 118, 25);
		add(label1);

		JLabel label2 = new JLabel("Past Tasks");
		label2.setForeground(Color.BLUE);
		label2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label2.setBounds(549, 100, 102, 25);
		add(label2);

		JLabel label3 = new JLabel("Upcoming Tasks");
		label3.setForeground(Color.BLUE);
		label3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		label3.setBounds(928, 100, 144, 25);
		add(label3);
		
		newTaskButton = new JButton("New Task");
		newTaskButton.setBounds(614, 25, 117, 29);
		add(newTaskButton);
		
		starsButton = new JButton("Stats");
		starsButton.setBounds(751, 25, 117, 29);
		add(starsButton);
		
		studentsButton = new JButton("Students");
		studentsButton.setBounds(888, 25, 117, 29);
		add(studentsButton);
		
		backButton = new JButton("Back");
		backButton.setBounds(1025, 25, 117, 29);
		add(backButton);

		aTViewButton = new JButton("View");
		aTViewButton.setBounds(141, 670, 117, 29);
		add(aTViewButton);

		aTDeleteButton = new JButton("Delete");
		aTDeleteButton.setBounds(141, 700, 117, 29);
		add(aTDeleteButton);

		pTViewButton = new JButton("View");
		pTViewButton.setBounds(541, 670, 117, 29);
		add(pTViewButton);

		pTDeleteButton = new JButton("Delete");
		pTDeleteButton.setBounds(541, 700, 117, 29);
		add(pTDeleteButton);

		uTViewButton = new JButton("View");
		uTViewButton.setBounds(941, 670, 117, 29);
		add(uTViewButton);

		uTDeleteButton = new JButton("Delete");
		uTDeleteButton.setBounds(941, 700, 117, 29);
		add(uTDeleteButton);
	}

	public JButton getNewTaskButton() {
		return newTaskButton;
	}

	public JButton getBackButton() {
		return backButton;
	}

	public JButton getATViewButton() {
		return aTViewButton;
	}

	public JButton getPTViewButton() {
		return pTViewButton;
	}

	public JButton getUTViewButton() {
		return uTViewButton;
	}

	public JButton getStudentsButton() {
		return studentsButton;
	}
}
