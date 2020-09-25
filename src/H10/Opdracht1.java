package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    //declareren
    TextField tekstvak1;
    double tekst;
    double nummer;
    String s;
    Label label;
    Button ok;

    public void init() {
    setBackground(Color.yellow);

    //initialisatie
        nummer=6;
        tekstvak1=new TextField("",7);
        tekstvak1.addActionListener(new Tekstvak1Listener());
        label=new Label("type een nummer en druk op enter");
        ok=new Button("ok");
        //add buttons
        add(tekstvak1);
        add(label);

    }

    public void paint(Graphics g) {
    g.drawString("het hoogste cijfer is op dit moment:"+ nummer,20,80);
        ok.setLocation(30,30);
        tekstvak1.setLocation(20,50);
    }

    class Tekstvak1Listener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        s= tekstvak1.getText();
        tekst=Double.parseDouble(s);
        if (tekst>nummer ){
                nummer= tekst;
            }
        repaint();
        }
    }


}
