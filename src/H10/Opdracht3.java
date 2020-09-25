package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    //declareren
    TextField Tmaand;
    Label label;
    Double Dmaand;
    String Uitkomst;
    String Smaand;
    String Dagen;
    Button ok;

    public void init() {
    Tmaand = new TextField("",20);
    Tmaand.addActionListener(new maandnummer());
    Smaand = "geen geldig getal";
    label= new Label("voer het maandnummer");

    //buttons
    add(label);
    add(Tmaand);

    }

    public void paint(Graphics g) {
    setBackground(Color.cyan);
    g.drawString("de maand is : ",20,50);
    }

    class maandnummer implements ActionListener{
        public void actionPerformed(ActionEvent e) {
          Smaand= Tmaand.getText();
          Dmaand=Double.parseDouble(Smaand);

        if (Dmaand == 1){
            Smaand= "januari";
            Dagen= "31";
            Uitkomst="uw gekozen maand + totaal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 2){
            Smaand="februari";
            Dagen= "28 of 29";
            Uitkomst="uw gekozen maand + totaal dagen : " + Smaand+ "en" + Dagen + "dagen";
            }

        if (Dmaand== 3){
            Smaand="maart";
            Dagen="31";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 4){
            Smaand="april";
            Dagen="30";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 5){
            Smaand="mei";
            Dagen="31";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 6){
            Smaand="juni";
            Dagen="30";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 7){
            Smaand="juli";
            Dagen="31";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 8){
            Smaand="augustus";
            Dagen="31";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 9){
            Smaand="september";
            Dagen="30";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
            }

        if (Dmaand== 10){
            Smaand="oktober";
            Dagen="31";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 11){
            Smaand="november";
            Dagen="30";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
             }

        if (Dmaand== 12){
            Smaand="december";
            Dagen="31";
            Uitkomst= "uw gekozen maand + aantal dagen : " + Smaand+ "en" + Dagen + "dagen";
            }
        repaint();
        }
    }
}
