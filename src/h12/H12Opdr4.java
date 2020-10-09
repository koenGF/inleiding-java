package h12;

/*
DONE maak int array, tekstvak, OK-knop (en listener)
DONE zoek getal in tekstvak in array
true: print "found" en array
false: print "not found"

if else/switch met boolean is wss mooier
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12Opdr4 extends Applet {
    int y=20;
    int[] getallen = {2,5,13,15};
    String gevondenTekst, array;
    TextField tekstvak;
    Button knop;

    public void init() {
        tekstvak = new TextField ("", 5);
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("test" + gevondenTekst,50,50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int teller = 0;
            int gezocht;
            boolean gevonden = false;
            String s = tekstvak.getText();
            gezocht = Integer.parseInt(s);
            while(teller < getallen.length) {
                if(getallen[teller] == gezocht) {
                    gevonden = true;
                    gevondenTekst = "yippie";
                    break;
                }
                else {
                    gevonden = false;
                    gevondenTekst = "noo";
                    teller++;
                }
            }
            repaint();
            System.out.println(gevonden);
        }
    }
}