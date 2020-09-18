package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Opdr1 extends Applet {

    int getal, prevGetal;
    TextField tekstvak;
    String tekst;
    Label label;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        label = new Label("0");
        tekst = "";
        add( tekstvak );
        add(label);


    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);

    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String getalString, prevGetalString;
            getalString = tekstvak.getText();
            getal = Integer.parseInt( getalString );
            prevGetalString = label.getText();
            prevGetal = Integer.parseInt(prevGetalString);
            if ( getal > prevGetal) {
                tekst = "hoogste getal is: " + getalString;
                label.setText(getalString);
            }
            else {
                tekst = "hoogste getal is: " + prevGetalString;
                label.setText(prevGetalString);
            }
            repaint();
        }
    }
}