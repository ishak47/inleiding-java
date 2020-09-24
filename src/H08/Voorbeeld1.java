package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Voorbeeld1 extends Applet {
    Button knop;
    String schermtekst;


    public void init() {
    schermtekst= "doet deze knop het wel?";
    knop= new Button();
    KnopListener kl= new KnopListener();
    knop.addActionListener(kl);
    knop.setLabel("klik op mij");
    add(knop);
    }


    public void paint(Graphics g) {

        g.drawString("doet deze knop het wel?",50,60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "Ja, deze knop doet wel iets";
        }
    }

}
