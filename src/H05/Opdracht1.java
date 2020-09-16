package H05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    //een int is een stukje geheugen voor een geheel getal


    //een double is een stukje geheugen voor een komma getal

    //variabelen voor een rechthoek
    int breedte, hoogte;

    //kleurvariabelen
    Color opvulkleur= Color.magenta;
    Color lijnkleur= Color.black;

    public void init() {
    breedte= 300;
    hoogte=  150;
    }

    public void paint(Graphics g) {
        //pak de verf voor de rechthoek
        g.setColor(opvulkleur);

        //dit is de lijn
        g.setColor(lijnkleur);
        g.drawLine(350,50,50,50);
        g.drawString("lijn",170,70);

        //rechthoek
        g.setColor(lijnkleur);
        g.drawRect(50,100,breedte,hoogte);
        g.drawString("rechthoek",165,270);


        //gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.drawRect(450,100,breedte,hoogte);
        g.fillRect(450,100,breedte,hoogte);
        g.setColor(Color.black);
        g.drawArc(450,100,breedte,hoogte,0,45);
        g.drawArc(450,100,breedte,hoogte,45,90);
        g.drawArc(450,100,breedte,hoogte,90,135);
        g.drawArc(450,100,breedte,hoogte,135,180);
        g.drawArc(450,100,breedte,hoogte,180,225);
        g.drawArc(450,100,breedte,hoogte,225,270);
        g.drawArc(450,100,breedte,hoogte,270,315);
        g.drawArc(450,100,breedte,hoogte,315,360);
        g.drawArc(450,100,breedte,hoogte,360,405);
        g.drawString("Gevulde rechthoek met ovaal",520,270);

        //taartpunt met ovaal eromheen
        g.setColor(lijnkleur);
        g.drawArc(850,100,breedte,hoogte,0,45);
        g.drawArc(850,100,breedte,hoogte,45,90);
        g.drawArc(850,100,breedte,hoogte,90,135);
        g.drawArc(850,100,breedte,hoogte,135,180);
        g.drawArc(850,100,breedte,hoogte,180,225);
        g.drawArc(850,100,breedte,hoogte,225,270);
        g.drawArc(850,100,breedte,hoogte,270,315);
        g.drawArc(850,100,breedte,hoogte,315,360);
        g.drawArc(850,100,breedte,hoogte,360,405);
        g.setColor(opvulkleur);
        g.fillArc(850,100,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("taartpunt met ovaal eromheen",920,270);

        //afgeronde rechthoek
        g.setColor(lijnkleur);
        g.drawRoundRect(50,280,breedte,hoogte,30,30);
        g.drawString("afgeronde rechthoek",145,450);

        //gevulde ovaal
        g.setColor(opvulkleur);
        g.fillArc(450,285,breedte,hoogte,0,405);
        g.drawArc(450,285,breedte,hoogte,0,45);
        g.drawArc(450,285,breedte,hoogte,45,90);
        g.drawArc(450,285,breedte,hoogte,90,135);
        g.drawArc(450,285,breedte,hoogte,135,180);
        g.drawArc(450,285,breedte,hoogte,180,225);
        g.drawArc(450,285,breedte,hoogte,225,270);
        g.drawArc(450,285,breedte,hoogte,270,315);
        g.drawArc(450,285,breedte,hoogte,315,360);
        g.drawArc(450,285,breedte,hoogte,360,405);
        g.setColor(lijnkleur);
        g.drawString("gevulde ovaal",555,450);

        //cirkel
        g.drawOval(922,280,hoogte,hoogte);
        g.drawString("cirkel",975,455);

    }
}