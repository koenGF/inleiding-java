package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdr3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int prev2Getal = 1, prevGetal = 1, currentGetal, x = 60;

        g.drawString("" + prev2Getal,20,20);
        g.drawString("" + prevGetal,40,20);
        while(true) {
            currentGetal = prevGetal + prev2Getal;
            if (currentGetal > 200) break;
            g.drawString("" + currentGetal, x, 20 );
            x += 20;
            prev2Getal = prevGetal;
            prevGetal = currentGetal;
        }
    }
}