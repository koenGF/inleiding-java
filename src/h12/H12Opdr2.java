package h12;

import java.awt.*;
import java.applet.*;

public class H12Opdr2 extends Applet {
int teller =0;
Button[] knoppen;

    public void init() {
        knoppen = new Button [25];

        while(teller < knoppen.length) {
            knoppen[teller] = new Button("button" + teller);
            add(knoppen[teller]);
            teller++;
        }
    }
}