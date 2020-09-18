//TODO: dagen en maanden in switch

package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Opdr3 extends Applet{
    TextField tekstvak;
    String maand, dagen, s;
    int maandGetal;

    public void init() {
        tekstvak = new TextField("",5);
    }

    public void paint (Graphics g){
        g.drawString(maand + ", heeft " + dagen + " dagen.",50,50);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maandGetal = Integer.parseInt( s);
            switch(maandGetal) {
                case 1:
                    maand = "Januari";
                    break;
                case 2:
                    maand = "Februari";
                    break;
                case 3:
                    maand = "Maart";
                    break;
                case 4:
                    maand = "April";
                    break;
                case 5:
                    maand = "Mei";
                    break;
                case 6:
                    maand = "Juni";
                    break;
                case 7:
                    maand = "Juli";
                    break;
                case 8:
                    maand = "Augustus";
                    break;
                case 9:
                    maand = "September";
                    break;
                default:
                    maand = "???";
                    break;
            }
            repaint();
        }
    }
}