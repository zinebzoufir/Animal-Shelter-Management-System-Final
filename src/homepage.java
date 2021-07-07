
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.*;

public class homepage extends JFrame {

    static homepage frame;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;





    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    homepage frame = new homepage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /*public void windowClosing() {
        System.exit(0);
    }*/

    /**
     * Create the frame.
     */

    public homepage() {
        setTitle("Page de connexion");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1003, 675);
        contentPane = new JPanel();
        contentPane.setBorder(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Nom d'utilisateur");
        lblNewLabel.setBounds(694, 204, 144, 25);
        lblNewLabel.setFont(new Font("Dubai", Font.PLAIN, 15));
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Mot de passe");
        lblNewLabel_1.setBounds(728, 262, 110, 16);
        lblNewLabel_1.setFont(new Font("Dubai", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(854, 209, 123, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(854, 263, 123, 19);
        contentPane.add(passwordField);

        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("admin1","admin1");
        hmap.put("admin2","admin2");
        hmap.put("admin3","admin3");

        Identifiants<String,String> id = new Identifiants<String,String>();
      
        id.put("root","root");

        JButton button = new JButton("Se connecter");
        button.setBounds(755, 342, 162, 35);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.PINK);
        button.setFont(new Font("Dubai", Font.PLAIN, 14));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (hmap.containsKey(textField.getText()) && hmap.get(textField.getText()).equals(passwordField.getText()) || (id.containsKey(textField.getText()) && id.get(textField.getText()).equals(passwordField.getText())))
                {
                    homepage.super.hide();
                    LoginSuccess.main(new String[] {});

                }
                else
                    JOptionPane.showMessageDialog(null, "Mot de passe ou nom d'utilisateur erron\u00E9");
            }
        });

        contentPane.add(button);


       JButton buttonWho = new JButton("About");
        buttonWho.setBounds(900, 580, 100, 35);
        buttonWho.setForeground(Color.BLACK);
        buttonWho.setBackground(Color.PINK);
        buttonWho.setFont(new Font("Noto Sans CJK SC Black", Font.PLAIN, 10));
        buttonWho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                About ppf = new About("About");
                ppf.setVisible(true);
            }
        });


        contentPane.add(buttonWho);




        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon(System.getProperty("user.dir")+"/images/Login page.PNG"));
        lblNewLabel_2.setBounds(-313, 0, 983, 647);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Gestion d'un refuge \r\n");
        lblNewLabel_3.setFont(new Font("Yu Gothic", Font.PLAIN, 27));
        lblNewLabel_3.setBounds(701, 35, 298, 99);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("animalier");
        lblNewLabel_4.setFont(new Font("Yu Gothic", Font.PLAIN, 27));
        lblNewLabel_4.setBounds(768, 105, 128, 44);
        contentPane.add(lblNewLabel_4);
    }
}