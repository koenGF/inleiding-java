package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdr9 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(20,20,160,160);
        int x = 40, y = 20, lengte = 20;
        while(true) {
            g.fillRect(x,y,lengte,lengte);
            y += 40;
            if(y >= 180) {
                x += 40;
                y = 20;
                if(x >= 180) break;
            }
        }

        x = 20;
        y= 40;
        while(true) {
            g.fillRect(x,y,lengte,lengte);
            y += 40;
            if(y >= 180) {
                x += 40;
                y = 40;
                if (x >= 180) break;
            }
        }
    }
}