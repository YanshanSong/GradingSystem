import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;

public class NewTemplateView extends JPanel {
	private JTextField txtName;
	private JTable table;
	private JTable table_1;

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
		
		table = new JTable();
		table.setBounds(69, 161, 184, 183);
		add(table);
		
		JButton btnAddTask = new JButton("Add Task");
		btnAddTask.setBounds(82, 383, 117, 29);
		add(btnAddTask);
		
		JButton btnDeleteTask = new JButton("Delete Task");
		btnDeleteTask.setBounds(82, 440, 117, 29);
		add(btnDeleteTask);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(446, 44, 117, 29);
		add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(575, 44, 117, 29);
		add(btnSave);
		
		JLabel lblSubtasks = new JLabel("SubTasks");
		lblSubtasks.setBounds(456, 103, 61, 16);
		add(lblSubtasks);
		
		table_1 = new JTable();
		table_1.setBounds(446, 156, 195, 188);
		add(table_1);
		
		JButton btnAddSubtask = new JButton("Add Subtask");
		btnAddSubtask.setBounds(486, 383, 117, 29);
		add(btnAddSubtask);
		
		JButton btnDeleteTask_1 = new JButton("Delete Task");
		btnDeleteTask_1.setBounds(486, 440, 117, 29);
		add(btnDeleteTask_1);

	}

}
