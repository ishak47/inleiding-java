package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {
//Maak een applet waarin de tafel van drie getoond wordt.
    public void init() { }


    public void paint(Graphics g) {
        int getal = 0;
        int x = 10;
        int tafel;

        while (getal < 10) {
            x += 20;
            getal++;
            tafel = getal * 3;
            g.drawString("" + tafel,x,30);
        }
    }
}
