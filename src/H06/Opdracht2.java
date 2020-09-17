package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int uur,dag,jaar,seconden,minuut;

    public void init() {
    seconden=1;
    minuut=seconden*60;
    uur=minuut*60;
    dag=uur*24;
    jaar=dag*365;
    }


    public void paint(Graphics g) {
    g.drawString("je hebt zoveel seconden per uur:"+uur,20,20);
    g.drawString("je hebt zoveel seconden per dag:"+dag,20,40);
    g.drawString("je hebt zoveel seconden per jaar:"+ jaar,20,60);
    }

}