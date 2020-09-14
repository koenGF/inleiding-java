package h06;

import java.awt.*;
import java.applet.*;

public class H6Opdr2 extends Applet{
int hour;
int day;
int year;

    public void init() {
        hour = 60 * 60;
        day = hour * 24;
        year = day * 365;
    }
    public void paint(Graphics g) {
setBackground(Color.orange);
g.setColor(Color.black);

g.drawString("er zitten " + hour + " seconden in een uur, " + day + " seconden in een dag en " + year + " seconden in een jaar.",20,20);


    }
}
