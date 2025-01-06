import javax.swing.*;
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
        setTitle("Vinatge Store");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setContentPane(myPanel);
        setVisible(true);
        setResizable(false);

        //Grupperung der Buttons
        ButtonGroup gruppierung = new ButtonGroup();
        gruppierung.add(rb_Damen);
        gruppierung.add(rb_Herren);


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
