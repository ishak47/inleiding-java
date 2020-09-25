package H10;

import javax.swing.*;
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
    Button reset;

    public void init() {
    setBackground(Color.yellow);

    //initialisatie
        nummer=0;
        tekstvak1=new TextField("",7);
        tekstvak1.addActionListener(new Tekstvak1Listener());
        label=new Label("");
        reset=new Button("reset");
        reset.addActionListener(new ResetListener());

        //buttons
        add(tekstvak1);
        add(label);
        add(reset);
    }

    public void paint(Graphics g) {
    g.drawString("het hoogste cijfer is op dit moment:"+ nummer,20,70);
        tekstvak1.setLocation(20,30);
    g.drawString("type een nummer en druk op enter" ,20,20);
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

    class ResetListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        tekstvak1.setText("");
        repaint();
        }
    }

}
