import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Welcome extends JPanel {

	/**
	 * Create the panel.
	 */
	public Welcome() {
		setForeground(Color.BLUE);
		// set the frame centered
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		int width = 1200;
		int height = 800;
		setBounds(screenWidth/2 - width/2, screenHeight/2 - height/2, width, height);
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(494, 5, 117, 29);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("123132123");
		lblNewLabel.setBounds(616, 9, 90, 20);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		add(lblNewLabel);
	}

}
