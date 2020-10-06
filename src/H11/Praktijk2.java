package H11;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk2 extends Applet {
    //decleratie
    int a , i;
    long antwoord;
    Button oke;


    public void init() {
        a = 0;
        antwoord = 0;
        oke = new Button("oké");
        oke.addActionListener(new Okknop());
        add(oke);
    }

    public void paint(Graphics g) {
        for (i = 1; i <= 10; i++) {
            antwoord = a * i;
            g.drawString("" + antwoord, 90, i * 20 + 30);
        }

    }
}
