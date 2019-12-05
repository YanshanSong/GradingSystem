import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TabbedDisplay extends JPanel {

    TabbedDisplay(ArrayList<Component> components, ArrayList<String> names, Component top){
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        JTabbedPane jTabbedPane = new JTabbedPane();

        for(int i = 0;i<components.size();i++){
            jTabbedPane.addTab(names.get(i), null, components.get(i));
        }

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(0,0,50,0);
        this.add(top, c);
        c = new GridBagConstraints();
        c.gridy = 1;
        this.add(jTabbedPane, c);
    }
}
