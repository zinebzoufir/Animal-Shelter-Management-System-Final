import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginSuccess extends JFrame {
    static LoginSuccess frame;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginSuccess frame = new LoginSuccess();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginSuccess() {
        setTitle("Page d'administration");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1003, 675);
        contentPane = new JPanel();
        contentPane.setBorder(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Bienvenue !");
        lblNewLabel.setBounds(672, 43, 317, 89);
        lblNewLabel.setFont(new Font("Sitka Display", Font.PLAIN, 60));
        contentPane.add(lblNewLabel);

        JButton btnAnimaux = new JButton("Base de donn\u00E9es Animaux");
        btnAnimaux.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnAnimaux.setForeground(Color.BLACK);
        btnAnimaux.setBackground(Color.PINK);
        btnAnimaux.setBounds(646, 176, 335, 76);
        btnAnimaux.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginSuccess.super.hide();
                animalsBDD.main(new String[] {});

            }
        });
        contentPane.add(btnAnimaux);

        JButton btnProprietaires = new JButton("Base de donn\u00E9es Propri\u00E9taires");
        btnProprietaires.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnProprietaires.setForeground(Color.BLACK);
        btnProprietaires.setBackground(Color.PINK);
        btnProprietaires.setBounds(646, 302, 335, 76);
        btnProprietaires.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginSuccess.super.hide();
                proprietaireBDD.main(new String[] {});

            }
        });
        contentPane.add(btnProprietaires);

        JButton btnSeDeconnecter = new JButton("Se d\u00E9connecter");
        btnSeDeconnecter.setForeground(Color.BLACK);
        btnSeDeconnecter.setBackground(Color.PINK);
        btnSeDeconnecter.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnSeDeconnecter.setBounds(646, 428, 335, 63);
        btnSeDeconnecter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginSuccess.super.hide();
                homepage.main(new String[] {});


            }
        });
        contentPane.add(btnSeDeconnecter);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon(System.getProperty("user.dir")+"/images/Menu.png"));
        lblNewLabel_1.setBounds(0, 0, 636, 691);
        contentPane.add(lblNewLabel_1);
    }

}
