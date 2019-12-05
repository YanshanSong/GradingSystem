import java.awt.*;
import javax.swing.*;

public class GradingDisplay extends JFrame{
    private JPanel jPanelTopLeft, jPanelTopRight, jPanelBottomLeft, jPanelBottomRight;


    /**
     * Create the frame.
     */
    public GradingDisplay(int width, int height) {
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        jPanelTopLeft = new JPanel();
		jPanelTopLeft.setLayout(new BorderLayout());
		ScaleIcon scaleIcon1 = new ScaleIcon(new ImageIcon("img/BU-logo.png"));
		JLabel jLabel1 = new JLabel(scaleIcon1);
		jPanelTopLeft.add(jLabel1, BorderLayout.CENTER);

		jPanelTopRight = new JPanel();
		jPanelTopRight.setLayout(new BorderLayout());
		ScaleIcon scaleIcon2 = new ScaleIcon(new ImageIcon("img/Charles-River.jpg"));
		JLabel jLabel2 = new JLabel(scaleIcon2);
		jPanelTopRight.add(jLabel2, BorderLayout.CENTER);

		JSplitPane jSplitPanelTop = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jPanelTopLeft, jPanelTopRight);
		jSplitPanelTop.setEnabled(false);
    }
}
