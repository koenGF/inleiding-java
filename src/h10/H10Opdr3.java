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
        tekstvak.addActionListener( new TekstvakListener() );
        add(tekstvak);
        maand = "???";
        dagen = "???";
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
                    dagen = "31";
                    break;
                case 2:
                    maand = "Februari";
                    dagen = "28/29";
                    break;
                case 3:
                    maand = "Maart";
                    dagen = "31";
                    break;
                case 4:
                    maand = "April";
                    dagen = "30";
                    break;
                case 5:
                    maand = "Mei";
                    dagen = "31";
                    break;
                case 6:
                    maand = "Juni";
                    dagen = "30";
                    break;
                case 7:
                    maand = "Juli";
                    dagen = "31";
                    break;
                case 8:
                    maand = "Augustus";
                    dagen = "31";
                    break;
                case 9:
                    maand = "September";
                    dagen = "30";
                    break;
                case 10:
                    maand = "Oktober";
                    dagen = "31";
                    break;
                case 11:
                    maand = "November";
                    dagen = "30";
                case 12:
                    maand = "December";
                    dagen = "31";
                    break;
                default:
                    maand = "???";
                    dagen= "???";
                    break;
            }
            repaint();
        }
    }
}