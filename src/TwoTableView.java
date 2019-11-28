import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class TwoTableView extends JPanel {

    TwoTableView(CardListView left, CardListView right, String title, String[] options){
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        JPanel top = new JPanel(new BorderLayout());
        top.add(new JLabel(title), BorderLayout.LINE_START);

        ArrayList<Component> components = new ArrayList<>();
        for(String s: options){
            JButton jButton = new JButton(s);
//            jButton.addActionListener(actionListener);
            components.add(jButton);
        }

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
