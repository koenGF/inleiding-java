package h12;

import java.awt.*;
import java.applet.*;

public class H12Opdr1 extends Applet {
    int[] getallen = {1,2,3,4,5,6};
    double totaal;

    public void init() {
        totaal = 0;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller ++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);

            totaal += getallen[teller];
        }
        double gemiddelde = totaal / getallen.length;
        g.drawString("het gemiddelde is" + gemiddelde,50,getallen.length * 20 + 40);
    }
}