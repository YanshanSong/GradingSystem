import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class TemplateDisplay extends JPanel{
    private CardListView right, left;
    private ArrayList<Component> options;
    private ArrayList<ArrayList<JTextField>> left_boxes, right_boxes;
    private int selected_left, selected_right;
    private Template template;
    private int index;
    private String[] taskOptions;
    private JLabel error;
    private JLabel title;

    public ArrayList<Component> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Component> options) {
        this.options = options;
    }

    public CardListView getLeft() {
        return left;
    }

    public CardListView getRight(){
        return right;
    }

    private MouseAdapter mouseAdapter = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            JPanel jPanel = (JPanel) e.getSource();
            String[] s = jPanel.getName().split("-");
            selected_left = -1;
            selected_right = -1;
            if(jPanel.getName().contains("SubTasks")) {
                selected_right = Integer.parseInt(s[3]);
            }
            else {
                index = Integer.parseInt(s[2]);
                updateDisplay();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseEntered(e);
            JPanel jPanel = (JPanel) e.getSource();
            jPanel.setBackground(Color.RED);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            super.mouseExited(e);
            JPanel jPanel = (JPanel) e.getSource();
            jPanel.setBackground(Color.WHITE);
        }
    };

    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().contains("Add Task")){
                String[] sp = e.getActionCommand().split(":")[1].split("-");
                int template_id = Integer.parseInt(sp[1]);
                if(sp[0].equals("Tasks")){
                    GradingSystem.newTask(template_id);
                }
                else{
                    int task_id = Integer.parseInt(sp[2]);
                    GradingSystem.newSubTask(template_id, task_id);
                }
            }
            else if(e.getActionCommand().contains("Delete Task")){
                String[] sp = e.getActionCommand().split(":")[1].split("-");
                int template_id = Integer.parseInt(sp[1]);
                if(sp[0].equals("Tasks")){
                    if(index == -1){
                        error.setText("Please select a task to delete");
                    }
                    else {
                        GradingSystem.deleteTask(template_id, index);
                        index = -1;
                    }
                }
                else{
                    int task_id = Integer.parseInt(sp[2]);
                    if(selected_right > -1) {
                        GradingSystem.deleteSubTask(template_id, task_id, selected_right);
                        selected_right = -1;
                    }
                    else error.setText("Please select a task to delete");
                }
            }
            else if(e.getActionCommand().equals("Save")){
                error.setText("");
                float sum = 0;
                ArrayList<Task> tasks = template.getTasks();
                for(int i = 0;i<tasks.size();i++){
                    ArrayList<JTextField> jTextFields = left_boxes.get(i);
                    String name_old = tasks.get(i).getName();
                    Float weight_old = tasks.get(i).getWeight();
                    String name_new = jTextFields.get(0).getText();
                    Float weight_new = Float.valueOf(jTextFields.get(1).getText());
                    sum += weight_old;
                    if(name_new.equals(name_old) && weight_new.equals(weight_old)) continue;
                    tasks.get(i).setName(name_new);
                    tasks.get(i).setWeight(weight_new);
                    sum += weight_new - weight_old;
                }
                if(sum != 100) {
                    error.setText("Please ensure all weights sum to 100");
                    return;
                }
                sum = 0;
                if(index == -1){
                    GradingSystem.updateTemplate(-1, template.getId(), tasks, null);
                }
                else{
                    ArrayList<Task> subTasks = tasks.get(index).getSubTasks();
                    for(int i = 0;i<subTasks.size();i++){
                        ArrayList<JTextField> jTextFields = right_boxes.get(i);
                        String name_old = subTasks.get(i).getName();
                        Float weight_old = subTasks.get(i).getWeight();
                        String name_new = jTextFields.get(0).getText();
                        Float weight_new = Float.valueOf(jTextFields.get(1).getText());
                        sum += weight_old;
                        if(name_new.equals(name_old) && weight_new.equals(weight_old)) continue;
                        subTasks.get(i).setName(name_new);
                        subTasks.get(i).setWeight(weight_new);
                        sum += weight_new - weight_old;
                    }
                    if(sum != 100) {
                        error.setText("Please ensure all weights sum to 100");
                        return;
                    }
                    GradingSystem.updateTemplate(index, template.getId(), tasks, subTasks);
                }
            }
            updateDisplay();
        }
    };

    void updateDisplay(){
        Point saved = left.getScrollPane().getViewport().getViewPosition();
        left_boxes = left.taskCards(template.getTasks(), "Tasks-" + template.getId() + "-", taskOptions, actionListener, mouseAdapter);
        if(index == -1) right_boxes = right.taskCards(new ArrayList<>(), "SubTasks-" + template.getId() + "-" + index + "-", null, actionListener, mouseAdapter);
        else right_boxes = right.taskCards(template.getTasks().get(index).getSubTasks(), "SubTasks-" + template.getId() + "-" + index + "-", taskOptions, actionListener, mouseAdapter);
        this.revalidate();
        this.repaint();

        left.getScrollPane().getViewport().setViewPosition(saved);
    }

    TemplateDisplay(Template template, int index){
        this.template = template;
        this.index = index;
        this.error = new JLabel("");
        String[] options_string = new String[]{"Save", "Back", "Logout"};
        options = new ArrayList<>();
        options.add(this.error);
        for(String s: options_string){
            JButton jButton = new JButton(s);
            jButton.addActionListener(actionListener);
            options.add(jButton);
        }

        taskOptions = new String[]{"Add Task", "Delete Task"};
        left = new CardListView();
        left_boxes = left.taskCards(template.getTasks(), "Tasks-" + template.getId() + "-", taskOptions, actionListener, mouseAdapter);
        right = new CardListView();
        if(index == -1) right_boxes = right.taskCards(new ArrayList<>(), "SubTasks-" + template.getId() + "-" + index + "-", null, actionListener, mouseAdapter);
        else right_boxes = right.taskCards(template.getTasks().get(index).getSubTasks(), "SubTasks-" + template.getId() + "-" + index + "-", taskOptions, actionListener, mouseAdapter);
        setDisplay();
    }

    void setDisplay(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        JPanel top = new JPanel(new BorderLayout());
        title = new JLabel("Templates");
        top.add(title, BorderLayout.LINE_START);

        ArrayList<Component> components = new ArrayList<>(options);
        ButtonOptions buttonOptions = new ButtonOptions(components);

        top.add(buttonOptions, BorderLayout.LINE_END);

        c.anchor = GridBagConstraints.PAGE_START;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(0,0,50,0);
        this.add(top, c);

        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10,0,0,0);
        c.gridwidth = 1;

        left.setMinimumSize(new Dimension((int) (GradingSystem.getWidth() * 0.4), (int) (GradingSystem.getHeight() * 0.7)));
        this.add(left, c);
        c.gridx += 1;
        right.setMinimumSize(new Dimension((int) (GradingSystem.getWidth() * 0.4), (int) (GradingSystem.getHeight() * 0.7)));
        this.add(right, c);
    }
}
