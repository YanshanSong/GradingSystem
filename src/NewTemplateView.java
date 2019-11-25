import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;

public class NewTemplateView extends JPanel {
	private JTextField txtName;

	private JButton addTaskButton;
	private JButton deleteTaskButton;
	private JButton backButton;
	private JButton saveButton;
	private JButton addSubtaskButton;
	private JButton deleteTask1Button;

	/**
	 * Create the panel.
	 */
	public NewTemplateView() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(69, 44, 130, 26);
		add(txtName);
		txtName.setColumns(10);
		
		JLabel lblTasks = new JLabel("Tasks");
		lblTasks.setBounds(69, 103, 61, 16);
		add(lblTasks);
		
		String[] header1 = {"Name", "%"};
		String[][] data1 = {};

		Table table = new Table(header1, data1);
		JScrollPane jScrollPane1 = table.generateTable();
		jScrollPane1.setBounds(69, 161, 400, 450);

		add(jScrollPane1);
		
		String[] header2 = {"Name", "%"};
		String[][] data2 = {};

		Table table2 = new Table(header2, data2);
		JScrollPane jScrollPane2 = table2.generateTable();
		jScrollPane2.setBounds(800, 156, 400, 450);

		add(jScrollPane2);

		addTaskButton = new JButton("Add Task");
		addTaskButton.setBounds(120, 650, 117, 29);
		add(addTaskButton);
		
		deleteTaskButton = new JButton("Delete Task");
		deleteTaskButton.setBounds(290, 650, 117, 29);
		add(deleteTaskButton);
		
		backButton = new JButton("Back");
		backButton.setBounds(900, 44, 117, 29);
		add(backButton);
		
		saveButton = new JButton("Save");
		saveButton.setBounds(1050, 44, 117, 29);
		add(saveButton);
		
		JLabel lblSubtasks = new JLabel("SubTasks");
		lblSubtasks.setBounds(800, 103, 61, 16);
		add(lblSubtasks);

		addSubtaskButton = new JButton("Add Subtask");
		addSubtaskButton.setBounds(870, 650, 117, 29);
		add(addSubtaskButton);
		
		deleteTask1Button = new JButton("Delete Subtask");
		deleteTask1Button.setBounds(1040, 650, 140, 29);
		add(deleteTask1Button);

	}

	public JButton getBackButton() {
		return backButton;
	}

}
