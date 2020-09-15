package H04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {


    public void init() {
    }


    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillArc(200,150,80,80,0,180);
        g.fillRect(200,190,80,75);
        g.fillArc(200,225,80,75,100,280);
        g.setColor(Color.red);
        g.fillArc(225,170,30,30,0,360);
        g.setColor(Color.orange);
        g.fillArc(225,210,30,30,0,360);
        g.setColor(Color.green);
        g.fillArc(225,250,30,30,0,360);
        g.setColor(Color.white);
        g.drawString("232.6",225,292);
    }

}
