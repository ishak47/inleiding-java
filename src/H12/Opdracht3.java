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
    Button delete;

    int cijfer[] = new int[5];

    public void init() {

    //initialisatie
        for (int i=0; i!=5; i++){
            input[i] = new TextField("",5);
            add(input[i]);
        }
        oke=new Button("oke");
        oke.addActionListener(new ButtonListener());
        add(oke);

        delete=new Button("delete");
        add(delete);
        delete.setLocation(577,20);
    }

    public void paint(Graphics g) {
    }

    class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i != 5; i++) {
                cijfer[i] = Integer.parseInt(input[i].getText());
            }
            Arrays.sort(cijfer);
            for (int i = 0; i != 5; i++) {
                input[i].setText(String.valueOf(cijfer[i]));
            }
            repaint();
        }
    }
}
