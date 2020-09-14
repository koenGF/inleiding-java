package h06;

import java.awt.*;
import java.applet.*;

public class H6Opdr1 extends Applet {
    double geld;
    int mensen;
    double uitkomst;

    public void init() {
        geld = 113;
        mensen = 4;
        uitkomst = geld / mensen;
    }

    public void paint(Graphics g){
        setBackground(Color.orange);
        g.setColor(Color.black);

        g.drawString("Iedereen krijgt " + uitkomst + " euro.",20,20);


    }
}