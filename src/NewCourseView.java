import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class NewCourseView extends JPanel {

	private JButton btnBack;
	/**
	 * Create the panel.
	 */
	public NewCourseView() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(532, 84, 176, 27);
		add(comboBox);
		
		JLabel lblSelectTemplate = new JLabel("Select Template");
		lblSelectTemplate.setBounds(400, 88, 134, 16);
		add(lblSelectTemplate);
		
		JTextArea txtrTemplateView = new JTextArea();
		txtrTemplateView.setText("Template View...");
		txtrTemplateView.setBounds(400, 200, 307, 307);
		add(txtrTemplateView);
		
		JButton btnNewTemplate = new JButton("New Template");
		btnNewTemplate.setBounds(400, 600, 117, 29);
		add(btnNewTemplate);
		
		JButton btnCretate = new JButton("Cretate");
		btnCretate.setBounds(605, 600, 117, 29);
		add(btnCretate);
		
		btnBack = new JButton("back");
		btnBack.setBounds(900, 88, 117, 29);
		add(btnBack);
		

	}
	
	public JButton getBtnBack () {
		return btnBack;
	}

}
