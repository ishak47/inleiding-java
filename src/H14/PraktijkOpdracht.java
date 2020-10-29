package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PraktijkOpdracht extends Applet {

    //initialisatie
    int ajax = 23;
    boolean turn = false;
    boolean lost = false;
    boolean gameover = false;

    TextField tekstvak = new TextField("", 5);
    Button speel = new Button("spelen");
    Button opnieuw = new Button("nieuwe spel");
    String tekst = "";
    String tekst1 = "voer getal 1, 2 of 3 in en druk op spelen";
    String aantalLogo = " er zijn nog: " + ajax + " ajax logo's ";
    String winnaar = "Winnaar!!";
    String verliezer = "VERLIEZER!";

    Image afbeelding;

    private URL pad;
    private AudioClip geluid;

    private URL trompetPad;
    private AudioClip trompetGeluid;

    public void init() {

        setSize(750, 560);

        tekst = tekst1;

        //geluid
        pad = PraktijkOpdracht.class.getResource("resources/");
        geluid = getAudioClip(pad, "applaus.wav");

        trompetPad = PraktijkOpdracht.class.getResource("resources/");
        trompetGeluid= getAudioClip(trompetPad, "Sad-Trombone-Gaming-Sound-Effect-_HD_.wav");

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
        g.drawString( aantalLogo , 68, 70);

        for (int a = 0; a < ajax; a++) {
            g.drawImage(afbeelding, 100 + 50 * (a % 4), 100 + 50 * (a / 4), 50, 50, this);
        }
    }

    int botspeelt(int spelerskeuze, int ajaxs) {
        int bot = 0;
        double random = Math.random() * 3 + 1;
        int r = (int) random;

        if (ajaxs == 23) {
            switch (spelerskeuze) {
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
        } else if (ajaxs == 19 || ajaxs == 15 || ajaxs == 11 || ajaxs == 7 || ajaxs == 3) {
            switch (spelerskeuze) {
                case 1:
                    bot = 1;
                case 2:
                    bot = r;
                case 3:
                    bot = 3;
            }
        } else if (ajaxs == 18 || ajaxs == 14 || ajaxs == 10 || ajaxs == 6 || ajaxs == 2) {
            switch (spelerskeuze) {
                case 1:
                    bot = r;
                    break;
                case 2:
                    bot = 3;
                case 3:
                    bot = 2;
            }
        } else {
            bot = r;
        }
        return bot;
    }

     class speler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int spelerzet = 0 ;
            int bot = 0;

            if(Integer.parseInt(tekstvak.getText()) == 1 || Integer.parseInt(tekstvak.getText()) == 2 || Integer.parseInt(tekstvak.getText()) ==3) {
                spelerzet = Integer.parseInt(tekstvak.getText());
                bot = botspeelt(spelerzet,ajax);

                turn = true;
                ajax -= spelerzet;
                if (ajax <= 0 && gameover == false) {
                    if (true == true) {
                        lost = true;
                        gameover = true;
                    }
                }
                turn = false;
                ajax -= bot;
                if (ajax <= 0 && gameover == false) {
                    lost = false;
                    gameover = true;
                }

                tekst = "Bot pakte " + bot + " Smileys weg te halen";

            }else {
                tekst = " ERROR. dit is een ongeldige getal. kies een getal tussen de 1 en 3 ";
                repaint();
            }

            if (gameover == true) {
                if (lost == false) {
                    tekst = winnaar;
                } else {
                    tekst = verliezer;
                }
            }

            aantalLogo = " er zijn nog: " + ajax + " ajax logo's ";

            if (ajax <= 0 ){
                aantalLogo= "";
            }
            if (tekst == winnaar){
                geluid.play();
            }
            if (tekst == verliezer){
                trompetGeluid.play();
            }

            tekstvak.setText("");
            repaint();
        }
    }
        class opnieuwListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                ajax = 23;
                aantalLogo = " er zijn nog: " + ajax + " ajax logo's ";
                tekstvak.setText("");
                tekst = tekst1;
                gameover = false;
                lost = false;
                turn = true;
                repaint();
            }
        }
    }
