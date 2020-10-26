package h14;
/*
DONE maak tekstvak & methode om donuts te tekenen.
DONE tel aantal in tekstvak af van totaal donuts
DONE bij 0, stop spel

maak switch voor aantal donuts, kies zo wat de computer doet.

OF

maak loop.
als aantalDonuts - 1 % 4, doe dat
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H14Praktijk extends Applet {
    int aantalDonuts = 23;
    TextField tekstvak;
    Label label;
    Button knop;

    public void init() {
        label = new Label("1, 2 of 3 donuts?");
        tekstvak = new TextField ("", 10);
        knop = new Button ("reset");
        tekstvak.addActionListener(new TekstvakListener());
        knop.addActionListener(new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
//teken donuts
        g.drawString("er zijn " + aantalDonuts + " donuts.",5,50);
        for (int i = 0, x = 10; i < aantalDonuts; i++, x+=65) {
            tekenDonut(g, x,100);
        }
//einde spel
        if(aantalDonuts <= 0) {
            tekstvak.setText("je hebt verloren!");
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int donutsTaken = Integer.parseInt(s);
//check getal
            if (donutsTaken >= 1 && donutsTaken <= 3) {
                aantalDonuts = aantalDonuts - donutsTaken;
//computer turn
                if(aantalDonuts > 5) {
                    for (int i = 1; i <= 3; i++) {
                        int testDonut = aantalDonuts - i;
                        if ((testDonut - 1) % 4 <= 0) {
                            aantalDonuts -= i;
                        }
                    }
                }
//aantalDonuts < 5
                else {
                    aantalDonuts = 1;
                }
                repaint();
            }
//fout getal
            else {
                tekstvak.setText("fout getal");
            }
        }
    }
//resetknop
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        aantalDonuts = 23;
        tekstvak.setText("");
        repaint();
        }
    }
            public void tekenDonut( Graphics g,int x, int y) {
        g.setColor(Color.pink);
        g.fillOval(x,y,60,60);
        g.setColor(Color.white);
        g.fillOval(x+20,y+20,20,20);
        g.setColor(Color.blue);
        g.drawLine(x+30,y+50,x+35,y+47);
        g.drawLine(x+40,y+10,x+43,y+11);
        g.drawLine(x+10,y+30,x+12,y+33);
        g.drawLine(x+45,y+32,x+48,y+35);
        g.drawLine(x+15,y+17,x+18,y+13);
    }
}