package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdr2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 20;
        int x = 0;

        while(teller > 10) {
            x += 20;
            g.drawString("" + teller, x, 20 );
            teller--;
        }
    }
}