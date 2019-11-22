import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GradingSystem extends JFrame {

	private JPanel contentPane;
	private Welcome welcome;
	private MainScreen mainScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradingSystem frame = new GradingSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GradingSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set the frame centered
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		int width = 1200;
		int height = 800;
		setBounds(screenWidth/2 - width/2, screenHeight/2 - height/2, width, height);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		getContentPane().add(welcome = new Welcome());
		getContentPane().add(mainScreen = new MainScreen());

		welcome.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                welcome.setVisible(false);
                mainScreen.setVisible(true);
            }
        });
	}

}
