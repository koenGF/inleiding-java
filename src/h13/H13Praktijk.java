package h13;

import java.awt.*;
import java.applet.*;

public class H13Praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for (int i = 40; i <= 400; i+=90) {
        tekenBoom(g,i,50);
        tekenBoom(g,i,210);
        }
    }

    public void tekenBoom( Graphics g,int x, int y) {
        Color brown = new Color(145,41,3);
        g.setColor(brown);
        g.fillRoundRect(x,y,20,80,15,15);
        g.setColor(Color.green);
        g.fillOval(x-30,y-40,80,80);
    }
}