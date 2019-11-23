import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;

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
		jScrollPane1.setBounds(69, 161, 184, 183);

		add(jScrollPane1);
		
		String[] header2 = {"Name", "%"};
		String[][] data2 = {};

		Table table2 = new Table(header2, data2);
		JScrollPane jScrollPane2 = table2.generateTable();
		jScrollPane2.setBounds(446, 156, 195, 188);

		add(jScrollPane2);

		addTaskButton = new JButton("Add Task");
		addTaskButton.setBounds(82, 383, 117, 29);
		add(addTaskButton);
		
		deleteTaskButton = new JButton("Delete Task");
		deleteTaskButton.setBounds(82, 440, 117, 29);
		add(deleteTaskButton);
		
		backButton = new JButton("Back");
		backButton.setBounds(446, 44, 117, 29);
		add(backButton);
		
		saveButton = new JButton("Save");
		saveButton.setBounds(575, 44, 117, 29);
		add(saveButton);
		
		JLabel lblSubtasks = new JLabel("SubTasks");
		lblSubtasks.setBounds(456, 103, 61, 16);
		add(lblSubtasks);

		addSubtaskButton = new JButton("Add Subtask");
		addSubtaskButton.setBounds(486, 383, 117, 29);
		add(addSubtaskButton);
		
		deleteTask1Button = new JButton("Delete Task");
		deleteTask1Button.setBounds(486, 440, 117, 29);
		add(deleteTask1Button);

	}

	public JButton getBackButton() {
		return backButton;
	}

}
