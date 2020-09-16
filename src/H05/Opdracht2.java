package H05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    //Declaratie
    Color opvulkleur1;
    Color opvulkleur2;
    Color opvulkleur3;
    Color lijnkleur;
    Color achtergrond;
    int hoogte1,hoogte2, hoogte3,hoogte4, breedte;

    public void init() {
        //initialisatie
        opvulkleur1 = Color.red;
        opvulkleur2 = Color.yellow;
        opvulkleur3 = Color.GREEN;
        lijnkleur = Color.white;
        achtergrond = Color.darkGray;
        hoogte1= 110;
        hoogte2= 250;
        hoogte3= 210;
        hoogte4= 300;
        breedte= 50;
    }


    public void paint(Graphics g) {
        setBackground(achtergrond);
        //vierkant
        g.setColor(lijnkleur);
        g.drawRect(100,50,hoogte4,hoogte4);

        //valerie,jeroen,hans
        g.drawString("0 kg",75,350);
        g.drawString("20 kg",70,300);
        g.drawString("40 kg",70,250);
        g.drawString("60 kg",70,200);
        g.drawString("80 kg",70,150);
        g.drawString("100 kg",63,100);
        g.drawString("valerie",120,370);
        g.drawString("jeroen",225,370);
        g.drawString("hans",340,370);
        g.setColor(opvulkleur1);
        g.fillRect(110,240,breedte,hoogte1);
        g.setColor(opvulkleur2);
        g.fillRect(220,100,breedte,hoogte2);
        g.setColor(opvulkleur3);
        g.fillRect(330,140,breedte,hoogte3);


    }
}
