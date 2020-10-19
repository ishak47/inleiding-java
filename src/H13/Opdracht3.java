package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    //declaratie
    int muur = 0;
    Button stenen= new Button("stenen muur");
    Button beton= new Button("betonnen muur");
    Button reset= new Button("reset");

    public void init() {

    //actionlistener
    stenen.addActionListener(new stenen());
    beton.addActionListener(new beton());
    reset.addActionListener(new reset());

    //add
    add(stenen);
    add(beton);
    add(reset);
    }

    public void paint(Graphics g) {
        switch (muur) {
            case 0:
                break;
            case 1:
                drawWall(g, 20, 20, 1160, 660);
                break;
            case 2:
                betonMuur(g, 20, 20, 1160, 660);
                break;
            default:
                break;

        }

    }
}
