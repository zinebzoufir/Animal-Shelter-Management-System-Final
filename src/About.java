import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends homepage{
    private JLabel filiere;
    private JLabel brought;
    private JLabel LA;
    private JPanel rootPanel;
    private JLabel d;
    private JPanel logo;

    JFrame whoAreWe = new JFrame();
    public About(String title){
        setTitle(title);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(400, 400, 400, 400);
        this.setContentPane(rootPanel);
        this.pack();

    }
}
