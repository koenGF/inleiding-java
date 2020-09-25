package h11;

import java.awt.*;
import java.applet.*;

public class H11Opdr1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller <= 10) {
            x += 20;
            g.drawLine(x , 50, x, 300 );
            g.drawString("" + teller,x,40);
            teller++;
        }
    }
}