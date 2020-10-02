package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class H12Opdr2 extends Applet {
int teller =0;
Button[] knoppen = {};

    public void init() {
        knoppen = new Button [25];
        add(knoppen[teller]);
    }

    public void paint(Graphics g) {
        while(teller < knoppen.length) {
            add(knoppen[teller]);
            teller++;
        }
    }
}