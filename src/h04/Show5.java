package h04;

import java.awt.*;
import java.applet.*;

public class Show5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(100,100,200,200,90,360);
    }
}