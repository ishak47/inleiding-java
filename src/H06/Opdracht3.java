package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int a,b,uitkomst;


    public void init() {
    a=2147483647;
    b=10;
    uitkomst= a+b;
    }

        public void paint(Graphics g) {
        g.drawString(""+uitkomst,20,20);
    }
}
