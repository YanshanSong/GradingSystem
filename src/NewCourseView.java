import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class NewCourseView extends JPanel {

	/**
	 * Create the panel.
	 */
	public NewCourseView() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(356, 84, 176, 27);
		add(comboBox);
		
		JLabel lblSelectTemplate = new JLabel("Select Template");
		lblSelectTemplate.setBounds(224, 88, 134, 16);
		add(lblSelectTemplate);
		
		JTextArea txtrTemplateView = new JTextArea();
		txtrTemplateView.setText("Template View...");
		txtrTemplateView.setBounds(224, 152, 307, 212);
		add(txtrTemplateView);
		
		JButton btnNewTemplate = new JButton("New Template");
		btnNewTemplate.setBounds(224, 406, 117, 29);
		add(btnNewTemplate);
		
		JButton btnCretate = new JButton("Cretate");
		btnCretate.setBounds(415, 406, 117, 29);
		add(btnCretate);

	}

}
