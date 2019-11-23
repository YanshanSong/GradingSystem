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
		backButton.setBounds(522, 32, 117, 29);
		add(backButton);
		
		JLabel lblList = new JLabel("List");
		lblList.setBounds(125, 111, 61, 16);
		add(lblList);
		
		
		String[] header1 = {"Name", "ID", "Comment"};
		String[][] data1 = {};

		Table table = new Table(header1, data1);
		JScrollPane jScrollPane1 = table.generateTable();
		jScrollPane1.setBounds(125, 184, 292, 203);
	
		add(jScrollPane1);
		
		JLabel lblStudentView = new JLabel("Student View");
		lblStudentView.setBounds(462, 111, 101, 16);
		add(lblStudentView);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(462, 155, 61, 16);
		add(lblName);
		
		JLabel lblUid = new JLabel("UID");
		lblUid.setBounds(462, 196, 61, 16);
		add(lblUid);
		
		txtComment = new JTextField();
		txtComment.setText("Comment");
		txtComment.setBounds(462, 244, 130, 26);
		add(txtComment);
		txtComment.setColumns(10);
		
		JButton prevButton = new JButton("Prev");
		prevButton.setBounds(462, 309, 93, 29);
		add(prevButton);
		
		JButton nextButton = new JButton("Next");
		nextButton.setBounds(553, 309, 86, 29);
		add(nextButton);
	}

	public JButton getBackButton() {
		return backButton;
	}
}
