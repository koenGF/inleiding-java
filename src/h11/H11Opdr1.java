package h11;

import java.awt.*;
import java.applet.*;

public class H11Opdr1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 1; teller <= 10; teller++) {
            x += 20;
            g.drawLine(x , 50, x, 300 );
            g.drawString("" + teller,x,40);
        }
    }
}