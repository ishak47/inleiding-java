package H10;

import java.applet.Applet;
import java.awt.*;

public class Voorbeeld1 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString(""+8+ "is groter dan" + 5+ ":"+ (8+5),50,60);
        g.drawString("" + 8 + " is kleiner dan " + 5 + ": " + (8 < 5), 50, 80 );
        }
}
