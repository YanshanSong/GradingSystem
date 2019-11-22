import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StudentView extends JPanel {
	private JTable table;
	private JTextField txtComment;

	/**
	 * Create the panel.
	 */
	public StudentView() {
		setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(522, 32, 117, 29);
		add(btnBack);
		
		JLabel lblList = new JLabel("List");
		lblList.setBounds(125, 111, 61, 16);
		add(lblList);
		
		table = new JTable();
		table.setBounds(125, 184, 292, 203);
		add(table);
		
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
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(462, 309, 93, 29);
		add(btnPrev);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(553, 309, 86, 29);
		add(btnNext);

	}

}
