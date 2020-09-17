package H06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;
    double uitkomst;
    int afkappen;
    public void init() {
    }

    public void paint(Graphics g) {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer2 + cijfer2 + cijfer3) / 3;
        afkappen =  (int) (gemiddelde * 10);
        uitkomst = afkappen / 10.0;
        g.drawString("het gemiddelde is: " + uitkomst + " ",30,30);
    }
}
