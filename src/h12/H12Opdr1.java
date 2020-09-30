package h12;

import java.awt.*;
import java.applet.*;

public class H12Opdr1 extends Applet {
    int[] getallen = {50,37,48,19,48,30,11,70,135,456};

    public void init() {
        getallen = new int [10];

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getallen.length; teller ++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);

            int totaal = getallen[teller] += ;
            int gemiddelde = totaal / getallen.length;
            g.drawString("het gemiddelde is" + gemiddelde,50,200);
        }
    }
}