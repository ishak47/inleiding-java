package H04;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //valerie jeroen hans
        setBackground(Color.gray);
        g.drawRect(100,50,300,300);
        g.setColor(Color.magenta);
        g.drawString("0 kg",75,350);
        g.drawString("20 kg",70,300);
        g.drawString("40 kg",70,250);
        g.drawString("60 kg",70,200);
        g.drawString("80 kg",70,150);
        g.drawString("100 kg",63,100);
        g.drawString("valerie",120,370);
        g.drawString("jeroen",225,370);
        g.drawString("hans",340,370);
        g.setColor(Color.red);
        g.fillRect(110,240,50,110);
        g.setColor(Color.yellow);
        g.fillRect(220,100,50,250);
        g.setColor(Color.green);
        g.fillRect(330,140,50,210);

    }
}
