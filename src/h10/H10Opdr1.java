package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Opdr1 extends Applet {

    int getal,a,b,c,d,e;
    TextField tekstvak;
    String tekst;
    Label label1, label2, label3, label4;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener( new VakListener() );
        label1 = new Label("");
        label2 = new Label("");
        label3 = new Label("");
        label4 = new Label("");
        tekst = "";
        add( tekstvak );
        add(label1);
        add(label2);
        add(label3);
        add(label4);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);

    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;
            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if ( getal > a && getal> b && getal > c && getal > d) {
                tekst = "hoera";
            }
            else {
                tekst = "bleh";
            }
            repaint();
        }
    }
}