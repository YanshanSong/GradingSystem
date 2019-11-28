//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.FocusEvent;
//import java.awt.event.FocusListener;
//
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//
//public class GradingDisplayTemp extends JFrame {
//	private int width;
//	private int height;
//	private JPanel rootPanel;
//
//	public static FocusListener focusListenerText = new FocusListener() {
//		@Override
//		public void focusGained(FocusEvent focusEvent) {
//			JTextField jTextField = (JTextField) focusEvent.getSource();
//			if(jTextField.getText().equals(jTextField.getName())) jTextField.setText("");
//		}
//
//		@Override
//		public void focusLost(FocusEvent focusEvent) {
//			JTextField jTextField = (JTextField) focusEvent.getSource();
//			if(jTextField.getText().length() == 0){
//				jTextField.setText(jTextField.getName());
//			}
//		}
//	};
//
//	public static FocusListener focusListenerPassword = new FocusListener() {
//		@Override
//		public void focusGained(FocusEvent focusEvent) {
//			JPasswordField jPasswordField = (JPasswordField) focusEvent.getSource();
//			String pass = String.valueOf(jPasswordField.getPassword());
//			if(pass.equals(jPasswordField.getName())){
//				jPasswordField.setEchoChar('*');
//				jPasswordField.setText("");
//			}
//		}
//
//		@Override
//		public void focusLost(FocusEvent focusEvent) {
//			JPasswordField jPasswordField = (JPasswordField) focusEvent.getSource();
//			String pass = String.valueOf(jPasswordField.getPassword());
//			if(pass.length() == 0){
//				jPasswordField.setEchoChar((char)0);
//				jPasswordField.setText(jPasswordField.getName());
//			}
//		}
//	};
//
//	private JPanel contentPane;
//	private WelcomeDisplay welcomeDisplay;
//	private LoginDisplay loginDisplay;
//	private MainScreen mainScreen;
//	private CourseView courseView;
//	private TaskView taskView;
//	private GradingView gradingView;
//	private NewCourseView newCourseView;
//	private NewTemplateView newTemplateView;
//	private StudentView studentView;
//
//	public void changeDisplay(JPanel jPanel){
//		this.rootPanel.removeAll();
//		this.rootPanel.add(jPanel, BorderLayout.CENTER);
//		this.rootPanel.revalidate();
//		this.rootPanel.repaint();
//	}
//
//	public void welcome(){
//
//	}
//	/**
//	 * Create the frame.
//	 */
//	public GradingDisplayTemp(GradingSystemBackend gradingSystemBackend, int width, int height) throws Exception {
//		this.width = width;
//		this.height = height;
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setTitle(gradingSystemBackend.getName());
//		this.setVisible(true);
//		this.setSize(width, height);
//		this.rootPanel = new JPanel();
//		this.rootPanel.setSize(width, height);
//		this.rootPanel.setLayout(new BorderLayout());
//		this.add(rootPanel);
//
//		this.welcome();
//		// javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//
//		// set the frame centered
//		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
//		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
//
//		setBounds(screenWidth/2 - width/2, screenHeight/2 - height/2, width, height);
//
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(new CardLayout(0, 0));
//
////		getContentPane().add(welcomeDisplay = new WelcomeDisplay());
//		getContentPane().add(loginDisplay = new LoginDisplay());
//		getContentPane().add(mainScreen = new MainScreen());
//		getContentPane().add(courseView = new CourseView());
//		getContentPane().add(taskView = new TaskView());
//		getContentPane().add(studentView = new StudentView());
//		getContentPane().add(newTemplateView = new NewTemplateView());
//		getContentPane().add(gradingView = new GradingView());
//		getContentPane().add(newCourseView = new NewCourseView());
//
//		welcomeDisplay.getLoginButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                welcomeDisplay.setVisible(false);
//                loginDisplay.setVisible(true);
//            }
//        });
//
//		loginDisplay.getLoginInButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				loginDisplay.setVisible(false);
//				mainScreen.setVisible(true);
//			}
//		});
//
//		mainScreen.getLogOutButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				mainScreen.setVisible(false);
//				loginDisplay.setVisible(true);
//			}
//		});
//
//		mainScreen.getACViewButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				mainScreen.setVisible(false);
//				courseView.setVisible(true);
//			}
//		});
//
//		mainScreen.getPCViewButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				mainScreen.setVisible(false);
//				courseView.setVisible(true);
//			}
//		});
//
//		mainScreen.getTViewButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				mainScreen.setVisible(false);
//				newTemplateView.setVisible(true);
//			}
//		});
//
//		mainScreen.getACAddButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				mainScreen.setVisible(false);
//				newCourseView.setVisible(true);
//			}
//		});
//
//		newCourseView.getBtnBack().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				newCourseView.setVisible(false);
//				mainScreen.setVisible(true);
//			}
//		});
//
//		// new task
//		courseView.getNewTaskButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				courseView.setVisible(false);
//				newTemplateView.setVisible(true);
//			}
//		});
//
//		courseView.getBackButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				courseView.setVisible(false);
//				mainScreen.setVisible(true);
//			}
//		});
//
//		courseView.getATViewButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				courseView.setVisible(false);
//				taskView.getStatusLabel().setText("Active");
//				taskView.setVisible(true);
//			}
//		});
//
//		courseView.getPTViewButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				courseView.setVisible(false);
//				taskView.getStatusLabel().setText("Past");
//				taskView.setVisible(true);
//			}
//		});
//
//		courseView.getATViewButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				courseView.setVisible(false);
//				taskView.setVisible(true);
//			}
//		});
//
//		courseView.getUTViewButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				courseView.setVisible(false);
//				taskView.getStatusLabel().setText("Upcoming");
//				taskView.setVisible(true);
//			}
//		});
//
//		courseView.getStudentsButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				courseView.setVisible(false);
//				studentView.setVisible(true);
//			}
//		});
//
//		taskView.getBackButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				taskView.setVisible(false);
//				courseView.setVisible(true);
//			}
//		});
//
//		taskView.getGradeButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				taskView.setVisible(false);
//				gradingView.setVisible(true);
//			}
//		});
//
//		newTemplateView.getBackButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				newTemplateView.setVisible(false);
//				courseView.setVisible(true);
//			}
//		});
//
//		studentView.getBackButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				studentView.setVisible(false);
//				courseView.setVisible(true);
//			}
//		});
//
//
//		gradingView.getBtnBack().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				gradingView.setVisible(false);
//				taskView.setVisible(true);
//			}
//		});
//
//		taskView.getGradeButton().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				taskView.setVisible(false);
//				gradingView.setVisible(true);
//			}
//		});
//
//	}
//
//}
