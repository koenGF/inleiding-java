package h04;

import java.awt.*;
import java.applet.*;

public class Show7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        //die
        g.drawRect(50,50,100,100);
        g.drawRoundRect(50,50,100,100,25,25);

        //eyes
        g.fillOval(60,60,20,20);
        g.fillOval(120,120,20,20);
        g.fillOval(60,120,20,20);
        g.fillOval(120,60,20,20);

    }
}
