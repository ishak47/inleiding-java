package H10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Voorbeels5 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;
    Button reset;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer ");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50 );
    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        s=tekstvak.getText();
        dag=Integer.parseInt(s);
        switch (dag){
            case 1:
                tekst= "zondag";
                break;
            case 2:
                tekst = "maandag";
                break;
            case 3:
                tekst = "dinsdag";
                break;
            case 4:
                tekst = "woensdag";
                break;
            case 5:
                tekst = "donderdag";
                break;
            case 6:
                tekst = "vrijdag";
                break;
            case 7:
                tekst = "zaterdag";
                break;
            default:
                tekst = "U hebt een verkeerd nummer ingetikt probeer een andere";
                break;
            }
            repaint();
        }
    }

}
