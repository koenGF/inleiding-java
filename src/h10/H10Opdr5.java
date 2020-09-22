package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Opdr5 extends Applet {
TextField tekstvak;
String tekst, g;
Double getal,totaal,gemiddelde;
int aantalCijfers;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak.addActionListener( new tekstvakListener() );
        add(tekstvak);
        tekst = "";
        totaal = 0.0;
        aantalCijfers = 0;
        gemiddelde = 0.0;
    }

    public void paint (Graphics g) {
        g.drawString(tekst,50,50);
        g.drawString("het gemiddelde is: " + gemiddelde,50,70);
    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //getal
            g = tekstvak.getText();
            getal = Double.parseDouble(g);
            System.out.println(getal);

            //totaal
            totaal += getal;

            //aantalcijfers
            aantalCijfers++;

            //gemiddelde
            gemiddelde = totaal / aantalCijfers;

            if ( getal >= 5.5 ) {
                tekst = "voldoende";
            }
            else {
                tekst = "onvoldoende";
            }
            repaint();
        }
    }
}