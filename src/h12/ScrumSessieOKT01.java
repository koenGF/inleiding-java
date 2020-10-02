package h12;
/*
tellen
deelbaar door 2? teken
deelbaar door 6? teken kwadraat
teken totaal
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ScrumSessieOKT01 extends Applet {
int teller,totaal,y=20,hoogste;
int[] getallen;
TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 5);
        add(tekstvak);
        tekstvak.addActionListener(new TekstvakListener());
        getallen = new int[30];
    }

    public void paint(Graphics g) {
        g.drawString("" + teller, 50, y );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            hoogste = Integer.parseInt( s );

            for(teller = 2; teller < hoogste; teller+=2) {
                y += 20;
                if(teller % 6 == 0)
                System.out.println(teller);
            }
        }
    }
}