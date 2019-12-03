import java.util.ArrayList;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    GradingSystemBackend(ArrayList<User> users, String name, String sem){
        this.sem = sem;
        this.users = users;
        this.name = name;
    }
}
