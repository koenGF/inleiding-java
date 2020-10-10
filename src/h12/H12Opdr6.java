package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
erray en tekstvak.
inhoud tekstvak is inhoud van ieder vak in array.
print getal en aantal vakken

 */
public class H12Opdr6 extends Applet {
    int[] getallen = {1,2,3,4,5};
    int i = 0;
    TextField tekstvak;


    public void init() {
        getallen = new int[5];
        tekstvak = new TextField ("", 5);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("De waarde is " + getallen[0] + ".",150,50);
        g.drawString("het komt " + getallen.length + " keer voor.",150,70);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            i = Integer.parseInt(s);
            for(int teller = 0; teller < getallen.length; teller++) {
                getallen[teller] = i;
            }
            repaint();
        }
    }
}