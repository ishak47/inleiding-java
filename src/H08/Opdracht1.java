package H08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    //declareren
    Button okknop;
    Button resetknop;
    TextField tekstvak;



    public void init() {
    okknop= new Button("klik op mij!");
    tekstvak= new TextField("",40);
    add(okknop);
    add(tekstvak);
    okknop.addActionListener(new TextToTerminal());
    }


    public void paint(  Graphics g) {
        okknop.setLocation(20,20);
        tekstvak.setLocation(20,60);
        okknop.setLabel("schrijf iets hieronder");
        okknop.setSize(300,40);
        tekstvak.setSize(300,40);
    }

    class TextToTerminal implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("knopklik");
        }
    }

}
