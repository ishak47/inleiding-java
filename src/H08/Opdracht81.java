package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht81 extends Applet {
    TextField tekstvak;
    Button knop;
    Button resetknop;
    String tekstje;

    public void init() {
        tekstvak = new TextField("", 30);
        //hierop drukken knop
        knop = new Button("hierop drukken");
        knop.addActionListener(new KnopListener());

        //resetknop
        resetknop = new Button("reset");
        resetknop.addActionListener(new KnopListener2());
        add(knop);
        add(resetknop);
        add(tekstvak);
        tekstje ="";
    }


    public void paint(Graphics g) {
        knop.setLocation(50,60);
        resetknop.setLocation(50,150);
        resetknop.setSize(300,40);
        tekstvak.setLocation(50,105);
        knop.setSize(300,40);
        g.drawString("" +tekstje, 50,140);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstje = tekstvak.getText();
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }


}
