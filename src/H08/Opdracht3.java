package H08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Button Okknop;
    TextField Tekstvak;
    Label label;
    double Bedrag;
    String s;


    public void init() {

    Bedrag=0;
    Okknop=new Button("oke");
    Okknop.setLabel("ok");
   // Okknop.addActionListener(new Opdracht81.KnopListener());
    add(Okknop);

        Okknop.addActionListener(new BTW());

        //tekstvak
    Tekstvak=new TextField("haal dit weg en type een cijfer ",30);
   // Tekstvak.addActionListener(new TekstvakListener());
    add(Tekstvak);

    //label
    label=new Label("€");
    add(label);
    }

    public void paint(Graphics g) {
    setBackground(Color.red);
        g.drawString("Bedrag met 21% BTW= " + Bedrag,50,60);


    }
    class BTW implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Okknop.setLocation(20,20);
           s = Tekstvak.getText();
            Bedrag = Double.parseDouble( s);
            Bedrag *=1.21;

            repaint();
        }
    }

}
