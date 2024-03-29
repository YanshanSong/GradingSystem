import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;

public class StudentView extends JPanel {
	private JTextField txtComment;

	private JButton backButton;

	/**
	 * Create the panel.
	 */
	public StudentView() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		backButton = new JButton("Back");
		backButton.setBounds(1000, 32, 117, 29);
		add(backButton);
		
		JLabel lblList = new JLabel("List");
		lblList.setBounds(125, 110, 61, 16);
		add(lblList);
		
		
		String[] header1 = {"Name", "ID", "Comment"};
		String[][] data1 = {
				{"Adam", "U12345678", "Excellent Student"},
				{"Alice", "U45674563", "Good Student"},
				{"Bob", "U46786345", "Not Bad Student"}};

		Table table = new Table(header1, data1);
		JScrollPane jScrollPane1 = table.generateTable();
		jScrollPane1.setBounds(125, 184, 500, 500);
	
		add(jScrollPane1);
		
		JLabel lblStudentView = new JLabel("Student View");
		lblStudentView.setBounds(850, 110, 101, 16);
		add(lblStudentView);
				
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(850, 170, 61, 16);
		add(lblName);
		
		JLabel lblUid = new JLabel("UID");
		lblUid.setBounds(850, 230, 61, 16);
		add(lblUid);
		
		txtComment = new JTextField();
		txtComment.setText("Comment");
		txtComment.setBounds(850, 290, 130, 26);
		add(txtComment);
		txtComment.setColumns(10);
		
		JButton prevButton = new JButton("Prev");
		prevButton.setBounds(850, 360, 93, 29);
		add(prevButton);
		
		JButton nextButton = new JButton("Next");
		nextButton.setBounds(950, 360, 86, 29);
		add(nextButton);
	}

	public JButton getBackButton() {
		return backButton;
	}
}
