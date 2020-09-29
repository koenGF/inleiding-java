package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H11Praktijk2 extends Applet {
    Button button;
    int tafel = 1;

    public void init() {
        button = new Button("OK");
        button.addActionListener(new ButtonListener());
        add(button);

    }

    public void paint(Graphics g) {
        int y = 50,keer = 1, result = 0;

        while(result < 100) {
            y+= 20;
            result = keer * tafel;
            g.drawString(keer + " x " + tafel + " = " + result,50,y);
            keer++;
        }
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel++;
            repaint();
        }
    }
}