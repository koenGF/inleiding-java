package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Praktijk extends Applet {
TextField tekstvak;
String tekst,g;
int getal;

    public void init() {
        tekstvak = new TextField("",5);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);
        tekst = "";
    }

    public void paint (Graphics g) {
        g.drawString(tekst, 50, 50);
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            g = tekstvak.getText();
            getal = Integer.parseInt(g);
            switch(getal) {
                case 1:
                case 2:
                case 3:
                    tekst = "slecht";
                    break;

                case 4:
                    tekst = "onvoldoende";
                    break;

                case 5:
                    tekst = "matig";
                    break;

                case 6:
                case 7:
                    tekst = "voldoende";
                    break;

                case 8:
                case 9:
                case 10:
                    tekst = "goed";
                    break;

                default:
                    tekst = "verkeerd cijfer";
                    break;
            }
            repaint();
        }
    }
}
