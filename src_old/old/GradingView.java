import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class GradingView extends JPanel {
	private JTextField txtScore;
	private JButton btnBack;

	/**
	 * Create the panel.
	 */
	public GradingView() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblSortingOptions = new JLabel("Sorting Options");
		lblSortingOptions.setBounds(100, 58, 108, 16);
		add(lblSortingOptions);
		
		JComboBox options = new JComboBox();
		options.setToolTipText("");
		options.setBounds(100, 103, 200, 27);
		add(options);
		
		JLabel lblStudentList = new JLabel("Student List");
		lblStudentList.setBounds(100, 198, 108, 16);
		add(lblStudentList);
		
		JLabel lblFilterOptions = new JLabel("Filter Options");
		lblFilterOptions.setBounds(100, 570, 108, 16);
		add(lblFilterOptions);
		
		JComboBox filters = new JComboBox();
		filters.addItem("Undergraduate");
		filters.addItem("Graduate");
		filters.setBounds(100, 600, 200, 27);
		add(filters);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(710, 107, 61, 16);
		add(lblName);
		
		JLabel lblSelectedStudent = new JLabel("Selected Student");
		lblSelectedStudent.setBounds(710, 58, 120, 16);
		add(lblSelectedStudent);
		
		JLabel lblUid = new JLabel("UID");
		lblUid.setBounds(710, 155, 61, 16);
		add(lblUid);
		
		txtScore = new JTextField();
		txtScore.setText("Score");
		txtScore.setBounds(710, 193, 130, 26);
		add(txtScore);
		txtScore.setColumns(10);
		
		JTextArea txtrSomeComment = new JTextArea();
		txtrSomeComment.setText("Input comment...");
		txtrSomeComment.setBounds(710, 260, 210, 200);
		add(txtrSomeComment);
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(720, 520, 99, 27);
		add(btnPrev);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(830, 520, 99, 27);
		add(btnNext);
		
		
		String[] header1 = {"Name", "UID", "Type"};
		String[][] data1 = {
				{"Adam", "U12345678", "Undergraduate"},
				{"Alice", "U45674563", "Graduate"},
				{"Yanshan Song", "U93089867", "Graduate"}
		};

		Table table = new Table(header1, data1);
		JScrollPane jScrollPane1 = table.generateTable();
		jScrollPane1.setBounds(87, 238, 300, 300);

		add(jScrollPane1);
		
		btnBack = new JButton("back");
		btnBack.setBounds(900, 53, 117, 29);
		add(btnBack);
	}
	
	public JButton getBtnBack() {
		return btnBack;
	}
}
