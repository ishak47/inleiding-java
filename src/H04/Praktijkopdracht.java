package H04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //dit is de lijn
        g.drawLine(300,50,50,50);
        g.drawString("lijn",170,70);

        //rechthoek
        g.drawRect(50,100,300,150);
        g.drawString("rechthoek",165,270);

        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.drawRect(450,100,300,150);
        g.fillRect(450,100,300,150);
        g.setColor(Color.black);
        g.drawArc(450,100,300,150,0,45);
        g.drawArc(450,100,300,150,45,90);
        g.drawArc(450,100,300,150,90,135);
        g.drawArc(450,100,300,150,135,180);
        g.drawArc(450,100,300,150,180,225);
        g.drawArc(450,100,300,150,225,270);
        g.drawArc(450,100,300,150,270,315);
        g.drawArc(450,100,300,150,315,360);
        g.drawArc(450,100,300,150,360,405);
        g.drawString("Gevulde rechthoek met ovaal",520,270);

        //taartpunt met ovaal eromheen
        g.setColor(Color.black);
        g.drawArc(850,100,300,150,0,45);
        g.drawArc(850,100,300,150,45,90);
        g.drawArc(850,100,300,150,90,135);
        g.drawArc(850,100,300,150,135,180);
        g.drawArc(850,100,300,150,180,225);
        g.drawArc(850,100,300,150,225,270);
        g.drawArc(850,100,300,150,270,315);
        g.drawArc(850,100,300,150,315,360);
        g.drawArc(850,100,300,150,360,405);
        g.setColor(Color.magenta);
        g.fillArc(850,100,300,150,0,45);
        g.setColor(Color.black);
        g.drawString("taartpunt met ovaal eromheen",920,270);

        //afgeronde rechthoek
        g.drawRoundRect(50,280,300,150,30,30);
        g.drawString("afgeronde rechthoek",145,450);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillArc(450,285,308,150,0,405);
        g.drawArc(450,285,300,150,0,45);
        g.drawArc(450,285,300,150,45,90);
        g.drawArc(450,285,300,150,90,135);
        g.drawArc(450,285,300,150,135,180);
        g.drawArc(450,285,300,150,180,225);
        g.drawArc(450,285,300,150,225,270);
        g.drawArc(450,285,300,150,270,315);
        g.drawArc(450,285,300,150,315,360);
        g.drawArc(450,285,300,150,360,405);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",555,450);

        //cirkel
        g.drawOval(922,280,150,150);
        g.drawString("cirkel",975,455);

    }
}
