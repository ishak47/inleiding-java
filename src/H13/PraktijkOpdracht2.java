package H13;

import java.applet.Applet;
import java.awt.*;
import java.lang.reflect.GenericArrayType;

public class PraktijkOpdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    boomgaard(g,45,45,150,450);
    }

    void boomgaard (Graphics g, int x, int y, int w, int h) {

 if (h < w * 1.5) {
        h = w / 10 * 15;
    }
    //de stam
        g.setColor(new Color(110,44,31));
        g.fillRect(x + (w / 5 * 2), y + (w / 5 * 2), w / 5, h - (w / 5 * 5));

    //de bladeren
        g.setColor(new Color(3, 66, 16));
        g.fillOval(x,y,w,w);
}
}
