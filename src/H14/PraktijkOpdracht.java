package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PraktijkOpdracht extends Applet {

    TextField tekstvak = new TextField("",5);
    Button speel = new Button("spelen");
    Button opnieuw = new Button("nieuwe spel");
    String tekst = "";
    String tekst1 = "voer getal 1, 2 of 3 in en druk op spelen";
    String winnaar = "Winnaar!!";

    int ajax = 23;
    boolean error = false;
    boolean turn = false;
    boolean lost = false;
    boolean gameover = false;

    Image afbeelding;

    public void init() {

    setSize(750,560);

    tekst = tekst1;

        //knoppen
       //  speel.addActionListener(new speler());
     //   opnieuw.addActionListener(new opnieuwListener());
        add(tekstvak);
        add(speel);
        add(opnieuw);

        //ajax logo
        URL pad = PraktijkOpdracht.class.getResource("./resources/");
        afbeelding= getImage(pad, "ajax logo.png");
    }

    public void paint(Graphics g) {

        g.drawString(tekst,70,50);
        g.drawString("er zijn nog: " + ajax  + " ajax logo's ",60,70);

        for (int a = 0; a < ajax; a++){
            g.drawImage(afbeelding , 100 + 50 * (a % 4), 100 + 50 * (a / 4), 50, 50, this);
        }
    }

}
