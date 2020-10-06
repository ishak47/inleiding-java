package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int x = 70;
        int y = 70;
        int w = 750;
        int h = 750;
        int cirkel = 360;
        int start = 0;
        int aantal= 0;

        while (aantal < 50) {
            aantal++;
            w -=20;
            h -=20;
            x +=10;
            y +=10;
            g.drawArc(x,y,w,h,start,cirkel);
        }
    }
}
