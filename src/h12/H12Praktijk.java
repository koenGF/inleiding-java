package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

/*
2 tekstvakken, OK knop.
namen array, telefoon nummers array.

inhoud tekstvakken wordt aan arrays gebundeld. [0], daarna ++.
zodra array[10] inhoud heeft, print namen en telefoon nummers.

nu blijft hij namen[0] vullen, hij telt niet.
 */
public class H12Praktijk extends Applet {
    int y,i=0;
    TextField namenTekstvak,telefoonNummersTekstvak;
    Button knop;
    String[] telefoonNummers, namen;


    public void init() {
        namen = new String[10];
        telefoonNummers = new String[10];
        namenTekstvak = new TextField ("", 8);
        telefoonNummersTekstvak = new TextField("nummer",11);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(namenTekstvak);
        add(telefoonNummersTekstvak);
        add(knop);


    }

    public void paint(Graphics g) {
        if(i > 8) {
            g.drawString("hoi", 50, 50);
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String naam = namenTekstvak.getText();
            for (int i = 0;i < namen.length; i++) {
               namen[i] = naam;
            }
            System.out.println(namen[0]);
            repaint();
        }
    }
}