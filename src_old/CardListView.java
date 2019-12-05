import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class CardListView extends JPanel {

    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
//            int pos = jTable.getSelectedRow();
//            title.setText(title.getName());
//            if(pos < 0 && (!actionEvent.getActionCommand().contains("Pay")
//                    && !actionEvent.getActionCommand().contains("Request")
//                    && !actionEvent.getActionCommand().contains("Get Report"))){
//                title.setText("Please select a row");
//            }
//            else GradingSystem.tableButtonPress(actionEvent.getActionCommand(), jTable);
        }
    };

    private MouseAdapter mouseAdapter = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            JPanel jPanel = (JPanel) e.getSource();
            GradingSystem.cardPress(jPanel.getName());
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


    public void templateCards(ArrayList<Template> templates, String[] options, String prefix){
        this.setLayout(new BorderLayout());
        JPanel root = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 0;
        c.gridx = 0;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        int i = 0;
        for(Template template: templates){
            JPanel jPanel = new JPanel(new GridBagLayout());
            GridBagConstraints c_sub = new GridBagConstraints();
            c_sub.fill = GridBagConstraints.HORIZONTAL;
            c_sub.gridy = 0;
            c_sub.gridx = 0;
            for(String s: template.summary()){
                jPanel.add(new JLabel(s), c_sub);
                c_sub.gridy += 1;
            }
            jPanel.addMouseListener(mouseAdapter);
            jPanel.setBorder(blackline);
            jPanel.setBackground(Color.WHITE);
            jPanel.setName(prefix + i);
            jPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jPanel.setPreferredSize(new Dimension((int) (GradingSystem.getWidth() * 0.9), 100));
            root.add(jPanel, c);
            c.gridy += 1;
        }
        JScrollPane jScrollPane = new JScrollPane(root, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setPreferredSize(new Dimension((int) (GradingSystem.getWidth() * 0.9), (int) (GradingSystem.getHeight() * 0.7)));
        this.add(jScrollPane, BorderLayout.PAGE_START);

        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout());
        if(options != null){
            for(String s: options){
                JButton jButton = new JButton(s);
                jButton.setActionCommand(s);
                jButton.addActionListener(actionListener);
                buttons.add(jButton);
            }
            this.add(buttons, BorderLayout.PAGE_END);
        }
    }

    public void courseCards(ArrayList<Course> courses, String[] options, String prefix){
        this.setLayout(new BorderLayout());
        JPanel root = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 0;
        c.gridx = 0;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        for(Course course: courses){
            JPanel jPanel = new JPanel(new BorderLayout());
            jPanel.add(new JLabel(course.getName()), BorderLayout.PAGE_START);
            jPanel.add(new JLabel(course.getCode()), BorderLayout.PAGE_END);
            jPanel.addMouseListener(mouseAdapter);
            jPanel.setBorder(blackline);
            jPanel.setBackground(Color.WHITE);
            jPanel.setName(prefix + course.getCode());
            jPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jPanel.setPreferredSize(new Dimension((int) (GradingSystem.getWidth() * 0.9), 100));
            root.add(jPanel, c);
            c.gridy += 1;
        }
        JScrollPane jScrollPane = new JScrollPane(root, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setPreferredSize(new Dimension((int) (GradingSystem.getWidth() * 0.9), (int) (GradingSystem.getHeight() * 0.7)));
        this.add(jScrollPane, BorderLayout.PAGE_START);

        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout());
        if(options != null){
            for(String s: options){
                JButton jButton = new JButton(s);
                jButton.setActionCommand(s);
                jButton.addActionListener(actionListener);
                buttons.add(jButton);
            }
            this.add(buttons, BorderLayout.PAGE_END);
        }
    }

    public void taskCards(ArrayList<Task> tasks, String prefix, String[] options){
        this.setLayout(new BorderLayout());
        JPanel root = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 0;
        c.gridx = 0;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        for(Task task: tasks){
            JPanel jPanel = new JPanel(new BorderLayout());
            jPanel.add(new JLabel(task.getName()), BorderLayout.PAGE_START);
            jPanel.add(new JLabel(String.valueOf(task.getWeight())), BorderLayout.PAGE_END);
            jPanel.addMouseListener(mouseAdapter);
            jPanel.setBorder(blackline);
            jPanel.setBackground(Color.WHITE);
            jPanel.setName(prefix + tasks.indexOf(task));
            jPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jPanel.setPreferredSize(new Dimension((int) (GradingSystem.getWidth() * 0.9), 100));
            root.add(jPanel, c);
            c.gridy += 1;
        }
        JScrollPane jScrollPane = new JScrollPane(root, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setPreferredSize(new Dimension((int) (GradingSystem.getWidth() * 0.9), (int) (GradingSystem.getHeight() * 0.7)));
        this.add(jScrollPane, BorderLayout.NORTH);

        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout());
        if(options != null){
            for(String s: options){
                JButton jButton = new JButton(s);
                jButton.setActionCommand(s);
                jButton.addActionListener(actionListener);
                buttons.add(jButton);
            }
            this.add(buttons, BorderLayout.SOUTH);
        }
    }

    public void taskCards(ArrayList<Task> tasks, String prefix){
        this.setLayout(new BorderLayout());
        JPanel root = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 0;
        c.gridx = 0;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        for(Task task: tasks){
            JPanel jPanel = new JPanel(new BorderLayout());
            jPanel.add(new JLabel(task.getName()), BorderLayout.PAGE_START);
            jPanel.add(new JLabel(String.valueOf(task.getWeight())), BorderLayout.PAGE_END);
            jPanel.addMouseListener(mouseAdapter);
            jPanel.setBorder(blackline);
            jPanel.setBackground(Color.WHITE);
            jPanel.setName(prefix + tasks.indexOf(task));
            jPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jPanel.setPreferredSize(new Dimension((int) (GradingSystem.getWidth() * 0.9), 100));
            root.add(jPanel, c);
            c.gridy += 1;
        }
        JScrollPane jScrollPane = new JScrollPane(root, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setPreferredSize(new Dimension((int) (GradingSystem.getWidth() * 0.9), (int) (GradingSystem.getHeight() * 0.7)));
        this.add(jScrollPane, BorderLayout.PAGE_START);
    }
}
