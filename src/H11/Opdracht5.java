package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {
    //Teken vijf vierkanten volgens onderstaand figuur:

    public void init() {
    }

    public void paint(Graphics g) {
        int aantal = 0;
        int a = 5;
        int b = 5;
        int c = 40;
        int d = 40;

        while (aantal < 5) {
            aantal++;
            a += 40;
            b += 40;
            g.drawRect(a, b, c, d);
        }
    }
}
