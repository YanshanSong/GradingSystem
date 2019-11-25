import javax.swing.*;
import java.awt.Font;
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
		textField.setBounds(610, 320, 180, 30);
		add(textField);
		textField.setColumns(10);

		String imagePath = "/image/bank.png";
		ImageIcon imageIcon = new ImageIcon(imagePath);
		JLabel label = new JLabel();
		label.setIcon(imageIcon);
		label.setBounds(200, 200, 200, 200);
		add(label);
		
		JLabel lblUserName = new JLabel("Username:");
		lblUserName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblUserName.setBounds(410, 320, 115, 26);
		add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPassword.setBounds(410, 410, 96, 16);
		add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(610, 410, 180, 30);
		add(textField_1);
		
		loginInButton = new JButton("Login In");
		loginInButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		loginInButton.setBounds(510, 496, 180, 50);
		add(loginInButton);
		
		changePWDButton = new JButton("Change Password");
		changePWDButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
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
