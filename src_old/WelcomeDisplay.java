import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class WelcomeDisplay {
	private JButton loginButton;
	private JButton changePass;
	private ArrayList<Component> components;

	public ArrayList<Component> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<Component> components) {
		this.components = components;
	}

	/**
	 * Create the panel.
	 */
	public WelcomeDisplay() {
		components = new ArrayList<>();

		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				if(actionEvent.getActionCommand().equals("Login")){
					GradingSystem.login_interface();
				}
			}
		};
		
		JLabel label = new JLabel("Welcome");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		label.setForeground(Color.BLUE);
		components.add(label);
		
		JLabel lblGradingSystem = new JLabel("Grading System");
		lblGradingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblGradingSystem.setForeground(Color.BLUE);
		lblGradingSystem.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		components.add(lblGradingSystem);
		
		loginButton = new JButton("Login");
		loginButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		loginButton.addActionListener(actionListener);
		components.add(loginButton);
	}

	public JButton getLoginButton() {
		return loginButton;
	}
}
