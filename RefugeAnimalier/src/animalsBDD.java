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
import java.util.Random;

public class animalsBDD extends LoginSuccess{

    public JFrame frame;
    private JTextField type;
    private JTextField race;
    private JTextField sex;
    private JTextField age;
    private JTextField vaccin;
    private JTextField castration;
    private JTextField id;
    private JTable table;
    DefaultTableModel model;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    animalsBDD window = new animalsBDD();
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
    public animalsBDD() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Base de donn\u00E9es des animaux");
        frame.setBounds(100, 100, 1084, 654);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Type");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel.setBounds(27, 130, 120, 26);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblRace = new JLabel("Race");
        lblRace.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblRace.setBounds(27, 168, 120, 26);
        frame.getContentPane().add(lblRace);

        JLabel lblNewLabel_1_1 = new JLabel("Sexe");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_1_1.setBounds(27, 204, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("Age");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_1_2.setBounds(27, 240, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_2);

        JLabel lblNewLabel_1_3 = new JLabel("Vaccin\u00E9(e)");
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_1_3.setBounds(27, 276, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_3);

        JLabel lblNewLabel_1_6 = new JLabel("Castration");
        lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_1_6.setBounds(27, 312, 120, 26);
        frame.getContentPane().add(lblNewLabel_1_6);

        type = new JTextField();
        type.setColumns(10);
        type.setBounds(244, 137, 153, 19);
        frame.getContentPane().add(type);

        race = new JTextField();
        race.setColumns(10);
        race.setBounds(244, 175, 153, 19);
        frame.getContentPane().add(race);

        sex = new JTextField();
        sex.setColumns(10);
        sex.setBounds(244, 211, 153, 19);
        frame.getContentPane().add(sex);

        age = new JTextField();
        age.setColumns(10);
        age.setBounds(244, 247, 153, 19);
        frame.getContentPane().add(age);

        vaccin = new JTextField();
        vaccin.setColumns(10);
        vaccin.setBounds(244, 283, 153, 19);
        frame.getContentPane().add(vaccin);

        castration = new JTextField();
        castration.setColumns(10);
        castration.setBounds(244, 319, 153, 19);
        frame.getContentPane().add(castration);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(407, 28, 653, 579);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = table.getSelectedRow();
                type.setText(model.getValueAt(i,1).toString());
                race.setText(model.getValueAt(i,2).toString());
                sex.setText(model.getValueAt(i,3).toString());
                age.setText(model.getValueAt(i,4).toString());
                vaccin.setText(model.getValueAt(i,5).toString());
                castration.setText(model.getValueAt(i,6).toString());
            }
        });
        table.setBackground(UIManager.getColor("Button.light"));
        model = new DefaultTableModel();
        Object[] column = {"ID_Animal","Type","Race","Sexe","Age","Vaccin\u00E9(e)","Castration"};
        final Object[] row = new Object[7];
        model.setColumnIdentifiers(column);
        table.setModel(model);
        scrollPane.setViewportView(table);

        model.addRow(new Object[]{"1","Cat",	"Domestic Shorthair Mix",	"Male","7 months",	"Yes", 	"No"});
        model.addRow(new Object[]{"2","Dog",  	"Border Collie Mix",		"Female","4 weeks",	"No",	"No"});
        model.addRow(new Object[]{"3","Dog",	"Pit Bull Mix",				"Male",	"2 months",	"Yes", 	"No"});
        model.addRow(new Object[]{"4","Dog",	"Saluki",					"Male",	"2 years",	"Yes", 	"Yes"});
        model.addRow(new Object[]{"5","Cat",	"Snowshoe Mix",				"Male",	"2 months",	"No",	"No"});
        model.addRow(new Object[]{"6","Dog",	"Pit Bull Mix",				"Female",	"5 months",	"No",	"No"});
        model.addRow(new Object[]{"7","Dog",	"Pit Bull Mix",				"Female",	"2 years",	"Yes",	"Yes"});
        model.addRow(new Object[]{"8","Cat",	"Siamese Mix",				"Female",	"2 years",	"Yes", "Yes"});
        model.addRow(new Object[]{"9","Dog",	"Anatol Shepherd Mix",		"Male",	"3 months",	"No",	"No"});
        model.addRow(new Object[]{"10","Dog",	"Pekingese Mix",			"Male",	"3 years",	"Yes",	"No"});
        model.addRow(new Object[]{"11","Dog",	"Chihuahua Shorthair",		"Female",	"2 years",	"Yes", "Yes"});
        model.addRow(new Object[]{"12","Cat",	"Domestic Shorthair Mix",	"Female",	"3 weeks",	"No", "No"});

        JButton btnNewButton = new JButton("Ajouter");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (type.getText().equals("") || race.getText().equals("") || sex.getText().equals("") || age.getText().equals("") || vaccin.getText().equals("") || castration.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,  "Veuillez remplir tous les champs");
                }
                else {

                    row[0] = String.valueOf(model.getRowCount()+1);
                    row[1] = type.getText();
                    row[2] = race.getText();
                    row[3] = sex.getText();
                    row[4] = age.getText();
                    row[5] = vaccin.getText();
                    row[6] = castration.getText();
                    model.addRow(row);


                    id.setText("");
                    type.setText("");
                    race.setText("");
                    sex.setText("");
                    age.setText("");
                    vaccin.setText("");
                    castration.setText("");
                    JOptionPane.showMessageDialog(null,  "Animal ajout\u00E9 avec succ\u00e8s !");
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
                model.setValueAt(id.getText(), i, 0);
                model.setValueAt(type.getText(), i, 1);
                model.setValueAt(race.getText(), i, 2);
                model.setValueAt(sex.getText(), i, 3);
                model.setValueAt(age.getText(), i, 4);
                model.setValueAt(vaccin.getText(), i, 5);
                model.setValueAt(castration.getText(), i, 6);

                JOptionPane.showMessageDialog(null,  "Informations mises \u00E0 jour avec succ\u00e8s !");
            }
        });
        btnMettreJour.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnMettreJour.setBounds(225, 411, 164, 42);
        btnMettreJour.setForeground(Color.BLACK);
        btnMettreJour.setBackground(Color.PINK);
        frame.getContentPane().add(btnMettreJour);

        JButton btnSupprimer = new JButton("Supprimer");
        btnSupprimer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                if (i>=0) {
                    model.removeRow(i);
                    JOptionPane.showMessageDialog(null,  "Animal supprim\u00E9 avec succ\u00e8s !");
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

        JButton btnback = new JButton("Page principale");
        btnback.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnback.setBounds(20, 476, 164, 42);
        btnback.setForeground(Color.BLACK);
        btnback.setBackground(Color.PINK);
        frame.getContentPane().add(btnback);
        btnback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginSuccess.main(new String[] {});
                animalsBDD.super.hide();
                frame.dispose();
            }
        });
    }
}