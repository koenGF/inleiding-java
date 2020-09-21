package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10Opdr4 extends Applet{
    TextField tekstvakMaand, tekstvakJaar;
    String maand, dagen, m,j;
    int maandGetal,jaarGetal;
    Button button;

    public void init() {
        tekstvakMaand = new TextField("month",5);
        tekstvakJaar = new TextField("Jaar",5);
        button = new Button("OK");
        button.addActionListener(new buttonListener() );
        add(tekstvakMaand);
        add(tekstvakJaar);
        add(button);
        maand = "???";
        dagen = "???";
    }

    public void paint (Graphics g){
        g.drawString(maand + ", heeft " + dagen + " dagen.",50,50);
    }
    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m = tekstvakMaand.getText();
            maandGetal = Integer.parseInt(m);
            j = tekstvakJaar.getText();
            jaarGetal = Integer.parseInt(j);
            switch(maandGetal) {
                case 1:
                    maand = "Januari";
                    dagen = "31";
                    break;

                case 2:
                    maand = "Februari";
                    if ( (jaarGetal % 4 == 0 && !(jaarGetal % 100 == 0)) ||
                            jaarGetal % 400 == 0 ) {
                    dagen = "29" ;
                    }
                    else {
                        dagen= "28";
                    }

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