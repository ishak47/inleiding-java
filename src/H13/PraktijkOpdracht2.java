package H13;

import java.applet.Applet;
import java.awt.*;


public class PraktijkOpdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        boomgaard(g, 45, 45, 150, 450,5,2);
    }

    void boomgaard(Graphics g, int x, int y, int w, int h, int bomen , int rijen) {

        for (int a = 0; a < rijen; a++) {
            for (int b = 0; b < bomen; b++){

                if (h < w * 1.5) {
                    h = w / 10 * 15;
                }

            //de stam
            g.setColor(new Color(110, 44, 31));
            g.fillRect(x + (w / 5 * 2) + b * (w + 10), y + (w / 10 * 9) + a * (h + 20), w / 5 * 1, h - (w / 5 * 9));

            //de bladeren
            g.setColor(new Color(3, 66, 16));
            g.fillOval(x + b * (w + 10 ) , y + a * ( h + 20 ) , w , w  );
            }
        }
    }
}
