package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdr3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 1;
        int x = 0;

        while(teller < 100) {
            x += 20;
            g.drawString("" + teller, x, 20 );
            teller += teller;
        }
    }
}