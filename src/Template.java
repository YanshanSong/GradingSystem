import java.util.ArrayList;

public class Template {
    private ArrayList<Task> tasks;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void newTask(){
        this.tasks.add(new Task());
    }

    public ArrayList<String> summary(){
        ArrayList<String> summaries = new ArrayList<>();
        for(Task task: tasks){
            summaries.add(task.getName() + " - " + task.getSubTasks().size());
        }
        return summaries;
    }

    Template(ArrayList<Task> tasks, int id){
        this.tasks = tasks;
        this.id = id;
    }

    Template(int id){
        tasks = new ArrayList<>();
        this.id = id;
    }
}
