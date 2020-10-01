package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    // cijfers: slecht 1,2,3 : onvoldoende 4 : matig 5 : voldoende 6,7  : goed 8,9,10 :

    //declareren
    TextField tekstvak;
    Button ok;
    int getal;
    String uitslag;

    public void init() {
    //initialisatie
    getal=0;
    tekstvak= new TextField("",20);
    ok=new Button("ok");
    ok.addActionListener(new CijferListener());

    //add
    add(tekstvak);
    add(ok);
    }

    public void paint(Graphics g) {
        g.drawString("Jouw cijfer is: " + uitslag, 50, 50);

    }

    class CijferListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik");
        getal=Integer.parseInt(tekstvak.getText());
        switch (getal){
            case 1:
            case 2:
            case 3:
                uitslag = "slecht";
                break;
            case 4:
                uitslag= "onvoldoende";
            break;
            case 5:
                uitslag= "matig";
           break;
            case 6:
            case 7:
                uitslag= "voldoende";
            break;
            case 8:
            case 9:
            case 10:
                uitslag= "goed";
            break;
            default:
                uitslag= "kan niet";
        }
        repaint();
        }
    }
}
