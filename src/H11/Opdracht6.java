package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {
//Teken vijf concentrische cirkels zoals in het volgende figuur:
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

    while (aantal < 5) {
        aantal++;
        w -=20;
        h -=20;
        x +=10;
        y +=10;
        g.drawArc(x,y,w,h,start,cirkel);
        }
    }
}
