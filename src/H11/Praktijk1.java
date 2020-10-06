package H11;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk1 extends Applet {
    //decleratie
    int a;
    long antwoord;
    TextField tekstvak;
    Button ok;

    public void init() {
        a = 0;
        antwoord = 0;
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new okbutton());
        ok = new Button("oké");
        ok.addActionListener(new okbuttonListener());

        add(tekstvak);
        add(ok);
    }

    public void paint(Graphics g) {

        }


}
