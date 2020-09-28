//zijn er 50 als ik goed heb gerekent maar ik ga het niet tellen
package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdr7 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 300, y = 300, diameter = 5;

        while(diameter <= 495) {
            x -= 5;
            y -= 5;
            diameter += 10;
            g.drawOval(x,y,diameter,diameter);
        }
    }
}