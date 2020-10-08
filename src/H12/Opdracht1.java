package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    //declaratie
    double[] gemiddelde;
    double Uitkomst;
    double a,b,c,d,e,f,g,h,i,j;

    public void init() {

        //initialisatie
        a = 5.5;
        b = 9.1;
        c = 2.4;
        d = 5.4;
        e = 6.9;
        f = 9.9;
        g = 6.8;
        h = 2.5;
        i = 6;
        j = 7.5;

        gemiddelde = new double[11];
        Uitkomst = (a + b + c + d + e + f + g + h + i + j) / 10;

        //Initalisatie berekening gemiddelde
        gemiddelde[0] = a;
        gemiddelde[1] = b;
        gemiddelde[2] = c;
        gemiddelde[3] = d;
        gemiddelde[4] = e;
        gemiddelde[5] = f;
        gemiddelde[6] = g;
        gemiddelde[7] = h;
        gemiddelde[8] = i;
        gemiddelde[9] = j;
        gemiddelde[10] = Uitkomst;

        for (int teller = 0; teller < gemiddelde.length; teller++) {
        }

    }

    public void paint(Graphics g) {

    }
}
