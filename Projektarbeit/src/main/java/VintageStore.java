import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VintageStore extends JFrame{

    //Deklaration der GUI-Komponenten
    private JPanel myPanel;
    private JRadioButton rb_Damen;
    private JRadioButton rb_Herren;
    private JComboBox cb_Auswahl;
    private JLabel lb_Suche;
    private JButton bt_Suchen;

    //Konstruktor
    public VintageStore () {
        JFrame myPanel = new JFrame("Vintage Store");
        myPanel.setTitle("Vinatge Store");
        myPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel.setSize(800, 600);
        myPanel.setContentPane(myPanel);
        myPanel.setResizable(false);
        myPanel.setVisible(true);
        myPanel.setLayout(null);

        //Radio Buttons Erstellen
        JRadioButton rb_Damen = new JRadioButton("Damen");
        JRadioButton rb_Herren = new JRadioButton("Herren");

        //Grupperung der Buttons
        ButtonGroup geschlechtgruppierung = new ButtonGroup();
        geschlechtgruppierung.add(rb_Damen);
        geschlechtgruppierung.add(rb_Herren);

        myPanel.add(rb_Damen);
        myPanel.add(rb_Herren);


        rb_Damen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        rb_Herren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bt_Suchen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bt_Suchen.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
    }
}
