package H12;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    //declaratie
    int nummer;
    int index;
    int[] getallen = {4, 24, 65, 99, 108, 147, 172, 196, 222, 247};
    boolean controle = false;
    Label tekst = new Label("type een getal in tussen de 1-250, het mogen geen komma getallen zijn");
    TextField invoer = new TextField("", 20);
    Button ok = new Button("oke");

    public void init() {
        ok.addActionListener(new OkeListener());
        add(ok);
        add(invoer);
        add(tekst);
    }

    public void paint(Graphics g) {
        if (controle == true) {
            g.drawString("het getal is gevonden op " + " plaats : " + index, 50, 80);
        } else {
            g.drawString("het getal is niet gevonden. Probeer een andere", 50, 80);
        }
    }

    class OkeListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            controle = false;
            nummer = Integer.parseInt(invoer.getText());

            for (int n = 0; n < getallen.length; n++) {
                if (nummer == getallen[n]) {
                    index = n;
                    controle = true;
                    break;
                }
            }
            repaint();
        }
    }
}