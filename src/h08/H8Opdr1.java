package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H8Opdr1 extends Applet {
    TextField tekstvak;
    Button knopOK;
    Button knopCancel;
    String s;

    public void init() {
        tekstvak = new TextField("type hier iets", 30);
        knopOK = new Button("OK");
        knopOK.addActionListener( new KnopOKListener() );
        knopCancel = new Button("cancel");
        knopCancel.addActionListener(new KnopCancelListener() );
        add(tekstvak);
        add(knopOK);
        add(knopCancel);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }


    class KnopOKListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }

    class KnopCancelListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }
}