package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    //Schrijf een applet, waarin tien getallen van 20 tot 10 worden getoond.
    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int x = 10;

        for(teller = 10; teller <= 20; teller++) {
            x += 20;
            g.drawString("" + teller, 30, x );
        }
    }

}
