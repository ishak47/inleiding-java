package H05;

import java.applet.Applet;
import java.awt.*;

public class Uitleg extends Applet {

    //een int is een stukje geheugen voor een geheel getal
    int getal1, getal2, optelsom;

    //een double is een stukje geheugen voor een komma getal
    double factor1, factor2, product;

    //varibelen voor de rechthoek
    int breedte, hoogte;

    //kleurvariablen
    Color rechthoekKleur= Color.blue;
    public void init() {
        setBackground(Color.darkGray);
        getal1= 512;
        getal2=754;
        factor1=3.4;
        factor2=6.2;
        optelsom = getal1 + getal2;
        product = factor1 * factor2;
        breedte = 300;
        hoogte = 60;
    }

    public void paint(Graphics g) {
        //pak de witte verf
        g.setColor(Color.white);

        //optelsom
        String optelsomString = getal1 +"+" + getal2 +"=" + optelsom;
        g.drawString(optelsomString,50,50);

        //keersom
        String keersomString=factor1 + "x" + factor2 + "=" + product;
        g.drawString(keersomString,50,67);

        //pak de verf voor de rechthoek
        g.setColor(rechthoekKleur);

        //rechthoek
        g.fillRect(50,90, breedte,hoogte);
    }
}




