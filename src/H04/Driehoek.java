package H04;

import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {



    public void init() {
    }



    public void paint(Graphics g) {
        //dit is de gelijkbenige driehoek
        setBackground(Color.black);
        g.setColor(Color.red);

        g.drawLine(50,120,100,70);
        g.drawLine(100,70,150,120);
        g.drawLine(50,120,150,120);
    }
}
