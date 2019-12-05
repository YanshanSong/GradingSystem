import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class TaskView extends JPanel {
	private JTextField txtSomething;
	private JTextField textField;
	private JTextField txtDec;

	private JButton backButton;
	private JButton gradeButton;

	private JLabel statusLabel;

	/**
	 * Create the panel.
	 */
	public TaskView() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(49, 48, 61, 16);
		add(lblNewLabel);
		
		JLabel lblObjective = new JLabel("Objective");
		lblObjective.setBounds(49, 123, 122, 16);
		add(lblObjective);
		
		JLabel lblMasks = new JLabel("Task name:");
		lblMasks.setBounds(49, 203, 98, 16);
		add(lblMasks);
		
		JLabel lblWeightage = new JLabel("Weightage:");
		lblWeightage.setBounds(49, 290, 71, 16);
		add(lblWeightage);
		
		JLabel lblDeadline = new JLabel("Deadline:");
		lblDeadline.setBounds(49, 387, 71, 16);
		add(lblDeadline);
		
		txtSomething = new JTextField();
		txtSomething.setText("Something");
		txtSomething.setBounds(208, 198, 130, 26);
		add(txtSomething);
		txtSomething.setColumns(10);
		
		textField = new JTextField();
		textField.setText("30%");
		textField.setColumns(10);
		textField.setBounds(208, 285, 130, 26);
		add(textField);
		
		txtDec = new JTextField();
		txtDec.setText("5 Dec");
		txtDec.setColumns(10);
		txtDec.setBounds(208, 382, 130, 26);
		add(txtDec);
		
		statusLabel = new JLabel("ACTIVE");
		statusLabel.setForeground(Color.BLUE);
		statusLabel.setBounds(800, 48, 89, 16);
		add(statusLabel);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setBounds(44, 500, 117, 29);
		add(btnModify);
		
		JButton btnShowGraded = new JButton("Show Graded");
		btnShowGraded.setBounds(422, 500, 117, 29);
		add(btnShowGraded);
		
		gradeButton = new JButton("Grade");
		gradeButton.setBounds(800, 500, 117, 29);
		add(gradeButton);
		
		backButton = new JButton("Back");
		backButton.setBounds(800, 7, 117, 29);
		add(backButton);

	}

	public JButton getBackButton() {
		return backButton;
	}

	public JButton getGradeButton() {
		return gradeButton;
	}

	public JLabel getStatusLabel() {
		return statusLabel;
	}
}
