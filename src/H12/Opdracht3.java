package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    //declaratie
    TextField input[] = new TextField[5];
    Button oke;

    int cijfer[] = new int[5];

    public void init() {

    //initialisatie
        for (int i=0; i!=5; i++){
            input[i] = new TextField("",5);
            add(input[i]);
        }
    }
}
