package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {

    //declaratie
    int nummer = 0;
    int getallen[] = {7,3,5,1,8,2,9,10,3,2,6,1,7,8,5,2,3,10,2,1,8,1,4,6,3,7,9,10,2,1,5,8,2,4,8,3,4,7,1,5,3,2,6,7,10,9};
    int aantal = 0;
    boolean error = false;
    Button ok = new Button("enter");
    Label label = new Label(" Voer een getal in tussen de 1-10. het mag geen komma bevatten ");
    TextField tekstvak = new TextField("",20);
    String tekst;

    public void init() {
        ok.addActionListener(new OkListener());
        add(ok);
        add(tekstvak);
        add(label);
        tekst = "";
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst,45,70);
    }

    private class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        aantal = 0;
            nummer = Integer.parseInt(tekstvak.getText());
            for (int n = 0; n <getallen.length; n++) {
                if (nummer == getallen[n]) {
                    aantal++;
                }
            }
            if (nummer > 10){
                tekst= "het is niet tussen de 1 en 10";
            } else{
                tekst = "Het ingevulde getal komt "+ aantal +" keer voor in de programma";
            }
            repaint();
        }
    }
}
