package H08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Button okknop;
    TextField tekstvak;
    Label label;
    double getal;
    String s;
    double uitkomst;

    public void init() {
    okknop=new Button("ok");
    add(okknop);
    tekstvak=new TextField("",30);
    tekstvak.addActionListener(new TekstvakListener());
    add(tekstvak);
    label=new Label("type een getal");
    add(label);
    uitkomst=getal/100*121;
    }

    public void paint(Graphics g) {
    //g.drawString("");

    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s);
            repaint();
        }
    }

}
