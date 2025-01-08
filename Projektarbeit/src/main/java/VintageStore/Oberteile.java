package VintageStore;

/*
public class Oberteile {

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class BekleidungsShop {

        // Erstes Fenster mit Damen und Oberteilen Auswahl
        public static void main(String[] args) {
            // Erstellen des ersten Fensters
            JFrame fenster1 = new JFrame("Bekleidungs Shop");
            fenster1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fenster1.setSize(400, 300);

            // Erstellen eines Panels für die Auswahl
            JPanel panel = new JPanel();

            // Buttons für die Auswahl von Damen und Oberteilen
            JButton damenButton = new JButton("Damen");
            JButton oberteileButton = new JButton("Oberteile");

            // ActionListener für den Damen Button
            damenButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Öffne das zweite Fenster
                    new OberteileFenster();
                }
            });

            // ActionListener für den Oberteile Button
            oberteileButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Öffne das zweite Fenster
                    new OberteileFenster();
                }
            });

            // Füge Buttons zum Panel hinzu
            panel.add(damenButton);
            panel.add(oberteileButton);

            // Setze das Panel und zeige das Fenster
            fenster1.add(panel);
            fenster1.setVisible(true);
        }

        // Zweites Fenster für die Auswahl der Oberteile mit Größen und Preisen
        public static class OberteileFenster {
            public OberteileFenster() {
                // Neues Fenster für Oberteile
                JFrame fenster2 = new JFrame("Oberteile Auswahl");
                fenster2.setSize(400, 300);

                // Erstellen des Panels für Oberteil-Optionen
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

                // Erstellen von Buttons für die Unterkategorien T-Shirt, Pulli, Jacke
                JButton tshirtButton = new JButton("T-Shirt - Größe: M, Preis: 19,99 €");
                JButton pulliButton = new JButton("Pulli - Größe: L, Preis: 29,99 €");
                JButton jackeButton = new JButton("Jacke - Größe: XL, Preis: 49,99 €");

                // ActionListener für die Buttons
                tshirtButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(fenster2, "Du hast T-Shirt ausgewählt.");
                    }
                });

                pulliButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(fenster2, "Du hast Pulli ausgewählt.");
                    }
                });

                jackeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(fenster2, "Du hast Jacke ausgewählt.");
                    }
                });

                // Buttons zum Panel hinzufügen
                panel.add(tshirtButton);
                panel.add(pulliButton);
                panel.add(jackeButton);

                // Setze das Panel und zeige das Fenster
                fenster2.add(panel);
                fenster2.setVisible(true);
            }
        }
    }

} */
