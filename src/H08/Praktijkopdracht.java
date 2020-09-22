package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    //declareren
    Button Delen;
    Button Plus;
    Button Min;
    Button Keer;
    TextField Tekstvak1;
    TextField Tekstvak2;
    Double Uitkomst;
    Double G1;
    Double G2;
    String UitkomstA;


    public void init() {

    //initialisatie
        G1 = 0.0;
        G2 = 0.0;
        Uitkomst = 0.0;
        UitkomstA = "";

        Tekstvak1 = new TextField("",15);
        Tekstvak2 = new TextField("",15);
        Keer = new Button("x");
        Delen = new Button("/");
        Plus = new Button("+");
        Min = new Button("-");


        //ActionListener
        Keer.addActionListener(new KeerAction());
        Delen.addActionListener(new DelenAction());
        Plus.addActionListener(new PlusAction());
        Min.addActionListener(new MinAction());


        add(Tekstvak1);
        add(Tekstvak2);
        add(Plus);
        add(Min);
        add(Keer);
        add(Delen);

    }


    public void paint(Graphics g) {
    setBackground(Color.red);
    g.drawString("schrijf in beide vakken een getal en druk op een knop",20,40);
    }

    class KeerAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            G1 = Double.parseDouble(Tekstvak1.getText());
            G2 =Double.parseDouble(Tekstvak2.getText());
            Uitkomst= G1 * G2;
            UitkomstA=String.valueOf(Uitkomst);
            Tekstvak1.setText(UitkomstA);
            Tekstvak2.setText("");
            UitkomstA=String.valueOf(Uitkomst);
        }
    }

    class DelenAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            G1 = Double.parseDouble(Tekstvak1.getText());
            G2 =Double.parseDouble(Tekstvak2.getText());
            Uitkomst= G1 / G2;
            UitkomstA=String.valueOf(Uitkomst);
            Tekstvak1.setText(UitkomstA);
            Tekstvak2.setText("");
            UitkomstA=String.valueOf(Uitkomst);
        }
    }

    class PlusAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            G1 = Double.parseDouble(Tekstvak1.getText());
            G2 =Double.parseDouble(Tekstvak2.getText());
            Uitkomst= G1 + G2;
            UitkomstA=String.valueOf(Uitkomst);
            Tekstvak1.setText(UitkomstA);
            Tekstvak2.setText("");
            UitkomstA=String.valueOf(Uitkomst);
        }
    }
    class MinAction implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            G1 = Double.parseDouble(Tekstvak1.getText());
            G2 =Double.parseDouble(Tekstvak2.getText());
            Uitkomst= G1 - G2;
            UitkomstA=String.valueOf(Uitkomst);
            Tekstvak1.setText(UitkomstA);
            Tekstvak2.setText("");
            UitkomstA=String.valueOf(Uitkomst);
        }
    }
}
