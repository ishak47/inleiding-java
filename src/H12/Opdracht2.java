package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    //decleratie
    Button buttons [] = new Button[25];

    public void init() {
        for (int n = 0; n != 25; n++) {
            buttons[n] = new Button("knop " + String.valueOf(n + 1));
            add(buttons[n]);
        }
    }

    public void paint(Graphics g) {
    }
}
