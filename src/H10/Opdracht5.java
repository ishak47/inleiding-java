package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
    // uitleg
    //Schrijf een applet, waarin de gebruiker zijn cijfers kan invoeren en wordt getoond of het cijfer voldoende of onvoldoende is.
    // Tevens wordt het gemiddelde bijgehouden. Zodra de gebruiker op de Ok-knop klikt, wordt getoond wat het gemiddelde is en of de leerling geslaagd is.

    //declareren
    TextField tekstvak;
    Label label;
    int aantalcijfers;
    double gemiddelde;
    boolean voldoende;
    boolean slagen;
    Button ok;

    public void init() {

    //initialisatie
    label = new Label("type hier je cijfer! ");
    tekstvak= new TextField("",20);
    ok= new Button("oke");
    ok.addActionListener(new OkListener());

    //int & double
    aantalcijfers=0;
    gemiddelde=0.0;

    //add
    add(tekstvak);
    add(label);
    add(ok);

    }

    public void paint(Graphics g) {
        g.drawString("Je gemiddelde cijfer: " + gemiddelde,50,50);
        g.drawString("Aantal cijfers: " + aantalcijfers,50,90);
        g.drawString("Is het cijfer voldoende? " + voldoende,50,70);
        g.drawString("ben je geslaagd : " + slagen,50,110);

    }

    class OkListener implements ActionListener{

       public void actionPerformed(ActionEvent e) {
           Double cijfer=  Double.parseDouble(tekstvak.getText());
           voldoende = cijfer >= 5.5;
           slagen= cijfer>= 5.5;
           gemiddelde= gemiddelde * 10;
           gemiddelde= ( (gemiddelde * aantalcijfers) + cijfer) / (aantalcijfers + 1);
           int Gemiddelde = (int) gemiddelde;
           gemiddelde = Gemiddelde;
           gemiddelde =gemiddelde / 10;
           aantalcijfers++;
           repaint();
        }
    }
}
