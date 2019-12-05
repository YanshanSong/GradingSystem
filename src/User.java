import java.util.ArrayList;
import java.util.Date;

public class User {
    private String username;
    private Integer id;
    private String pass;
    private ArrayList<Template> templates;
    private ArrayList<Course> courses;

    public ArrayList<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(ArrayList<Template> templates) {
        this.templates = templates;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public User(String username, String pass, int id){
        this.templates = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.username = username;
        this.pass = pass;
        this.id = id;
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Aaron", "123"));
        ArrayList<Task> tasks = new ArrayList<>();
        ArrayList<Task> homeworks = new ArrayList<>();
        homeworks.add(new Task(50, "HW1"));
        homeworks.add(new Task(50, "HW2"));
        Task hw = new Task(50, "Homework");
        hw.setSubTasks(homeworks);
        tasks.add(hw);
        ArrayList<Task> quizzes = new ArrayList<>();
        quizzes.add(new Task(50, "Quiz1"));
        quizzes.add(new Task(50, "Quiz2"));
        Task quiz = new Task(50, "Quiz");
        quiz.setSubTasks(quizzes);
        tasks.add(quiz);
        this.templates.add(new Template(tasks, this.templates.size()));
        this.courses.add(new Course("Java", students, "CS591", "F19", templates.get(0)));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
