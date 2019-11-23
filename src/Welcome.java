import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Welcome extends JPanel {
	private JButton loginButton;

	/**
	 * Create the panel.
	 */
	public Welcome() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 1200, 800);
		setLayout(null);
		
		JLabel label = new JLabel("Welcome");
		label.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 30));
		label.setForeground(Color.BLUE);
		label.setBounds(527, 275, 145, 50);
		add(label);
		
		JLabel lblGradingSystem = new JLabel("Grading System");
		lblGradingSystem.setForeground(Color.BLUE);
		lblGradingSystem.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 30));
		lblGradingSystem.setBounds(474, 350, 251, 50);
		add(lblGradingSystem);
		
		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		loginButton.setBounds(540, 450, 120, 50);
		add(loginButton);
	}

	public JButton getLoginButton() {
		return loginButton;
	}
}
