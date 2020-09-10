package h04;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(100, 200, 300, 200);
        g.drawLine(100, 200, 200, 27);
        g.drawLine(300, 200, 200, 27);
    }
}