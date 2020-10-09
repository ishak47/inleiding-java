package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    //declaratie
    int nummer = 0;
    int getallen[] = {7,3,5,1,8,2,9,10,3,2,6,1,7,8,5,2,3,10,2,1,8,1,4,6,3,7,9,10,2,1,5,8,2,4,8,3,4,7,1,5,3,2,6,7,10,9};
    int voorkomen = 0;
    Button ok = new Button("enter");
    Label label = new Label(" Voer een getal in tussen de 1-10 ");
    TextField tekstvak = new TextField("",20);

    public void init() {
   //     ok.addActionListener(new OkListener());
        add(ok);
        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString("Het ingevulde getal komt "+ voorkomen +" keer voor in de programma",45,70);
    }
}
