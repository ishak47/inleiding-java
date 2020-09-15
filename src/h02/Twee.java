package h02;

import java.applet.Applet;
import java.awt.*;

public class Twee extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Ishak", 950, 430);
            g.setColor(Color.red);
            g.drawString("Jmilou",950, 450);
    }
}
