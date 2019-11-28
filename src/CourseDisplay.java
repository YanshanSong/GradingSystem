import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CourseDisplay{
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

	public CourseDisplay(Course course) {
		String[] top_buttons = new String[]{"Back", "Logout"};
		components = new ArrayList<>();
		strings = new ArrayList<>();

		top = new JPanel(new BorderLayout());
		JLabel jLabel = new JLabel(course.getCode() + " - " + course.getSem());
		jLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		top.add(jLabel, BorderLayout.LINE_START);

		ActionListener actionListener = actionEvent -> {
			GradingSystem.buttonPress(actionEvent.getActionCommand());
		};

		ArrayList<Component> comps = new ArrayList<>();
		for (String s : top_buttons) {
			JButton jButton = new JButton(s);
			jButton.addActionListener(actionListener);
			comps.add(jButton);
		}

		ButtonOptions buttonOptions = new ButtonOptions(comps);
		top.add(buttonOptions, BorderLayout.LINE_END);

		strings.add("Active Taks");
		strings.add("Past Tasks");
		strings.add("Upcoming Tasks");
		ArrayList<Task> tasks = course.getTemplate().getTasks();

		ArrayList<Task> active = new ArrayList<>();
		ArrayList<Task> past = new ArrayList<>();
		ArrayList<Task> upcoming = new ArrayList<>();
		for (Task task: tasks) {
			if(task.getSubTasks().size() == 0) continue;
			for(Task subTask: task.getSubTasks()){
				active.add(subTask);
				past.add(subTask);
				upcoming.add(subTask);
			}
		}
		CardListView activeTasks = new CardListView();
		activeTasks.taskCards(active, "ActiveTasks-");
		components.add(activeTasks);

		CardListView pastTasks = new CardListView();
		pastTasks.taskCards(past, "PastTasks-");
		components.add(pastTasks);

		CardListView upcomingTasks = new CardListView();
		upcomingTasks.taskCards(upcoming, "UpcomingTasks-");
		components.add(upcomingTasks);
	}
}
