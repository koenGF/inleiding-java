package h06;

import java.awt.*;
import java.applet.*;

public class H6Opdr3 extends Applet{
    int a;
    int b;
    int c;

    public void init() {
        a = 2147483647;
        b = 2;
        c = a + b;

    }
    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.black);

        g.drawString("" + c,20,20);

    }
}
