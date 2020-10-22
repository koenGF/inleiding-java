package h14;
/*
deel een willekeurige kaart.

array 1: harten, ruiten, schoppen, klaver.
array 2: aas, 2, 3, 4, 5, 6, 7, 8, 9, 10, boer, koningin, koning.
willekeurige uit array 1 en uit array 2.
drawString
*/
import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public class H14Opdr1 extends Applet {
String[] kleuren = {"harten","ruiten","schoppen","klaver"};
String[] getallen = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "koningin", "koning"};
double r,s;
int kleurenWorp,getallenWorp;

    public void init() {
        r = Math.random();
        s = Math.random();
        kleurenWorp = (int)(r * 3);
        getallenWorp = (int)(s * 12);
    }

    public void paint(Graphics g) {
        g.drawString(kleuren[kleurenWorp] + " " + getallen[getallenWorp],0,10);
    }
}