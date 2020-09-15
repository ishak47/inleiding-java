package H04;

import java.applet.Applet;
import java.awt.*;

public class Nederlands extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        //Nederlandse vlag
        setBackground(Color.black);
        g.setColor(Color.red);
        g.drawRect(330,50,130,50);
        g.fillRect(330,50,130,50);
        g.setColor(Color.white);
        g.drawRect(330,100,130,50);
        g.fillRect(330,100,130,50);
        g.setColor(Color.blue);
        g.drawRect(330,150,130,50);
        g.fillRect(330,150,130,50);
        g.setColor(Color.darkGray);
        g.fillRect(325,50,5,250);
    }
}
