package h04;

import java.awt.*;
import java.applet.*;

public class Show6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.black);
        g.fillRect(50, 50, 100, 300);

        //red
        g.setColor(Color.red);
        g.fillOval(55,55,90,90);

        //yellow
        g.setColor(Color.yellow);
        g.fillOval(55,155,90,90);

        //green
        g.setColor(Color.green);
        g.fillOval(55,255,90,90);
    }
}