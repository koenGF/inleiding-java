package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H11Praktijk1 extends Applet {
    TextField tekstvak;
    Button button;
    int tafel = 1;

    public void init() {
        tekstvak = new TextField("", 5);
        button = new Button("OK");
        button.addActionListener(new ButtonListener());
        add(tekstvak);
        add(button);

    }

    public void paint(Graphics g) {
        int y = 50,keer = 1, result;

        while(keer <= 10 && tafel <= 10) {
            y+= 20;
            result = keer * tafel;
            g.drawString(keer + " x " + tafel + " = " + result,50,y);
            keer++;
        }
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            tafel = Integer.parseInt(s);
            repaint();
        }
    }
}