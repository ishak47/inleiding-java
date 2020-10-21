package H13;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        boom(g,45,45,150,450);
    }

    void boom (Graphics g, int x, int y, int w, int h) {
        if (h < w * 1.5) {
            h = w / 10 * 15;
        }
    }
}
