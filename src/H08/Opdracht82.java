package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet {
    //declareren
    Button personen;
    int counter;
    TextField tekstvak;
    TextField tekstvak2;
    TextField potentieel;
    TextField totaal;

    public void init() {
    //knop personen
    personen= new Button("aantal personen");
        personen.setLabel("aantal personen");
    add(personen);

    //tekstvakken
    tekstvak= new TextField("mannen",30);
    add(tekstvak);
    counter=1;

    //tekstvak2
    tekstvak2= new TextField("vrouwen",30);
    add(tekstvak2);
    counter=1;

    //potentiële vrouwelijke en mannenlijke leerlingen
    potentieel=new TextField("potentiële vrouwelijke en mannelijke leerlingen",30);
    add(potentieel);
    counter=1;

    //totaal
    totaal=new TextField("totaal",30);
    add(totaal);
    counter=1;

    //aansluiten Actionlistener
    personen.addActionListener(new TextToTerminalListener());
    }

   public void paint(Graphics g) {
        personen.setLocation(30,30);
        personen.setSize(300,40);
        personen.setLabel("aantal personen");

        //tekstvak
       tekstvak.setLocation(30,70);
       tekstvak.setSize(300,40);

       //tekstvak2 locatie
       tekstvak2.setLocation(30,120);
       tekstvak2.setSize(300,40);

       //potentiële vrouwelijke en mannenlijke leerlingen
       potentieel.setLocation(30,165);
       potentieel.setSize(300,40);

       //totaal
       totaal.setLocation(30,210);
       totaal.setSize(300,40);
    }

    class TextToTerminalListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("mannen" + counter);
            tekstvak.setText("mannen:"+ counter);
            tekstvak2.setText("vrouwen:"+ counter);
            potentieel.setText("potentiële vrouwelijke en mannenlijke leerlingen:"+ counter);
            totaal.setText("totaal");
            counter++;
            repaint();
        }
    }
}
