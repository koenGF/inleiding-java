package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdr6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 100, y = 100, diameter = 10;

        while(diameter <= 100) {
            x -= 10;
            y -= 10;
            diameter += 20;
            g.drawOval(x,y,diameter,diameter);
        }
    }
}