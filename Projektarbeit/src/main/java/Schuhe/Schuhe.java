package Schuhe;

import javax.swing.*;
import java.awt.*;
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
    private JPanel myPanel;

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

    private void initialisieren () {
        JFrame myPanel = new JFrame();
        myPanel.getContentPane().setBackground(new Color(150, 186, 227));
        myPanel.setBounds(100,100,725,800);
        myPanel.getContentPane().setLayout(null);
    }

    public void objektHinzufügen () {
        try {

            if (!tf_Preis.getText().matches("//d*//.?//d+")) {
                throw new Exception("Bitte geben Sie einen gültigen Preis ein");
            }

        } catch (Exception e){

            JOptionPane.showMessageDialog(myPanel, "Bitte geben Sie einen gültigen Preis ein", "Ungültige Eingabe", JOptionPane.ERROR_MESSAGE);

        }

        try {
            if (cb_Auswahl.getSelectedItem().toString().isEmpty() || cb_Groesse.getSelectedItem().toString().isEmpty() || tf_Preis.getText().isEmpty()) {
                throw new Exception("Bitte füllen Sie die bestimmten Felder (Wonach suchst du, Größe und Preis) aus");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(myPanel, "Bitte füllen sie die bestimmten Felder (Wonach suchst du, Größe und Preis) aus", "Ungültige Eingabe", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void initObjekte () {

    }

    public void ausgeben () {

    }

    public void felderLeeren () {

        cb_Auswahl.getSelectedIndex(0);
        cb_Marke.getSelectedIndex(0);
        cb_Farbe.getSelectedIndex(0);
        cb_Groesse.getSelectedItem();
        tf_Preis.setText(" ");
        checkb_Material.setSelected(false);

    }

    public void loeschen () {


    }
}

