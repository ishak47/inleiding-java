package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    //declareren
    TextField tekstvak1;
    double tekst;
    double nummer;
    double laagstenummer;
    String s;
    Label label;
    Button reset;

    public void init() {

        //initialisatie
        nummer=1;
        laagstenummer=0;
        tekstvak1=new TextField("",7);
        tekstvak1.addActionListener(new Tekstvak1Listener());
        label=new Label("type een nummer en druk op enter");
        reset=new Button("reset");
        reset.addActionListener(new ResetListener());

        //buttons
        add(tekstvak1);
        add(label);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("het hoogste cijfer is op dit moment:"+ nummer,20,80);
        g.drawString("het laagste nummer op dit moment:"+ laagstenummer,20,95);
        tekstvak1.setLocation(20,35);
        label.setLocation(20,15);
    }

    class Tekstvak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s= tekstvak1.getText();
            tekst=Double.parseDouble(s);
            if (tekst>nummer ){
                nummer= tekst;
            }
            if (tekst<laagstenummer){
                laagstenummer=tekst;
            }
            repaint();
        }
    }

    class ResetListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekstvak1.setText("");
            repaint();
        }
    }




}
