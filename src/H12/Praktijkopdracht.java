package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    //int
    int[] nummers = new int[10];
    int weltonen = 10;
    int niettonen= 0;

    String[] namen = new String[10];
    Button ok = new Button("oke");

    //labels
    Label label = new Label("voer hier uw naar en telefoonnummer in");
    Label nlabel = new Label("naam : ");
    Label tlabel = new Label("telefoonnummer : ");

    //tekstvakken
    TextField tnaam = new TextField("",6);
    TextField tnummer = new TextField("",6);



    public void init() {
        setSize(600,600);
        ok.addActionListener(new OkListener());
        add(label);
        add(nlabel);
        add(tlabel);
        add(tnaam);
        add(tnummer);
        add(ok);
    }

    public void paint(Graphics g) {

        if (niettonen == 10){
            for (int n = 0; n < 10; n++){
                String nummer = (n + 1) + "";
                g.drawString("naam : " + namen[n] + " telefoonnummer : " + nummer,20,60 + (n + 1) * 15);
            }
        } else{
            g.drawString("nog " + weltonen + " telefoonnummers en namen in'tevullen",20,75);
        }
    }

    class OkListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("klik");
            namen [niettonen] = tnaam.getText();
            nummers[niettonen] = Integer.parseInt(tnummer.getText());
            weltonen--;
            niettonen++;
            repaint();

            tnummer.setText("");
            tnaam.setText("");
        }
    }

}
