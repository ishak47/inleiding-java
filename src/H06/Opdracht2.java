package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int seconden,uur,dag,jaar,uitkomst;

    public void init() {
    seconden=60;
    uur=seconden*seconden;
    dag=
    jaar=52;
    uitkomst=40;
    }


    public void paint(Graphics g) {
    g.drawString("seconden per uur is:"+ uur, 20,20);
    g.drawString("seconden per dag is :"+ dag,20,35);
    }
}
