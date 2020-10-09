package h12;
/*
5 tekstvakken met getallen in array, OK-knop.
button listener.
parse als int. maak int array, sort
verander in string, toon in tekstvakken
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class H12Opdr3 extends Applet {
    int teller = 0;
    int[] getallen = {0,0,0,0,0};
    TextField[] tekstvakken;
    Button OK;
    String s0,s1,s2,s3,s4, result0,result1,result2,result3,result4;

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
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s0 = tekstvakken[0].getText();
            s1 = tekstvakken[1].getText();
            s2 = tekstvakken[2].getText();
            s3 = tekstvakken[3].getText();
            s4 = tekstvakken[4].getText();
            getallen[0] = Integer.parseInt(s0);
            getallen[1] = Integer.parseInt(s1);
            getallen[2] = Integer.parseInt(s2);
            getallen[3] = Integer.parseInt(s3);
            getallen[4] = Integer.parseInt(s4);
            Arrays.sort(getallen);
            result0 = Integer.toString(getallen[0]);
            result1 = Integer.toString(getallen[1]);
            result2 = Integer.toString(getallen[2]);
            result3 = Integer.toString(getallen[3]);
            result4 = Integer.toString(getallen[4]);
            tekstvakken[0].setText(result0);
            tekstvakken[1].setText(result1);
            tekstvakken[2].setText(result2);
            tekstvakken[3].setText(result3);
            tekstvakken[4].setText(result4);
        }
    }
}