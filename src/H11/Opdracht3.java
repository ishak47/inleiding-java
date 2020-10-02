package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int Getal = 1;
        int Getal2= 1;
        int x = 10;

        while (Getal < 100) {
            x += 50;
            Getal += Getal2;
            Getal2 += Getal;
            g.drawString( " , " + Getal +  " , "  + Getal2,x,50);

        }
    }
}
