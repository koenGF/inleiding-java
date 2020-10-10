package h12;

/*
hij stopt volgens mij al als hij het goede getal heeft gevonden. zit break; onder if.
*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H12Opdr5 extends Applet {
    int[] getallen = {2,5,15,17};
    boolean gevonden = false;
    String gevondenTekst = "";
    TextField tekstvak;
    Button knop;

    public void init() {
        tekstvak = new TextField ("0", 5);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        int drawTeller, y=70;
        g.drawString("" + gevondenTekst,150,50);

        if (gevonden) {
            for(drawTeller = 0; drawTeller < getallen.length; drawTeller++) {
                y += 20;
                g.drawString("" + getallen[drawTeller], 150, y);
            }
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int gezocht,teller=0;
            String s = tekstvak.getText();
            gezocht = Integer.parseInt(s);
            while(teller < getallen.length) {
                if(getallen[teller] == gezocht) {
                    gevonden = true;
                    gevondenTekst = s + " was found in the array";
                    break;
                }
                else {
                    gevonden = false;
                    gevondenTekst = s+ " was not found in the array";
                    teller++;
                }
            }
            repaint();
            System.out.println(gevonden);
        }
    }
}