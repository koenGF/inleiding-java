package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Opdr5 extends Applet {
TextField tekstvak;
String tekst, g;
int getal;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak.addActionListener( new VakListener() );
        add(tekstvak);
        tekst = "";
    }

    public void paint (Graphics g) {
        g.drawString(tekst,20,20);
    }
    class VakListener implements ActionListener {
        public void actionperformed(ActionEvent e) {
            g = tekstvak.getText();
            getal = Integer.parseInt(g);
            if(getal >= 5.5 ) {
                tekst = "voldoende";
            }
            else {
                tekst = "onvoldoende";
                repaint();
            }
        }
    }
}