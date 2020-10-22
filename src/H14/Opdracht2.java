package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Arrays;

public class Opdracht2 extends Applet {

    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Vrouw", "Heer"};
    String[] kleur = {"Ruiten", "Harten", "Schoppen", "Klaver"};
    String[] deck;

    Button spelen;

    private URL pad;
    private AudioClip geluid;

    boolean[] help;
    int starten = 0;

    public void init() {
    setSize(700,600);

    spelen = new Button("spelen");
    spelen.addActionListener(new speler());
    add(spelen);

    deck = new String[52];
    help = new boolean[52];

    Arrays.fill(help, false);

        for (int a = 0; a < 13; a++) {
            deck[starten] = kleur[0] + " " + nummer[a];
            starten++;
        }

        for (int a = 0; a < 13; a++) {
            deck[starten] = kleur[1] + " " + nummer[a];
            starten++;
        }

        for (int a = 0; a < 13; a++) {
            deck[starten] = kleur[2] + " " + nummer[a];
            starten++;
        }

        for (int a = 0; a < 13; a++) {
            deck[starten] = kleur[3] + " " + nummer[a];
            starten++;
        }
    }

    public void paint(Graphics g) {

    }

    private class speler implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        }
    }

}
