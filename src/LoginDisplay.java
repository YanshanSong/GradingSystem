import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginDisplay{
	private JButton loginInButton;
	private JButton changePWDButton;
	private JLabel jLabel;
	private JTextField user_name;
	private JPasswordField password;
	private ArrayList<Component> components;

	private ActionListener actionListener = actionEvent -> {
		if(actionEvent.getActionCommand().equals("Back")){
			GradingSystem.welcome();
		}
		if(actionEvent.getActionCommand().equals("Login")){
			int flag = 0;
			String username = user_name.getText();
			String pass = String.valueOf(password.getPassword());
			jLabel.setText("Login");
			String error = "Login";
			if(username.length() == 0 || username.equals(user_name.getName())){
				flag = 1;
				error = "Username cannot be empty";
			}
			else if(pass.length() == 0 || pass.equals(password.getName())){
				flag = 1;
				error = "Password cannot be empty";
			}

			if(flag == 0){
				boolean response = GradingSystem.login(username, pass);
				if(!response){
					flag = 1;
					error = "Wrong details";
				}
			}
			if(flag == 1){
				jLabel.setText(error);
			}
		}
	};

	public ArrayList<Component> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<Component> components) {
		this.components = components;
	}

	/**
	 * Create the panel.
	 */
	public LoginDisplay() {

		components = new ArrayList<>();

		JLabel imgLabel = new JLabel("");
		String imagePath = System.getProperty("user.dir") + "/img/bu.jpg";
		ImageIcon imageIcon = new ImageIcon(imagePath);
		imgLabel.setIcon(imageIcon);
		components.add(imgLabel);

		jLabel = new JLabel("Login");
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);

		components.add(jLabel);

		user_name = new JTextField(20);
		user_name.setName("Please enter your username");
		user_name.setText(user_name.getName());
		user_name.addFocusListener(GradingDisplay.focusListenerText);

		components.add(user_name);

		password = new JPasswordField(20);
		password.addFocusListener(GradingDisplay.focusListenerPassword);
		password.setName("Please enter your password");
		password.setEchoChar((char)0);
		password.setText(password.getName());

		components.add(password);
		
		loginInButton = new JButton("Login");
		loginInButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		loginInButton.addActionListener(actionListener);
		components.add(loginInButton);
		
		changePWDButton = new JButton("Change Password");
		changePWDButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		changePWDButton.addActionListener(actionListener);
		components.add(changePWDButton);
	}

	public JButton getLoginInButton() {
		return loginInButton;
	}

	public JButton getChangePWDButton() {
		return changePWDButton;
	}
}
