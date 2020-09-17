package H06;

import java.applet.Applet;
import java.awt.*;

public class Voorbeeld extends Applet {
    int a, b, c, uitkomst;

    public void init() {
        a = 8;
        b = 8;
        c = 3;
        uitkomst = a + b / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
