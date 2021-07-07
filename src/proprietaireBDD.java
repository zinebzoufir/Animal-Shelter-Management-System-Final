import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class proprietaireBDD extends LoginSuccess{

    private JFrame frame;
    private JTextField FirstName;
    private JTextField LastName;
    private JTextField sex;
    private JTextField age;
    private JTextField CIN;
    private JTextField PhoneNumber;
    private JTextField AnimalAdopte;
    private JTable table;
    DefaultTableModel model;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    proprietaireBDD window = new proprietaireBDD();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public proprietaireBDD() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Base de donn\u00E9es des propri\u00E9taires");
        frame.setBounds(100, 100, 1084, 654);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Pr\u00E9nom");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel.setBounds(27, 130, 120, 26);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblCIN = new JLabel("Code Identit\u00E9 Nationale");
        lblCIN.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblCIN.setBounds(27, 168, 120, 26);
        frame.getContentPane().add(lblCIN);

        JLabel lblNewLabel_1_1 = new JLabel("Sexe");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_1.setBounds(27, 204, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("Age");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_2.setBounds(27, 240, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_2);

        JLabel lblNewLabel_1_3 = new JLabel("N° de Telephone");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_3.setBounds(27, 276, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_3);

        JLabel lblNewLabel_1_6 = new JLabel("ID Animal adopt\u00E9");
        lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_6.setBounds(27, 312, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_6);

        FirstName = new JTextField();
        FirstName.setColumns(10);
        FirstName.setBounds(244, 137, 153, 19);
        frame.getContentPane().add(FirstName);

        LastName = new JTextField();
        LastName.setColumns(10);
        LastName.setBounds(244, 175, 153, 19);
        frame.getContentPane().add(LastName);

        CIN = new JTextField();
        CIN.setColumns(10);
        CIN.setBounds(244, 283, 153, 19);
        frame.getContentPane().add(CIN);

        sex = new JTextField();
        sex.setColumns(10);
        sex.setBounds(244, 211, 153, 19);
        frame.getContentPane().add(sex);

        age = new JTextField();
        age.setColumns(10);
        age.setBounds(244, 247, 153, 19);
        frame.getContentPane().add(age);

        PhoneNumber = new JTextField();
        PhoneNumber.setColumns(10);
        PhoneNumber.setBounds(244, 319, 153, 19);
        frame.getContentPane().add(PhoneNumber);


        JLabel lblNewLabel_1_12_1 = new JLabel("Nom");
        lblNewLabel_1_12_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_12_1.setBounds(27, 94, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_12_1);

        AnimalAdopte = new JTextField();
        AnimalAdopte.setColumns(10);
        AnimalAdopte.setBounds(244, 101, 153, 19);
        frame.getContentPane().add(AnimalAdopte);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(407, 28, 653, 579);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = table.getSelectedRow();
                AnimalAdopte.setText(model.getValueAt(i,0).toString());
                FirstName.setText(model.getValueAt(i,1).toString());
                LastName.setText(model.getValueAt(i,2).toString());
                sex.setText(model.getValueAt(i,3).toString());
                age.setText(model.getValueAt(i,4).toString());
                CIN.setText(model.getValueAt(i,5).toString());
                PhoneNumber.setText(model.getValueAt(i,6).toString());
            }
        });
        table.setBackground(UIManager.getColor("Button.light"));
        model = new DefaultTableModel();
        Object[] column = {"Nom", "Pr\u00E9nom","CIN", "Sexe","Age","N° de Telephone","ID Animal Adopt\u00E9"};
        final Object[] row = new Object[7];
        model.setColumnIdentifiers(column);
        table.setModel(model);
        scrollPane.setViewportView(table);

        model.addRow(new Object[]{"Laila", "Allam", "BE******", "F", "20", "0612345678", "1"});
        model.addRow(new Object[]{"Zineb", "Zoufir", "BE******", "F", "20", "0612345678", "5"});
        model.addRow(new Object[]{"Latifa", "Hammani", "BE******", "F", "20", "0612345678", "9"});

        JButton btnNewButton = new JButton("Ajouter");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (AnimalAdopte.getText().equals("") || FirstName.getText().equals("") || LastName.getText().equals("") || sex.getText().equals("") || age.getText().equals("") || CIN.getText().equals("") ||PhoneNumber.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,  "Veuillez remplir tous les champs");
                }
                else {

                    row[0] =AnimalAdopte.getText();
                    row[1] = FirstName.getText();
                    row[2] = LastName.getText();
                    row[3] = sex.getText();
                    row[4] = age.getText();
                    row[5] = CIN.getText();
                    row[6] =PhoneNumber.getText();
                    model.addRow(row);


                    AnimalAdopte.setText("");
                    FirstName.setText("");
                    LastName.setText("");
                    sex.setText("");
                    age.setText("");
                    CIN.setText("");
                    PhoneNumber.setText("");
                    JOptionPane.showMessageDialog(null,  "Propri\u00E9taire ajout\u00E9 avec succ\u00e8s !");


                }



            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.setBounds(20, 411, 164, 42);
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBackground(Color.PINK);
        frame.getContentPane().add(btnNewButton);

        JButton btnMettreJour = new JButton("Mettre \u00E0 jour");
        btnMettreJour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                model.setValueAt(AnimalAdopte.getText(), i, 0);
                model.setValueAt(FirstName.getText(), i, 1);
                model.setValueAt(LastName.getText(), i, 2);
                model.setValueAt(sex.getText(), i, 3);
                model.setValueAt(age.getText(), i, 4);
                model.setValueAt(CIN.getText(), i, 5);
                model.setValueAt(PhoneNumber.getText(), i, 6);

                JOptionPane.showMessageDialog(null,  "Informations mises \u00E0 jour avec succ\u00e8s !");
            }
        });
        btnMettreJour.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnMettreJour.setBounds(225, 411, 164, 42);
        btnMettreJour.setForeground(Color.BLACK);
        btnMettreJour.setBackground(Color.PINK);
        frame.getContentPane().add(btnMettreJour);

        JButton btnback = new JButton("Page principale");
        btnback.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnback.setBounds(20, 476, 164, 42);
        btnback.setForeground(Color.BLACK);
        btnback.setBackground(Color.PINK);
        frame.getContentPane().add(btnback);
        btnback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginSuccess.main(new String[] {});
                proprietaireBDD.super.hide();
                frame.dispose();

            }
        });

        JButton btnSupprimer = new JButton("Supprimer");
        btnSupprimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                if (i>=0) {
                    model.removeRow(i);
                    JOptionPane.showMessageDialog(null,  "Propri\u00E9taire supprim\u00E9 avec succ\u00e8s !");
                }
                else {
                    JOptionPane.showMessageDialog(null,  "Veuillez s\u00E9lectionner une ligne");
                }
            }

        });
        btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSupprimer.setBounds(225, 476, 164, 42);
        btnSupprimer.setForeground(Color.BLACK);
        btnSupprimer.setBackground(Color.PINK);
        frame.getContentPane().add(btnSupprimer);

    }

}