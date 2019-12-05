import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDisplay{
	private ArrayList<Component> components;
	private ArrayList<String> strings;
	private JPanel top;

	public ArrayList<String> getStrings() {
		return strings;
	}

	public void setStrings(ArrayList<String> strings) {
		this.strings = strings;
	}

	public ArrayList<Component> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<Component> components) {
		this.components = components;
	}

	public JPanel getTop() {
		return top;
	}

	public void setTop(JPanel top) {
		this.top = top;
	}

	public UserDisplay(User user) {
		String[] top_buttons = new String[]{"Logout"};
		components = new ArrayList<>();
		strings = new ArrayList<>();

		top = new JPanel(new BorderLayout());
		JLabel jLabel = new JLabel("Hello " + user.getUsername() + "!");
		jLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		top.add(jLabel, BorderLayout.LINE_START);

		ActionListener actionListener = actionEvent -> {
			if(actionEvent.getActionCommand().equals("Logout")){
				GradingSystem.logout();
			}
		};

		ArrayList<Component> comps = new ArrayList<>();
		for(String s: top_buttons){
			JButton jButton = new JButton(s);
			jButton.addActionListener(actionListener);
			comps.add(jButton);
		}

		ButtonOptions buttonOptions = new ButtonOptions(comps);
		top.add(buttonOptions, BorderLayout.LINE_END);

		strings.add("Active Courses");
		strings.add("Past Courses");
		strings.add("Templates");
		ArrayList<Course> courses = user.getCourses();

		ArrayList<Course> active = new ArrayList<>();
		ArrayList<Course> past = new ArrayList<>();
		for(Course course: courses){
			if(course.isActive()) active.add(course);
			else past.add(course);
		}
		String[] options = {"Add Course", "Delete Course"};
		CardListView activeCourses = new CardListView();
		activeCourses.courseCards(active, options, "Course-");
		components.add(activeCourses);

		CardListView pastCourses = new CardListView();
		pastCourses.courseCards(past, options, "Course-");
		components.add(pastCourses);

		options = new String[]{"Add Template", "Modify Template", "Delete Template"};
		CardListView templates = new CardListView();
		int height = (int) (GradingSystem.getHeight() * 0.7);
		int width = (int) (GradingSystem.getWidth() * 0.9);
		templates.templateCards(user.getTemplates(), options, "Template-", height, width, null);
		components.add(templates);
	}
}
