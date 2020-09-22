package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Opdr5 extends Applet {
TextField tekstvak;
String tekst, g;
Double getal;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak.addActionListener( new tekstvakListener() );
        add(tekstvak);
        tekst = "";
    }

    public void paint (Graphics g) {
        g.drawString(tekst,50,50);
    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            g = tekstvak.getText();
            getal = Double.parseDouble(g);
            if ( getal > 5 ) {
                tekst = "voldoende";
            }
            else {
                tekst = "onvoldoende";
                repaint();
            }
        }
    }
}