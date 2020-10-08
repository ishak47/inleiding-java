package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {
    //declaratie
    TextField input[] = new TextField[5];
    Button oke;


    int cijfer[] = new int[5];

    public void init() {

    //initialisatie
        for (int n=0; n!=5; n++){
            input[n] = new TextField("",5);
            add(input[n]);
        }
        oke=new Button("oke");
        oke.addActionListener(new ButtonListener());
        add(oke);
    }

    public void paint(Graphics g) {
    }

    class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            for (int n = 0; n != 5; n++) {
                cijfer[n] = Integer.parseInt(input[n].getText());
            }
            Arrays.sort(cijfer);
            for (int n = 0; n != 5; n++) {
                input[n].setText(String.valueOf(cijfer[n]));
            }
            repaint();
        }
    }
}
