package h12;
/*
DONE 5 tekstvakken met getallen in array, OK-knop.
DONE button listener.
parse als int. (maak int array, sort?)
sorteren van getallen, toon in tekstvakken
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class H12Opdr3 extends Applet {
    int teller = 0, i0,i1,i2,i3,i4;
    int[] getallen = {i0,i1,i2,i3,i4};
    TextField[] tekstvakken;
    Button OK;
    String s0,s1,s2,s3,s4;

    public void init() {
        tekstvakken = new TextField[5];
        OK = new Button("OK");
        OK.addActionListener(new KnopListener());
        while (teller < tekstvakken.length) {
            tekstvakken[teller] = new TextField("" + teller);
            add(tekstvakken[teller]);
            teller++;
        }
        add(OK);
        Arrays.sort(getallen);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s0 = tekstvakken[0].getText();
            s1 = tekstvakken[1].getText();
            s2 = tekstvakken[2].getText();
            s3 = tekstvakken[3].getText();
            s4 = tekstvakken[4].getText();
            i0 = Integer.parseInt(s0);
            i1 = Integer.parseInt(s1);
            i2 = Integer.parseInt(s2);
            i3 = Integer.parseInt(s3);
            i4 = Integer.parseInt(s4);
        }
    }
}