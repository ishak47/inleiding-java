package H08;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht81 extends Applet {
    TextField Tekstvak;
    Button knop;
    Button resetknop;
    String S;
    Label label;

    public void init() {

        //okknop
        knop = new Button("ok");
       knop.addActionListener(new Knoplistener());
        add(knop);
        //resetknop
        resetknop = new Button("reset");
        resetknop.addActionListener(new KnopListener2());
        add(resetknop);

        //tekstvak
        Tekstvak = new TextField("", 30);
        add(Tekstvak);
        S ="";

        //label
        label=new Label("type iets");
    }


     public void paint(Graphics g) {
        setBackground(Color.orange);
        knop.setLocation(50,60);
        resetknop.setLocation(50,150);
        resetknop.setSize(300,40);
        Tekstvak.setLocation(50,105);
        knop.setSize(300,40);
        g.drawString("" + S, 50,140);

    }

    class Knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Tekstvak.getText();
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Tekstvak.setText("");
            repaint();

        }
    }

}
