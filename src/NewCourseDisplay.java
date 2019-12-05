import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class NewCourseDisplay extends JPanel {
    private JTextField name;
    private JTextField code;
    private JTextField sem;
    private JLabel header;
    private CardListView templatesList;
    ArrayList<Template> templates;
    private int selection;

    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            header.setText(header.getName());
            if(e.getActionCommand().equals("Create from selected template")){
                if(selection == -1){
                    header.setText("Please select a template");
                    return;
                }
                GradingSystem.newCourse(templates.get(selection), name.getText(), code.getText(), sem.getText());
            }
            else{
                GradingSystem.newCourseEmpty(name.getText(), code.getText(), sem.getText());
            }
        }
    };

    private MouseAdapter mouseAdapter = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JPanel jPanel = (JPanel) e.getSource();
            String[] name = jPanel.getName().split("-");
            selection = Integer.parseInt(name[1]);
        }
    };

    public NewCourseDisplay(ArrayList<Template> templates){
        this.templates = templates;
        this.setLayout(new GridBagLayout());
        selection = -1;
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 0;
        header = new JLabel("Create New Course");
        header.setName("Create New Course");
        this.add(header, c);

        c.gridy += 1;
        name = new JTextField(30);
        name.addFocusListener(GradingDisplay.focusListenerText);
        name.setName("Course Name");
        name.setText("Course Name");
        this.add(name, c);

        c.gridy += 1;
        c.insets = new Insets(20, 0,0,0);
        code = new JTextField(30);
        code.addFocusListener(GradingDisplay.focusListenerText);
        code.setName("Course Code");
        code.setText("Course Code");
        this.add(code, c);

        c.gridy += 1;
        sem = new JTextField(30);
        sem.addFocusListener(GradingDisplay.focusListenerText);
        sem.setName("Semester");
        sem.setText("Semester");
        this.add(sem, c);

        templatesList = new CardListView();
        int height = (int) (GradingSystem.getHeight() * 0.4);
        int width = (int) (GradingSystem.getWidth() * 0.4);
        templatesList.templateCards(templates, null, "Template-", height, width, mouseAdapter);

        c.gridy += 1;
        this.add(templatesList, c);

        c.gridy += 1;
        JButton create = new JButton("Create from selected template");
        create.addActionListener(actionListener);
        this.add(create, c);

        JButton createEmpty = new JButton("Empty Template");
        createEmpty.addActionListener(actionListener);
        c.gridy += 1;
        this.add(createEmpty, c);
    }
}
