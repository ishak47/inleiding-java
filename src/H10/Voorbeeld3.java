package H10;

import java.applet.Applet;
import java.awt.*;

public class Voorbeeld3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    g.drawString(""+6+ "is groter dan " + 5 + " en kleiner dan"+
     8 + ":"+ (6>5  || 6<8),50,60    );
    g.drawString(""+ 6 + "is groter dan "+ 5 + " en is groter dan"+
    8 + "!" + (6>5  ||6>8),50,80);
    g.drawString(""+ 6 + "is kleiner dan " + 5 + " en is groter dan"+
    8 + "!"+ (6<5  || 6>8),50,100);
    g.drawString(""+6+ "is kleiner dan "+ 5 + " en kleiner dan"+
    8 + "!"+ (6<5  || 6<8),50,120);
    }
}
