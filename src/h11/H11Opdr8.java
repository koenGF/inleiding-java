package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdr8 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 5, y = 5, diameter = 5;

        while(diameter <= 995) {
            diameter += 10;
            g.drawOval(x,y,diameter,diameter);
        }
    }
}