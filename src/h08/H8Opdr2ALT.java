package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H8Opdr2ALT extends Applet {
    Button Man, Vrouw, PotentielMan, PotentielVrouw;
    int man, vrouw, potentielMan, potentielVrouw, totaal;

    public void init() {
        Man = new Button("+1 Man");
        Vrouw = new Button("+1Vrouw");
        PotentielMan = new Button("+1 Potentiele Man");
        PotentielVrouw = new Button("+1 Potentiele Vrouw");
        Man.addActionListener( new ManListener() );
        Vrouw.addActionListener( new VrouwListener() );
        PotentielMan.addActionListener( new PotentielManListener() );
        PotentielVrouw.addActionListener( new PotentielVrouwListener() );
        add(Man);
        add(Vrouw);
        add(PotentielMan);
        add(PotentielVrouw);
    }

    public void paint(Graphics g) {
        g.drawString(man + " mannen", 50, 60 );
        g.drawString(vrouw + " vrouwen", 50, 80);
        g.drawString(potentielMan + " potentiele mannelijke studenten",50,100);
        g.drawString(potentielVrouw + " potentiele vrouwelijke studenten",50,120);
        totaal = man + vrouw + potentielMan + potentielVrouw;
        g.drawString(totaal + " totaal", 50, 140);
    }



    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man ++;
            repaint();
        }
    }
    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw ++;
            repaint();
        }
    }
    class PotentielManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potentielMan ++;
            repaint();
        }
    }
    class PotentielVrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potentielVrouw ++;
            repaint();
        }
    }
}