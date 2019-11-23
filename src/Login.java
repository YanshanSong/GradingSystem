import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class Login extends JPanel {
	private JButton loginInButton;
	private JButton changePWDButton;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Login() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 1200, 800);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(610, 300, 180, 30);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("Username:");
		lblUserName.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblUserName.setBounds(410, 300, 115, 26);
		add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPassword.setBounds(410, 400, 96, 16);
		add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(610, 395, 180, 30);
		add(textField_1);
		
		loginInButton = new JButton("Login In");
		loginInButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		loginInButton.setBounds(510, 496, 180, 50);
		add(loginInButton);
		
		changePWDButton = new JButton("Change Password");
		changePWDButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		changePWDButton.setBounds(510, 576, 180, 50);
		add(changePWDButton);
	}

	public JButton getLoginInButton() {
		return loginInButton;
	}

	public JButton getChangePWDButton() {
		return changePWDButton;
	}
}
