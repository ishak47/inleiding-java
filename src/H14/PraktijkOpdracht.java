package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    int ajax = 23;
    boolean error = false;
    boolean turn = false;
    boolean lost = false;
    boolean gameover = false;

    TextField tekstvak = new TextField("",5);
    Button speel = new Button("spelen");
    Button opnieuw = new Button("nieuwe spel");
    String tekst = "";
    String tekst1 = "voer 1, 2 of 3 in en druk op speel";
    String winnaar = "Winnaar!!";

    public AudioClip sound;
    private Image afbeelding;



    public void init() {

    }

    public void paint(Graphics g) {

    }
}
