package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PraktijkOpdracht extends Applet {

    TextField tekstvak = new TextField("", 5);
    Button speel = new Button("spelen");
    Button opnieuw = new Button("nieuwe spel");
    String tekst = "";
    String tekst1 = "voer getal 1, 2 of 3 in en druk op spelen";
    String winnaar = "Winnaar!!";

    int ajax = 23;
    boolean error = false;
    boolean turn = false;
    boolean lost = false;
    boolean gameover = false;

    Image afbeelding;

    public void init() {

        setSize(750, 560);

        tekst = tekst1;

        //knoppen
        speel.addActionListener(new speler());
        opnieuw.addActionListener(new opnieuwListener());
        add(tekstvak);
        add(speel);
        add(opnieuw);

        //ajax logo
        URL pad = PraktijkOpdracht.class.getResource("./resources/");
        afbeelding = getImage(pad, "ajax logo.png");
    }

    public void paint(Graphics g) {

        g.drawString(tekst, 70, 50);
        g.drawString("er zijn nog: " + ajax + " ajax logo's ", 68, 70);

        for (int a = 0; a < ajax; a++) {
            g.drawImage(afbeelding, 100 + 50 * (a % 4), 100 + 50 * (a / 4), 50, 50, this);
        }
    }

    int bot (int spelerskeuze, int ajaxs) {
        int bot = 0;
        double random = Math.random() * 3 + 1;
        int r = (int) random;

        if (ajaxs == 23) {
            switch (bot) {
                case 1:
                    bot = 1;
                    break;
                case 2:
                    bot = r;
                    break;
                case 3:
                    bot = 3;
                    break;
            }
        } else if (ajaxs == 21 || ajaxs == 17 || ajaxs == 13 || ajaxs == 9 || ajaxs == 5) {
            switch (spelerskeuze) {
                case 1:
                    bot = 3;
                    break;
                case 2:
                    bot = 2;
                    break;
                case 3:
                    bot = 1;
                    break;
            }
        } else if (ajaxs == 20 || ajaxs == 16 || ajaxs == 12 || ajaxs == 8 || ajaxs == 4) {
            switch (spelerskeuze) {
                case 1:
                    bot = 2;
                    break;
                case 2:
                    bot = 1;
                case 3:
                    bot = r;
                    break;
            }
        }else if (ajaxs == 19 || ajaxs == 15 || ajaxs == 11 || ajaxs == 7 || ajaxs == 3) {
            switch (spelerskeuze) {
                case 1:
                    bot = 1;
                case 2:
                    bot = r;
                case 3:
                    bot = 3;
            }
        }else if (ajaxs == 18 || ajaxs == 14 || ajaxs == 10 || ajaxs == 6 || ajaxs == 2) {
            switch (spelerskeuze) {
                case 1:
                    bot = r;
                    break;
                case 2:
                    bot = 3;
                case 3:
                    bot = 2;
            }
        }else {
            bot = r;
        }
        return bot;
    }

    private class speler implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        }
    }
    class opnieuwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekst1 = tekst1;
            ajax = 23;
            lost = false;
            gameover = false;
            turn = true;
            repaint();
        }
    }
}