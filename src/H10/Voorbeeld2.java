package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Voorbeeld2 extends Applet {
    int leeftijd;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
    tekstvak= new TextField("",5);
    tekstvak.addActionListener(new VakListener());
    tekst="";

    label= new Label("geef je leeftijd en druk op enter");

    add(label);
    add(tekstvak);
    }

    public void paint(Graphics g) {
    g.drawString(tekst,50,45);
    }

    class VakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        String s;

        s= tekstvak.getText();
        leeftijd= Integer.parseInt(s);
        if (leeftijd> 20){
            tekst="je bent meerderjarig ";
        }

        else {
            tekst="je bent minderjarig OPROTTEN";
        }
            repaint();
        }
    }


}
