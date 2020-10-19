package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
    setSize(1050,600);
    }

    public void paint(Graphics g) {
    StenenMuur (g,20,20,1000,480);
    }

    void  StenenMuur (Graphics g, int x, int y, int w, int h){

    //kleur baksteen
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
}

