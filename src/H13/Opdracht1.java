package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    // teken een driehoek m.b.v. de meegegeven data (parameters)

    public void init() {

    }

    public void paint(Graphics g) {
        TekenDriehoek(g, 75,75,100,50,125,75);
    }

    void TekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);
    }
}
