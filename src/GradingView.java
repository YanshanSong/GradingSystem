import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class GradingView extends JPanel {
	private JTextField txtScore;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GradingView() {
		setLayout(null);
		
		JLabel lblSortingOptions = new JLabel("Sorting Options");
		lblSortingOptions.setBounds(87, 58, 108, 16);
		add(lblSortingOptions);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(87, 103, 108, 27);
		add(comboBox);
		
		JLabel lblStudentList = new JLabel("Student List");
		lblStudentList.setBounds(87, 198, 108, 16);
		add(lblStudentList);
		
		JLabel lblFilterOptions = new JLabel("Filter Options");
		lblFilterOptions.setBounds(87, 462, 108, 16);
		add(lblFilterOptions);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(87, 490, 108, 27);
		add(comboBox_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(410, 107, 61, 16);
		add(lblName);
		
		JLabel lblSelectedStudent = new JLabel("Selected Student");
		lblSelectedStudent.setBounds(410, 58, 120, 16);
		add(lblSelectedStudent);
		
		JLabel lblUid = new JLabel("UID");
		lblUid.setBounds(410, 155, 61, 16);
		add(lblUid);
		
		txtScore = new JTextField();
		txtScore.setText("Score");
		txtScore.setBounds(410, 193, 130, 26);
		add(txtScore);
		txtScore.setColumns(10);
		
		JTextArea txtrSomeComment = new JTextArea();
		txtrSomeComment.setText("Some comment...");
		txtrSomeComment.setBounds(410, 260, 210, 86);
		add(txtrSomeComment);
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(413, 386, 99, 27);
		add(btnPrev);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(524, 385, 96, 28);
		add(btnNext);
		
		table = new JTable();
		table.setBounds(87, 238, 153, 197);
		add(table);

	}
}
