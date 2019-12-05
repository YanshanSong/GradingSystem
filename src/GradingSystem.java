import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GradingSystem {
    private static GradingSystemBackend gradingSystemBackend;
    private static GradingDisplay gradingDisplay;

    private static int height = 720;
    private static int width = 1280;

    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }

    public static void start() throws Exception {
        User user = new User("CPK", "123", 0);
        ArrayList<User> users = new ArrayList<>();
        String sem = "F19";
        users.add(user);

        gradingSystemBackend = new GradingSystemBackend(users, "Grading System", sem);
        gradingDisplay = new GradingDisplay(gradingSystemBackend, width, height);
        gradingSystemBackend.login("CPK", "123");
        gradingDisplay.user(gradingSystemBackend.getCurrentUser());
    }

    public static void login_interface(){
        gradingDisplay.login();
    }

    public static void user_interface(){
        gradingDisplay.user(gradingSystemBackend.getCurrentUser());
    }

    public static void course_template_interface(Course course){
        gradingDisplay.modify_course(course, -1);
    }

    public static void course_interface(Course course){
        gradingDisplay.course(course);
    }

    public static void template_interface(Template template){
        gradingDisplay.template(template, -1);
    }

    public static void template_interface(Template template, int index){
        gradingDisplay.template(template, index);
    }

    public static void welcome(){
        gradingDisplay.welcome();
    }

    public static void updateTemplate(int index, int template_id, ArrayList<Task> tasks, ArrayList<Task> subTasks){
        gradingSystemBackend.updateTemplate(index, template_id, tasks, subTasks);
    }

    public static void updateCourseTemplate(Course course, int index, ArrayList<Task> tasks, ArrayList<Task> subTasks){
        gradingSystemBackend.updateCourseTemplate(course, index, tasks, subTasks);
    }

    public static boolean login(String username, String pass){
        User user = gradingSystemBackend.login(username, pass);
        if(user == null) return false;
        gradingDisplay.user(user);
        return true;
    }

    public static void changePassword_interface(){

    }

    public static void tableButtonPress(String actionCommand, JTable jTable) {

    }

    public static void newTask(int id){
        gradingSystemBackend.newTask(id);
    }

    public static void newCourseTask(Course course){
        gradingSystemBackend.newCourseTask(course);
    }

    public static void newCourseSubTask(Course course, int index){
        gradingSystemBackend.newCourseSubTask(course, index);
    }

    public static void logout(){
        gradingSystemBackend.logout();
        gradingDisplay.login();
    }

    public static void newCourseEmpty(String name, String code, String sem){
        Course course = gradingSystemBackend.newCourseEmpty(name, code, sem);
        gradingDisplay.modify_course(course, -1);
    }

    public static void newCourse(Template template, String name, String code, String sem){
        gradingSystemBackend.newCourse(template, name, code, sem);
        gradingDisplay.user(gradingSystemBackend.getCurrentUser());
    }

    public static void newSubTask(int id, int index){
        gradingSystemBackend.newSubTask(id, index);
    }

    public static void deleteTask(int template_id, int id){
        gradingSystemBackend.deleteTask(template_id, id);
    }

    public static void deleteSubTask(int template_id, int id, int index){
        gradingSystemBackend.deleteSubTask(template_id, id, index);
    }

    public static void deleteCourseTask(Course course, int id){
        gradingSystemBackend.deleteCourseTask(course, id);
    }

    public static void deleteCourseSubTask(Course course, int id, int index){
        gradingSystemBackend.deleteCourseSubTask(course, id, index);
    }

    public static void buttonPress(String command){
        if(command.equals("Add Course")){
            gradingDisplay.new_course(gradingSystemBackend.getCurrentUser().getTemplates());
            gradingSystemBackend.newCourse();
        }
    }

    public static void cardPress(String command){
        if(command.contains("Course")){
            String code = command.replace("Course-", "");
            ArrayList<Course> courses = gradingSystemBackend.getCurrentUser().getCourses();
            Course select = null;
            for(Course course: courses){
                if(course.getCode().equals(code)){
                    select = course;
                    break;
                }
            }
            course_interface(select);
        }
        else if(command.contains("Template")){
            int index = command.lastIndexOf("-");
            index = Integer.parseInt(command.substring(index + 1));
            template_interface(gradingSystemBackend.getCurrentUser().getTemplates().get(index));
        }
        else if(command.contains("Tasks-")){
            String[] strings = command.split("-");
            Template template = gradingSystemBackend.getCurrentUser().getTemplates().get(Integer.parseInt(strings[1]));
            template_interface(template, Integer.parseInt(strings[2]));
        }
    }
}
