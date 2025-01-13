package Schuhe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Schuhe {
    private JLabel lb_VintageShoes;
    private JComboBox cb_Auswahl;
    private JLabel lb_Suche;
    private JButton bt_Suchen;
    private JComboBox cb_Marke;
    private JComboBox cb_Farbe;
    private JComboBox cb_Groesse;
    private JLabel lb_Farbe;
    private JTextField tf_Preis;
    private JCheckBox checkb_Material;

    //Konstruktor
    public Schuhe() {
        JFrame myPanel = new JFrame("Vintage Store");
        myPanel.setTitle("Vinatge Store");
        myPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel.setSize(800, 600);
        myPanel.setContentPane(myPanel);
        myPanel.setResizable(false);
        myPanel.setVisible(true);
        myPanel.setLayout(null);

            bt_Suchen.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            checkb_Material.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }
    }

