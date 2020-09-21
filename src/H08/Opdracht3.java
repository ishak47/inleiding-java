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

    public void init() {
    okknop=new Button("ok");
    okknop.setLabel("ok");
    okknop.addActionListener(new KnopListener());
    add(okknop);

    //tekstvak
    tekstvak=new TextField("type hier",30);
    tekstvak.addActionListener(new TekstvakListener());
    add(tekstvak);

    //label
    label=new Label("type een getal");
    add(label);
    }

    public void paint(Graphics g) {


    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            okknop.setLocation(20,20);
            s = tekstvak.getText();
            getal = Double.parseDouble( s);
            repaint();
        }
    }

}
