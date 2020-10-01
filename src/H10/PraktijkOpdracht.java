package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    // cijfers: slecht 1,2,3 : onvoldoende 4 : matig 5 : voldoende 6,7  : goed 8,9,10 :

    //declareren
    TextField tekstvak;
    Button ok;
    int getal;
    int kleur;

    public void init() {
    getal=0;
    kleur=0;
    tekstvak= new TextField("",20);
    ok=new Button("ok");
    ok.addActionListener(new CijferListener());

    //add
    add(tekstvak);
    add(ok);
    }

    public void paint(Graphics g) {


    }


    class CijferListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik");

        }
    }
}
