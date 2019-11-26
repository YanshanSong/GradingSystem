import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GradingSystem extends JFrame {

	private JPanel contentPane;
	private Welcome welcome;
	private Login login;
	private MainScreen mainScreen;
	private CourseView courseView;
	private TaskView taskView;
	private GradingView gradingView;
	private NewCourseView newCourseView;
	private NewTemplateView newTemplateView;
	private StudentView studentView;

	/**
	 * Create the frame.
	 */
	public GradingSystem() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");

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
		getContentPane().add(login = new Login());
		getContentPane().add(mainScreen = new MainScreen());
		getContentPane().add(courseView = new CourseView());
		getContentPane().add(taskView = new TaskView());
		getContentPane().add(studentView = new StudentView());
		getContentPane().add(newTemplateView = new NewTemplateView());
		getContentPane().add(gradingView = new GradingView());
		getContentPane().add(newCourseView = new NewCourseView());

		welcome.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                welcome.setVisible(false);
                login.setVisible(true);
            }
        });

		login.getLoginInButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				login.setVisible(false);
				mainScreen.setVisible(true);
			}
		});

		mainScreen.getLogOutButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainScreen.setVisible(false);
				login.setVisible(true);
			}
		});

		mainScreen.getACViewButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainScreen.setVisible(false);
				courseView.setVisible(true);
			}
		});

		mainScreen.getPCViewButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainScreen.setVisible(false);
				courseView.setVisible(true);
			}
		});

		mainScreen.getTViewButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainScreen.setVisible(false);
				newTemplateView.setVisible(true);
			}
		});

		// new task
		courseView.getNewTaskButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				courseView.setVisible(false);
				newTemplateView.setVisible(true);
			}
		});

		courseView.getBackButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				courseView.setVisible(false);
				mainScreen.setVisible(true);
			}
		});

		courseView.getATViewButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				courseView.setVisible(false);
				taskView.getStatusLabel().setText("Active");
				taskView.setVisible(true);
			}
		});

		courseView.getPTViewButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				courseView.setVisible(false);
				taskView.getStatusLabel().setText("Past");
				taskView.setVisible(true);
			}
		});

		courseView.getATViewButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				courseView.setVisible(false);
				taskView.setVisible(true);
			}
		});

		courseView.getUTViewButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				courseView.setVisible(false);
				taskView.getStatusLabel().setText("Upcoming");
				taskView.setVisible(true);
			}
		});

		courseView.getStudentsButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				courseView.setVisible(false);
				studentView.setVisible(true);
			}
		});

		taskView.getBackButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				taskView.setVisible(false);
				courseView.setVisible(true);
			}
		});
		
		taskView.getGradeButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				taskView.setVisible(false);
				gradingView.setVisible(true);
			}
		});

		newTemplateView.getBackButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				newTemplateView.setVisible(false);
				courseView.setVisible(true);
			}
		});

		studentView.getBackButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				studentView.setVisible(false);
				courseView.setVisible(true);
			}
		});
		
		
		gradingView.getBtnBack().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gradingView.setVisible(false);
				taskView.setVisible(true);
			}
		});

		taskView.getGradeButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				taskView.setVisible(false);
				gradingView.setVisible(true);
			}
		});

	}

}
