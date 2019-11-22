import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	private Welcome welcome;
	private TaskView taskView;
	private GradingView gradingView;
	private NewCourseView newCourseView;
	private NewTemplateView newTemplateView;
	private StudentView studentView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
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
		
		getContentPane().add(gradingView = new GradingView());
		getContentPane().add(studentView = new StudentView());
		getContentPane().add(newTemplateView = new NewTemplateView());
		getContentPane().add(newCourseView = new NewCourseView());
		
		
		
		getContentPane().add(taskView = new TaskView());
		
		
	}

}
