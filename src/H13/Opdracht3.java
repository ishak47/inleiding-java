package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    //declaratie
    int muur = 0;
    Button stenen= new Button("stenen muur");
    Button beton= new Button("betonnen muur");
    Button reset= new Button("reset");

    public void init() {

    setSize(1130,630);

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
                Stenenmuur(g, 0, 0, 1130, 630);
                break;
            case 2:
                betonMuur(g, 0, 0, 1130, 630);
                break;
            default:
                break;

        }
    }

    void  Stenenmuur (Graphics g, int x, int y, int w, int h){

    g.setColor(new Color(100, 100, 100));
    g.fillRect(x,y,w,h);
    g.setColor(new Color(150, 50, 50));

    //  bakstenen
    for (int teller = 0; teller <= ((h-3) / 18) - 1; teller++ ){
        if (teller % 2==0) {
            for (int a = 0; a <= ((w - 3) / 33) - 1; a++) {
                g.fillRect((x + 3) + 33 * a, (y + 3) + 18 * teller, 30, 15);
            }
        }else {
            for (int c = 0; c <= ((w - 3) / 33) - 2; c++) {
                g.fillRect((x + 21) + 33 * c, (y + 3) + 18 * teller, 30, 15);
                g.fillRect((x + 3), (y + 3) + 18 * teller, 15, 15);
                g.fillRect(x + (((w - 3) / 33) * 33 - 12), (y + 3) + 18 * teller, 12, 15);
            }
        }
    }
}

    void betonMuur ( Graphics g , int x, int y, int w, int h){

        g.setColor(new Color(0, 0, 0));
        g.fillRect(x,y,w,h);
        g.setColor(new Color(95, 92, 92));

        for (int teller = 0; teller <= ((h-5) / 50) - 1; teller++ ){
            if (teller % 2==0) {
                for (int a = 0; a <= ((w - 5) / 95) - 1; a++) {
                    g.fillRect((x + 5) + 95 * a, (y + 5) + 50 * teller, 80, 40);
                }
            }else {
                for (int c = 0; c <= ((w - 5) / 50) - 2; c++) {
                    g.fillRect((x + 55) + 95 * c, (y + 5) + 50 * teller, 80, 40);
                    g.fillRect((x + 5), (y + 5) + 50 * teller, 40, 40);
                    g.fillRect(x + (((w - 5) / 95) * 95 - 40), (y + 5) + 50 * teller, 40, 40);
                }
            }
        }
    }

    class stenen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muur = 1;
            repaint();
        }

    }

    class beton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muur = 2;
            repaint();
        }
    }

    class reset implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muur = 0;
            repaint();
        }
    }
}
