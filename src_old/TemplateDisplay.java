import java.util.ArrayList;

public class TemplateDisplay {
    private CardListView right, left;
    private String[] options;

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public CardListView getLeft() {
        return left;
    }

    public CardListView getRight(){
        return right;
    }

    TemplateDisplay(Template template, int index){
        options = new String[]{"Save", "Back", "Logout"};

        String[] taskOptions = new String[]{"Add Task", "Delete Task"};
        left = new CardListView();
        left.taskCards(template.getTasks(), "Tasks-" + template.getId() + "-", taskOptions);

        right = new CardListView();
        if(index == -1) right.taskCards(new ArrayList<>(), "SubTasks-" + template.getId() + "-" + index + "-", taskOptions);
        else right.taskCards(template.getTasks().get(index).getSubTasks(), "SubTasks-" + template.getId() + "-" + index + "-", taskOptions);
    }
}
