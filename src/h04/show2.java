package h04;

import java.awt.*;
import java.applet.*;

public class show2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.black);
        g.drawRect(100,200,200,200);
        g.drawLine(50,200,350,200);
        g.drawLine(50,200,200,100);
        g.drawLine(200,100,350,200);
        g.drawRect(188,350,25,50);
        g.fillRect(125,225,150,100);
    }
}