package h04;

import java.awt.*;
import java.applet.*;

public class Show3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.black);
        g.fillRect(10, 10, 20, 300);
        g.setColor(Color.red);
        g.fillRect(30,15,90,20);
        g.setColor(Color.white);
        g.fillRect(30,35,90,20);
        g.setColor(Color.blue);
        g.fillRect(30,55,90,20);


    }
}