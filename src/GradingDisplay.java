import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class GradingDisplay extends JFrame {
    private int width;
    private int height;
    private JPanel rootPanel;

    public static FocusListener focusListenerText = new FocusListener() {
        @Override
        public void focusGained(FocusEvent focusEvent) {
            JTextField jTextField = (JTextField) focusEvent.getSource();
            if(jTextField.getText().equals(jTextField.getName())) jTextField.setText("");
        }

        @Override
        public void focusLost(FocusEvent focusEvent) {
            JTextField jTextField = (JTextField) focusEvent.getSource();
            if(jTextField.getText().length() == 0){
                jTextField.setText(jTextField.getName());
            }
        }
    };

    public static FocusListener focusListenerPassword = new FocusListener() {
        @Override
        public void focusGained(FocusEvent focusEvent) {
            JPasswordField jPasswordField = (JPasswordField) focusEvent.getSource();
            String pass = String.valueOf(jPasswordField.getPassword());
            if(pass.equals(jPasswordField.getName())){
                jPasswordField.setEchoChar('*');
                jPasswordField.setText("");
            }
        }

        @Override
        public void focusLost(FocusEvent focusEvent) {
            JPasswordField jPasswordField = (JPasswordField) focusEvent.getSource();
            String pass = String.valueOf(jPasswordField.getPassword());
            if(pass.length() == 0){
                jPasswordField.setEchoChar((char)0);
                jPasswordField.setText(jPasswordField.getName());
            }
        }
    };

    public void changeDisplay(JPanel jPanel){
        this.rootPanel.removeAll();
        this.rootPanel.add(jPanel, BorderLayout.CENTER);
        this.rootPanel.revalidate();
        this.rootPanel.repaint();
    }

    public void welcome(){
        WelcomeDisplay welcomeDisplay = new WelcomeDisplay();
        FormDisplay formDisplay = new FormDisplay(welcomeDisplay.getComponents());
        this.changeDisplay(formDisplay);
    }

    public void user(User user){
        UserDisplay userDisplay = new UserDisplay(user);
        TabbedDisplay tabbedDisplay = new TabbedDisplay(userDisplay.getComponents(), userDisplay.getStrings(), userDisplay.getTop());
        this.changeDisplay(tabbedDisplay);
    }

    public void login(){
        LoginDisplay loginDisplay = new LoginDisplay();
        FormDisplay formDisplay = new FormDisplay(loginDisplay.getComponents());
        this.changeDisplay(formDisplay);
    }

    public void template(Template template, int index){
        TemplateDisplay templateDisplay = new TemplateDisplay(template, index);
        TwoTableView twoTableView = new TwoTableView(templateDisplay.getLeft(), templateDisplay.getRight(), "Template", templateDisplay.getOptions());
        this.changeDisplay(twoTableView);
    }

    public void course(Course course){
        CourseDisplay courseDisplay = new CourseDisplay(course);
        TabbedDisplay tabbedDisplay = new TabbedDisplay(courseDisplay.getComponents(), courseDisplay.getStrings(), courseDisplay.getTop());
        this.changeDisplay(tabbedDisplay);
    }
    /**
     * Create the frame.
     */
    public GradingDisplay(GradingSystemBackend gradingSystemBackend, int width, int height) throws Exception {
        this.width = width;
        this.height = height;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(gradingSystemBackend.getName());
        this.setVisible(true);
        this.setSize(width, height);
        this.rootPanel = new JPanel();
        this.rootPanel.setSize(width, height);
        this.rootPanel.setLayout(new BorderLayout());
        this.add(rootPanel);

        this.welcome();
    }
}