package H04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    g.drawRoundRect(40,40,100,100,30,30);
    g.fillRoundRect(60,65,20,20,20,20);
    g.fillRoundRect(60,100,20,20,20,20);
    g.fillRoundRect(100,65,20,20,20,20);
    g.fillRoundRect(100,100,20,20,20,20);
    }
}
