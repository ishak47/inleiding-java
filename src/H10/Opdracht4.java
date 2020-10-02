package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {
    //declaratie
    TextField Tmaand;
    TextField Tjaar;
    Label label;
    double Dmaand;
    double Djaar;
    String Uitkomst;
    String Smaand;
    String Dagen;
    String Sjaar;

    public void init() {
        //initialisatie
        Uitkomst = "type een maand nummer !";
        Tmaand = new TextField("", 20);
        Tmaand.addActionListener(new schrikkeljaar());
        Smaand = "geen geldig getal";
        label = new Label("voer het maandnummer");
        Tjaar = new TextField("", 20);
        Tjaar.addActionListener(new schrikkeljaar());

        add(label);
        add(Tmaand);
        add(Tjaar);
    }

    public void paint(Graphics g) {
        g.drawString("" + Uitkomst, 20, 50);
        Tjaar.setLocation(190, 55);
    }

    class schrikkeljaar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Smaand = Tmaand.getText();
            Sjaar = Tjaar.getText();
            Dmaand = Double.parseDouble(Smaand);
            Djaar = Double.parseDouble(Sjaar);


            if (Dmaand == 1) {
                Smaand = "januari";
                Dagen = "31";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if ((Djaar % 4 == 0 && !(Djaar % 100 == 0)) || Djaar % 400 == 0 && Dmaand == 2) {
                Smaand = "Februari";
                Dagen = "29";
                Uitkomst = "uw gekozen maand en aantal dagen: " + Djaar + " " + Smaand + " en " + Dagen + " dagen.";
            }
            if (!(Djaar % 4 == 0 && !(Djaar % 100 == 0)) || Djaar % 400 == 0 && Dmaand == 2) {
                Smaand = "Februari";
                Dagen = "28";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 3) {
                Smaand = "maart";
                Dagen = "31";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 4) {
                Smaand = "april";
                Dagen = "30";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 5) {
                Smaand = "mei";
                Dagen = "31";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 6) {
                Smaand = "juni";
                Dagen = "30";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 7) {
                Smaand = "juli";
                Dagen = "31";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 8) {
                Smaand = "augustus";
                Dagen = "31";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 9) {
                Smaand = "september";
                Dagen = "30";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 10) {
                Smaand = "oktober";
                Dagen = "31";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 11) {
                Smaand = "november";
                Dagen = "30";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }

            if (Dmaand == 12) {
                Smaand = "december";
                Dagen = "31";
                Uitkomst = "uw gekozen jaar - maand en aantal dagen: " + Djaar +  Smaand + " en " + Dagen + " dagen.";
            }
            if (Dmaand >= 15) {
                Uitkomst = "maand bestaat niet";

            }

            repaint ();

            }
        }
    }
