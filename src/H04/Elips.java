package H04;

import java.applet.Applet;
import java.awt.*;

public class Elips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
       setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20,20,200,100,90,360);
        g.drawArc(20, 20, 200, 100, 90, 45);
        g.drawArc(20, 20, 200, 100, 135, 45);
        g.drawArc(20, 20, 200, 100, 180, 45);
        g.drawArc(20, 20, 200, 100, 225, 45);
        g.drawArc(20, 20, 200, 100, 270, 45);
        g.drawArc(20, 20, 200, 100, 315, 45);
        g.drawArc(20, 20, 200, 100, 360, 45);
        g.drawArc(20, 20, 200, 100, 405, 45);











    }
}
