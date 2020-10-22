package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    double cijferkeuze;
    double kleurkeuze;

    String[] cijfer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Vrouw", "Heer"};
    String[] kleur = {"Ruiten", "Harten", "Schoppen", "Klaver"};
    String keuze;
    String tekst;
    Button delen;


    public void init() {
        delen = new Button("deel kaart");
        delen.addActionListener(new delen());
        tekst = " uw gekozen kaart is :  ";
        keuze = "";
        add(delen);

    }

    public void paint(Graphics g) {
        g.drawString(tekst + keuze,20,50);
    }

    class delen implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        kleurkeuze = Math.random() * 3 ;
        int kleurKeuze = (int) kleurkeuze ;

        cijferkeuze= Math.random()* 12;
        int cijferKeuze = (int) cijferkeuze;

        keuze = kleur [kleurKeuze] + " " + cijfer[cijferKeuze];

        repaint();

        }
    }
}
