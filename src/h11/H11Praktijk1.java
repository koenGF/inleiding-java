//er is iets fout in de volgorde waarschijnlijk
package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H11Praktijk1 extends Applet {
    TextField tekstvak;
    Button button;
    String s = "";
    int tafel;

    public void init() {
        tekstvak = new TextField("", 5);
        button = new Button("OK");
        button.addActionListener(new ButtonListener());
        add(tekstvak);
        add(button);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tafel = Integer.parseInt(s);
        }
    }

    public void paint(Graphics g) {
        int y = 0,keer = 1, result = 50;

        while(result <= 100) {
            result = keer * tafel;
            y+= 20;
            g.drawString("" + result,50,y);
            keer++;
        }
    }
}