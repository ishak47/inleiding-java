package H04;

import java.applet.Applet;
import java.awt.*;

public class Huisje extends Applet {


    public void init() {
    }


    public void paint(Graphics g) {
        //prachtige huisje
        g.drawRect(200,100,20,20);
        g.drawRect(240,120,30,50);
        g.setColor(Color.magenta);
        g.drawRect(180,70,100,100);
        g.drawLine(180,70,280,20);
        g.drawLine(280,20,280,70);
    }
}
