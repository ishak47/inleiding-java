package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double a, b, uitkomst;

    public void init() {
       setBackground(Color.black);
        a = 113;
        b = 4;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString("het bedrag dat Jan moet betalen is:€"+ uitkomst ,20,20);
        g.drawString("het bedrag dat Ali moet betalen is:€"+uitkomst,20,35);
        g.drawString("het bedrag dat Jeannette moet betalen is:€"+ uitkomst,20,50 );
        g.drawString("het bedrag dat Ishak moet betalen is:€"+ uitkomst,20,65);
    }
}