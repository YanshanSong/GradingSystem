import java.util.ArrayList;

public class Course{
    private String name;
    private ArrayList<Student> students;
    private String code;
    private String sem;
    private ArrayList<Task> tasks;
    private boolean active;

    public void setTemplate(Template template){
        tasks = template.getTasks();
    }

    public ArrayList<Task> getTasks(){
        return tasks;
    }

    Course(String name, ArrayList<Student> students, String code, String sem, Template template){
        this.name = name;
        this.students = students;
        this.code = code;
        this.sem = sem;
        this.active = true;
        this.tasks = new ArrayList<>();
        this.tasks.addAll(template.getTasks());
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
