//kon waarschijnlijk veel makkelijker als ik gewoon drawRect had gebruikt en die dan had verschoven. ach ja
package h11;

import java.awt.*;
import java.applet.*;


public class H11Opdr5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int vertX = 20,vertY1 = 10,vertY2 = 30,horiX1 = 10,horiX2 = 30,horiY = 20;

        //linksboven
        g.drawLine(10,10,20,10);
        g.drawLine(10,10,10,20);

        //rechtsonder
        g.drawLine(60,50,60,60);
        g.drawLine(50,60,60,60);

        while(vertY2 <= 60 && horiX2 <= 60) {
            g.drawLine(vertX,vertY1,vertX,vertY2);
            vertX += 10;
            vertY1 += 10;
            vertY2 += 10;

            g.drawLine(horiX1,horiY,horiX2,horiY);
            horiX1 += 10;
            horiX2 += 10;
            horiY += 10;
        }
    }
}