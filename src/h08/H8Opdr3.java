package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8Opdr3 extends Applet {
    TextField tekstvak;
    Button knop;
    Double Prijs;
    Double PrijsBTW;


    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener( new TekstvakListener() );
        knop = new Button("OK");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        PrijsBTW = Prijs * 1.21;
        g.drawString(PrijsBTW + " euro", 20, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            Prijs = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }

    class TekstvakListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            Prijs = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}