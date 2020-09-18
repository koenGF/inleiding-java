package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Opdr2 extends Applet {

    int getal, prevHighGetal, prevLowGetal;
    TextField tekstvak;
    String highTekst;
    String lowTekst;
    Label highLabel;
    Label lowLabel;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        highLabel = new Label("0");
        lowLabel = new Label("0");
        highTekst = "";
        add( tekstvak );
        add(highLabel);
        add(lowLabel);

    }

    public void paint(Graphics g) {
        g.drawString(highTekst, 50, 50);
        g.drawString(lowTekst,50,70);
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            //HIGH
            String getalString, prevHighGetalString, prevLowGetalString;
            getalString = tekstvak.getText();
            getal = Integer.parseInt( getalString );
            prevHighGetalString = highLabel.getText();
            prevHighGetal = Integer.parseInt(prevHighGetalString);
            if ( getal > prevHighGetal) {
                highTekst = "hoogste getal is: " + getalString;
                highLabel.setText(getalString);
            }
            else {
                highTekst = "hoogste getal is: " + prevHighGetalString;
                highLabel.setText(prevHighGetalString);
            }


            //LOW
            prevLowGetalString = lowLabel.getText();
            prevLowGetal = Integer.parseInt(prevLowGetalString);

            if (getal < prevLowGetal) {
                lowTekst = "laagste getal is: " + getalString;
                lowLabel.setText(getalString);
            }
            else {
                lowTekst = "laagste getal is: " + prevLowGetalString;
                lowLabel.setText(prevLowGetalString);
            }
            repaint();
        }
    }
}