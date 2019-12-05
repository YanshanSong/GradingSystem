import java.util.ArrayList;
import java.util.Date;

public class GradingSystemBackend {
    private ArrayList<User> users;
    private String name;
    private User currentUser;
    private String sem;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public void addTask(int index){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deleteTask(int template_id, int id){
        currentUser.getTemplates().get(template_id).getTasks().remove(id);
    }

    public void deleteSubTask(int template_id, int id, int index){
        currentUser.getTemplates().get(template_id).getTasks().get(id).getSubTasks().remove(index);
    }

    public User login(String username, String pass){
        for(User user: this.users){
            if(user.getUsername().equals(username) && user.getPass().equals(pass)) {
                currentUser = user;
                return user;
            }
        }
        return null;
    }

    public void newTask(int template_id){
        currentUser.getTemplates().get(template_id).newTask();
    }

    public void newSubTask(int template_id, int index){
        currentUser.getTemplates().get(template_id).getTasks().get(index).addSubTask("Name",0, new Date());
    }

    public Template getTemplate(int index){
        return currentUser.getTemplates().get(index);
    }

    public void updateTemplate(int index, int template_id, ArrayList<Task> tasks, ArrayList<Task> subTasks){
        Template template = currentUser.getTemplates().get(template_id);
        template.setTasks(tasks);
        if(index > -1) template.getTasks().get(index).setSubTasks(subTasks);
    }

    GradingSystemBackend(ArrayList<User> users, String name, String sem){
        this.sem = sem;
        this.users = users;
        this.name = name;
    }
}
