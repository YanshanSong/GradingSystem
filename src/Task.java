import java.util.ArrayList;
import java.util.Date;

public class Task {
    private float weight;
    private String name;
    private ArrayList<Task> subTasks;
    private float sum = 0;
    private Date deadline;

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(ArrayList<Task> subTasks) {
        this.subTasks = subTasks;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public Task(float weight, String name){
        this.weight = weight;
        this.deadline = null;
        this.name = name;
    }

    public Task(float weight, String name, Date deadline){
        this.weight = weight;
        this.name = name;
        this.deadline = deadline;
    }

    public boolean isValid(){
        if(this.sum != 100) return false;
        return true;
    }

    public void addSubTask(String name, float weight, Date deadline){
        this.sum += weight;
        this.subTasks.add(new Task(weight, name, deadline));
    }

    public void removeSubTask(int id){
        this.sum -= weight;
        this.subTasks.remove(id);
    }
}
