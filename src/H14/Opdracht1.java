package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    double cijferkeuze;
    double kleurkeuze;

    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Vrouw", "Heer"};
    String[] kleur = {"Ruiten", "Harten", "Schoppen", "Klaver"};
    String keuze;
    Button delen;


    public void init() {
        delen = new Button("deel kaart");
        delen.addActionListener(new delen());
        keuze = " uw gekozen kaart is :  ";
        add(delen);

    }

    public void paint(Graphics g) {
        g.drawString(keuze,20,50);
    }

    class delen implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        kleurkeuze = Math.random() * 3 ;
        int kleurKeuze = (int) kleurkeuze ;

        cijferkeuze= Math.random()* 12;
        int cijferKeuze = (int) cijferkeuze;

        }
    }



}
