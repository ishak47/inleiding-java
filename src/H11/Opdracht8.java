package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int x = 70;
        int y = 70;
        int w = 120;
        int h = 120;
        int cirkel = 360;
        int start = 0;
        int aantal= 0;

        while (aantal < 100) {
            aantal++;
            w +=2;
            h +=2;
            g.drawArc(x,y,w,h,start,cirkel);
        }
    }
}
